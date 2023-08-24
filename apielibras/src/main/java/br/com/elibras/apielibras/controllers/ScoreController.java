package br.com.elibras.apielibras.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/score")
public class ScoreController {

    @GetMapping
    public String testes() {
        return "Olá imbecil";
    }
}
