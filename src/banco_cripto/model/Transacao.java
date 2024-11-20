package banco_cripto.model;

import java.time.LocalDateTime;

public class Transacao {
    private LocalDateTime dataHora;  // Data e hora da transação
    private String tipoTransacao;    // Depósito, Saque, Compra, Venda
    private double valor;            // Valor da transação
    private double taxa;             // Taxa aplicada
    private double saldoReal;        // Saldo em reais após a transação
    private double saldoBTC;         // Saldo em Bitcoin após a transação
    private double saldoETH;         // Saldo em Ethereum após a transação
    private double saldoXRP;         // Saldo em Ripple após a transação

    // Construtor da transação
    public Transacao(LocalDateTime dataHora, String tipoTransacao, double valor, double taxa, 
                     double saldoReal, double saldoBTC, double saldoETH, double saldoXRP) {
        this.dataHora = dataHora;
        this.tipoTransacao = tipoTransacao;
        this.valor = valor;
        this.taxa = taxa;
        this.saldoReal = saldoReal;
        this.saldoBTC = saldoBTC;
        this.saldoETH = saldoETH;
        this.saldoXRP = saldoXRP;
    }

    // Getters e Setters
    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public String getTipoTransacao() {
        return tipoTransacao;
    }

    public double getValor() {
        return valor;
    }

    public double getTaxa() {
        return taxa;
    }

    public double getSaldoReal() {
        return saldoReal;
    }

    public double getSaldoBTC() {
        return saldoBTC;
    }

    public double getSaldoETH() {
        return saldoETH;
    }

    public double getSaldoXRP() {
        return saldoXRP;
    }
}
