/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package elevador;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Matheus Ormenezzi
 */
public class Predio {

    String nome;
    List<Elevador> elevadores;

    public Predio(String nome) {
        this.nome = nome;
        this.elevadores = new ArrayList<>();
    }

    public void adicionarElevador(Elevador elevador) {
        if (elevador != null) {
            elevadores.add(elevador);
        }

    }

    public Elevador getElevador(int indice) {
        return elevadores.get(indice);
    }

    public int getQuantidadeElevadores() {
        return elevadores.size();
    }

    public String getNome() {
        return nome;
    }
}
