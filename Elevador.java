/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package elevador;

/**
 *
 * @author Matheus Ormenezzi
 */
public class Elevador {

    int andarAtual, totalAndares, capacidade, pessoasPresentes;
    boolean emManutencao;

    public boolean inicializar(int capacidade, int totalAndares) {
        this.capacidade = capacidade;
        this.totalAndares = totalAndares;
        andarAtual = 0;
        pessoasPresentes = 0;
        emManutencao = false;
        return true;
    }

    public String entrar() {
        if (emManutencao) {
            return mensagemManutencao();
        } else if (pessoasPresentes < capacidade) {
            pessoasPresentes++;
            return "Algu�m entrou no elevador!";
        } else {
            return "O elevador est� cheio!";
        }
    }

    public String sair() {
        if (emManutencao) {
            return mensagemManutencao();
        } else if (pessoasPresentes > 0) {
            pessoasPresentes--;
            return "Alguem est� saindo do elevador!";
        } else {
            return "O elevador est� vazio!";
        }
    }

    public void subir() {
        if (emManutencao) {
            mensagemManutencao();
        } else if (andarAtual < totalAndares) {
            andarAtual++;
        }
    }

    public void descer() {
        if (emManutencao) {
            mensagemManutencao();
        } else if (andarAtual > 0) {
            andarAtual--;
        }
    }

    public void colocarEmManuten��o() {
        emManutencao = true;
    }

    public void liberarManutencao() {
        emManutencao = false;
    }

    private String mensagemManutencao() {
        if (emManutencao){
          return "Manuten��o: Ativa!";  
        }
        return "Manuten��o: Desativada!";
    }

    // ******* Getter ********
    public int getAndarAtual() {
        return andarAtual;
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public int getPessoasPresentes() {
        return pessoasPresentes;
    }

    public boolean getEmManutencao() {
        return emManutencao;
    }
}
