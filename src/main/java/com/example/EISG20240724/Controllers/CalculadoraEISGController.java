package com.example.EISG20240724.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/calculadora")
public class CalculadoraEISGController {
@GetMapping("/restaEISG")
    public String showSubtractFrom(Model model) {
        model.addAttribute("num1" );
        model.addAttribute("num2" );
        model.addAttribute("result");
        return "calculadora/restaEISG";
    }

    @PostMapping("/restaEISG")
    public String performSubtract(@RequestParam("num1") int num1, @RequestParam("num2") int num2, Model model) {
        int result = num1 - num2;
        model.addAttribute("num1", num1);
        model.addAttribute("num2", num2);
        model.addAttribute("result", result);
        return "calculadora/restaEISG";
    }
}
