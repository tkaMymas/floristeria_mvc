package com.spring.floristeria_mvc.controladores;

import com.spring.floristeria_mvc.entidades.Entrega;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.spring.floristeria_mvc.repositorios.EntregaRepository;
import com.spring.floristeria_mvc.repositorios.PedidoRepository;

import java.util.List;

@Controller
@RequestMapping("/entregas")
public class EntregaController {
    @Autowired
    private EntregaRepository entregaRepository;
    @Autowired
    private PedidoRepository pedidoRepository;

    @GetMapping
    public String listarEntregas(Model model){
        model.addAttribute("titulo", "ENTREGAS");
        List<Entrega> entregas = entregaRepository.findAll();
        model.addAttribute("entregas", entregas);
        return "entregas";
    }

    @GetMapping("/nueva")
    public String mostrarFormularioNuevaEntrega(Model model) {
        model.addAttribute("entrega", new Entrega());
        model.addAttribute("pedidos", pedidoRepository.findAll());
        return "nueva-entrega";
    }

    @PostMapping("/nueva")
    public String agregarEntrega(@ModelAttribute Entrega entrega) {
        entregaRepository.save(entrega);
        return "redirect:/entregas";
    }
}
