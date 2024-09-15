package com.spring.floristeria_mvc.controladores;

import com.spring.floristeria_mvc.entidades.Flor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.spring.floristeria_mvc.repositorios.FlorRepository;

import java.util.List;

@Controller
@RequestMapping("/inventario")
public class FlorController {
    @Autowired
    private FlorRepository florRepository;

    @GetMapping
    public String listarFlores(Model model){
        List<Flor> flores = florRepository.findAll();
        model.addAttribute("flores", flores);
        return "inventario";
    }

    @GetMapping("/nueva")
    public String mostrarFormularioNuevaFlor(Model model){
        model.addAttribute("flor", new Flor());
        return "nueva-flor";
    }

    @PostMapping("/nueva")
    public String agregarFlor(@ModelAttribute Flor flor){
        florRepository.save(flor);
        return "redirect:/inventario";
    }

}
