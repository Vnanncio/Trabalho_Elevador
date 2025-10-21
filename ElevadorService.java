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
                return "O elevador est� subindo!";
            } else if (e.andarAtual == destino && destino == e.totalAndares) {
                return "O elevador est� no �ltimo andar!";
            }
            if (e.andarAtual > destino) {
                for (cont = (e.andarAtual - destino); cont == 0; cont--) {
                    e.descer();
                }
                return "O elevador est� descendo!";
            } else if (e.andarAtual == destino && destino == 0) {
                return "O elevador est� no terr�o!";
            }
        }
        return "O elevador j� est� nesse andar!";

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
               Em manuten��o: %b
               """.formatted(
                e.getAndarAtual(),
                e.getTotalAndares(),
                e.getPessoasPresentes(),
                e.getCapacidade(),
                e.getEmManutencao()
        );
    }
}
