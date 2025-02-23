public class Main {
    public static void main(String[] args) {
        Cilindro cilindro1 = new Cilindro();
        cilindro1.setAltura(4);
        cilindro1.setRaio(3);
        System.out.println("O cilindro de altura = " + cilindro1.getAltura() + " e raio = " + cilindro1.getRaio() + " tem o volume = " + cilindro1.volume());

    }
}