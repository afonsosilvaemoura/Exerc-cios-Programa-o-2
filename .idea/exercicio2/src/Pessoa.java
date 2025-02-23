public class Pessoa {
    private String nome;
    private int idade;
    private double altura;
    private double peso;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public double imc() {
        return this.getPeso() / (this.getAltura() * this.getAltura());
    }

    public String imprimir() {
        return "Nome: " + getNome() +
                "\nIdade: " + getIdade() +
                "\nAltura: " + getAltura() + " metros" +
                "\nPeso: " + getPeso() + " Kg" +
                "\nIMC: " + imc();
    }
}
