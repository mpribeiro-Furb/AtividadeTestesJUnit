package AtvPessoa;

public class Pessoa {
    private String nome;
    private int idade;


    public void aniversario(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade < 0){
            throw new IllegalArgumentException("ERRO");
        }
        this.idade = idade;
    }
}
