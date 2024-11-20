package banco_cripto.controller;

import banco_cripto.model.Investidor;
import java.util.ArrayList;

public class ControleCadastro {
    private ArrayList<Investidor> listaInvestidores;

    public ControleCadastro() {
        this.listaInvestidores = new ArrayList<>();
    }

    public void cadastrarInvestidor(String nome, String cpf, String senha) {
        Investidor novoInvestidor = new Investidor(nome, cpf, senha);
        listaInvestidores.add(novoInvestidor);
    }

    public Investidor buscarPorCpf(String cpf) {
        for (Investidor investidor : listaInvestidores) {
            if (investidor.getCpf().equals(cpf)) {
                return investidor;
            }
        }
        return null; // Caso não encontre
    }
}
