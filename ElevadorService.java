/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package elevador;

/**
 *
 * @author Matheus Ormenezzi
 */
public class ElevadorService {

    int cont = 0;

    Elevador e = new Elevador();

    public String moverElevador(Elevador elevador, int destino) {
        if (e.andarAtual != destino) {
            if (e.andarAtual < destino) {
                for (cont = (destino - e.andarAtual); cont == destino; cont++) {
                    e.subir();
                }
                return "O elevador está subindo!";
            } else if (e.andarAtual == destino && destino == e.totalAndares) {
                return "O elevador está no último andar!";
            }
            if (e.andarAtual > destino) {
                for (cont = (e.andarAtual - destino); cont == 0; cont--) {
                    e.descer();
                }
                return "O elevador está descendo!";
            } else if (e.andarAtual == destino && destino == 0) {
                return "O elevador está no terréo!";
            }
        }
        return "O elevador já está nesse andar!";

    }

    public void embarcarPessoas(Elevador elevador, int quantidade) {
        for (cont = quantidade; cont > 0; cont--) {
            e.entrar();
        }
    }

    public void desembarcarPessoas(Elevador elevador, int quantidade) {
        for (cont = quantidade; cont > 0; cont--) {
            e.descer();
        }

    }

    public String gerarStatus(Elevador elevador) {
        return """
               ###### Status do Elevador ######
               Andar atual: %d/%d
               Pessoas presentes: %d/%d
               Em manutenção: %b
               """.formatted(
                e.getAndarAtual(),
                e.getTotalAndares(),
                e.getPessoasPresentes(),
                e.getCapacidade(),
                e.getEmManutencao()
        );
    }
}
