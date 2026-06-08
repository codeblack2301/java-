public class Pedido {
    private int codigo;
    private String nome;
    private double valor;

    public Pedido(int codigo, String nome, double valor) {
        setCodigo(codigo);
        setNome(nome);
        setValor(valor);
    }

    public void setCodigo(int codigo) {
        if (codigo <= 0) {
            throw new IllegalArgumentException("Código inválido");
        }
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome inválido");
        }
        this.nome = nome;
    }

    public void setValor(double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("Valor inválido");
        }
        this.valor = valor;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }
}
