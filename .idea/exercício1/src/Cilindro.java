public class Cilindro {
    private double raio;
    private double altura;

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getAltura() {
        return altura;
    }

    public double volume() {
        return Math.PI * Math.pow(raio, 2) * altura;
    }

}
