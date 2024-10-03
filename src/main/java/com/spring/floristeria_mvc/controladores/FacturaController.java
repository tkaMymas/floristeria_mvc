package com.spring.floristeria_mvc.controladores;

import com.spring.floristeria_mvc.entidades.Factura;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.spring.floristeria_mvc.repositorios.FacutraRepository;
import com.spring.floristeria_mvc.repositorios.PedidoRepository;

import java.util.List;

@Controller
@RequestMapping("/facturas")
public class FacturaController {
    @Autowired
    private FacutraRepository facturaRepository;
    @Autowired
    private PedidoRepository pedidoRepository;

    @GetMapping
    public String listarFacturas(Model model) {
        model.addAttribute("titulo", "FACTURAS");
        List<Factura> facturas = facturaRepository.findAll();
        model.addAttribute("facturas", facturas);
        return "facturas";
    }

    @GetMapping("/nueva")
    public String mostrarFormularioNuevaFactura(Model model) {
        model.addAttribute("factura", new Factura());
        model.addAttribute("pedidos", pedidoRepository.findAll());
        return "nueva-factura";
    }

    @PostMapping("/nueva")
    public String agregarFactura(@ModelAttribute Factura factura) {
        facturaRepository.save(factura);
        return "redirect:/facturas";
    }
}
