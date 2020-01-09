package jogador;

public class Jogador {
    private String nome;
    private Integer numero;

    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }


    @Override
    public String toString() {
        return "Jogador{" +
                "nome='" + nome + '\'' +
                ", numero=" + numero +
                '}';
    }
}
