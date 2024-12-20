package banco_cripto.model;

public class Investidor {
    private String nome;
    private String cpf;
    private String senha;
    private CarteiraDeInvestimentos carteira;

    public Investidor(String nome, String cpf, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
        this.carteira = new CarteiraDeInvestimentos(); // Inicializa a carteira
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public CarteiraDeInvestimentos getCarteira() {
        return carteira;
    }

    public void setCarteira(CarteiraDeInvestimentos carteira) {
        this.carteira = carteira;
    }
}
