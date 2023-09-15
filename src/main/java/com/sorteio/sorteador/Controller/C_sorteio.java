package com.sorteio.sorteador.Controller;

import com.sorteio.sorteador.Model.M_sorteio;
import com.sorteio.sorteador.Service.S_sorteio;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class C_sorteio {
    @GetMapping("/")
    public String getSorteio() {
        return "sorteio";
    }
    @PostMapping("/sorteio")
    public String postSorteio(@RequestParam("minimo") int minimo,
                              @RequestParam("maximo") int maximo,
                              @RequestParam("quantidade") int quantidade,
                              @NotNull Model model) {
        M_sorteio sorteio = S_sorteio.sortear(minimo, maximo, quantidade);

        model.addAttribute("minimo", sorteio.getMinimo());
        model.addAttribute("maximo", sorteio.getMaximo());
        model.addAttribute("quantidade", sorteio.getQuantidade());

        return "resultado";
    }
}