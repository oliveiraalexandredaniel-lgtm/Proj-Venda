package modelo;

public class Cliente {
    private int codigo;
    private String nome;

    // Construtor padrão
    public Cliente() {}

    // Getters e Setters conforme as páginas 42-44
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}