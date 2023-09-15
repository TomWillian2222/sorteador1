package com.sorteio.sorteador.Service;

import com.sorteio.sorteador.Model.M_sorteio;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class S_sorteio {
    public static M_sorteio sortear(int minimo, int maximo, int quantidade) {
        int[] vect = new int[quantidade];

        for(int i = 0; i < quantidade; i++) {
            Random rand = new Random();
            int resultado = rand.nextInt(maximo - minimo + 1) + minimo;
            vect[i] = resultado;
        }

        M_sorteio m_sorteio = new M_sorteio(minimo, maximo, quantidade);
        return m_sorteio;
    }
}