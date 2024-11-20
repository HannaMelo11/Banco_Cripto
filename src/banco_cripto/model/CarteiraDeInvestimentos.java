package banco_cripto.model;

import java.util.ArrayList;
import java.util.List;

public class CarteiraDeInvestimentos {
    private double saldoReais;
    private double saldoBitcoin;
    private double saldoEthereum;
    private double saldoRipple;
    private List<Transacao> transacoes; // Lista de histórico de transações

    // Construtor
    public CarteiraDeInvestimentos() {
        this.saldoReais = 0.0;
        this.saldoBitcoin = 0.0;
        this.saldoEthereum = 0.0;
        this.saldoRipple = 0.0;
        this.transacoes = new ArrayList<>();
    }

    // Getters
    public double getSaldoReais() {
        return saldoReais;
    }

    public double getSaldoBitcoin() {
        return saldoBitcoin;
    }

    public double getSaldoEthereum() {
        return saldoEthereum;
    }

    public double getSaldoRipple() {
        return saldoRipple;
    }

    public List<Transacao> getTransacoes() {
        return transacoes;
    }

    // Métodos para manipulação de saldo
    public void depositar(double valor) {
        if (valor > 0) {
            saldoReais += valor;
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && saldoReais >= valor) {
            saldoReais -= valor;
        }
    }

    // Métodos para manipulação de criptomoedas
    public void adicionarBitcoin(double quantidade) {
        if (quantidade > 0) {
            saldoBitcoin += quantidade;
        }
    }

    public void removerBitcoin(double quantidade) {
        if (quantidade > 0 && saldoBitcoin >= quantidade) {
            saldoBitcoin -= quantidade;
        }
    }

    public void adicionarEthereum(double quantidade) {
        if (quantidade > 0) {
            saldoEthereum += quantidade;
        }
    }

    public void removerEthereum(double quantidade) {
        if (quantidade > 0 && saldoEthereum >= quantidade) {
            saldoEthereum -= quantidade;
        }
    }

    public void adicionarRipple(double quantidade) {
        if (quantidade > 0) {
            saldoRipple += quantidade;
        }
    }

    public void removerRipple(double quantidade) {
        if (quantidade > 0 && saldoRipple >= quantidade) {
            saldoRipple -= quantidade;
        }
    }

    // Método para adicionar transações ao histórico
    public void adicionarTransacao(Transacao transacao) {
        if (transacao != null) {
            transacoes.add(transacao);
        }
    }
}
