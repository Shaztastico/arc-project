package com.example.arcproject.controller;

import com.example.arcproject.model.ARC;
import com.example.arcproject.service.ArcService;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/arcs")
public class ArcController {

    private final ArcService service;

    public ArcController(ArcService service) {
        this.service = service;
    }

    @GetMapping
    public String showAllArcs(Model model) {
        model.addAttribute("arcs", service.getArcList());
        return "listOfArcs";
    }

    @GetMapping("/{name}")
    public String findArcByName(@PathVariable String name, Model model){
        model.addAttribute("arc", service.findByName(name));
        return "arcFoundByName";
    }

    @GetMapping("/add")
    public String showArcAddForm(Model model) {
        model.addAttribute("arc", new ARC());
        model.addAttribute("workbenches", service.getWorkbenches());
        return "arcAddForm";
    }

}
