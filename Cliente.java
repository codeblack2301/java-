public class Cliente {

    int conta;
    double saldo;
    String nome;

    Cliente(int conta, double saldo, String nome) {
        this.conta = conta;
        this.saldo = saldo;
        this.nome = nome;
    }

    public void Sacar(double valor) throws IllegalArgumentException {

        if (valor > saldo) {
            throw new IllegalArgumentException("saldo insuficiente");
        }
        System.out.println("operaçao concluida com sucesso!!");
        saldo -= valor;

    }

}
