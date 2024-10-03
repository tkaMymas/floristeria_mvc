package com.spring.floristeria_mvc.controladores;

import com.spring.floristeria_mvc.entidades.Pedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.spring.floristeria_mvc.repositorios.PedidoRepository;

import java.util.List;

@Controller
@RequestMapping("/pedidos")
public class PedidoController {
    @Autowired
    private PedidoRepository pedidoRepository;

    @GetMapping
    public String listarPedidos(Model model){
        model.addAttribute("titulo", "PEDIDOS");
        List<Pedido> pedidos = pedidoRepository.findAll();
        model.addAttribute("pedidos", pedidos);
        return "pedidos";
    }

    @GetMapping("/nuevo")
    public String mostrarFormularioNuevoPedido(Model model){
        model.addAttribute("pedido", new Pedido());
        return "nuevo-pedido";
    }

    @PostMapping("/nuevo")
    public String agregarPedido(@ModelAttribute Pedido pedido){
        pedidoRepository.save(pedido);
        return "redirect:/pedidos";
    }
}
