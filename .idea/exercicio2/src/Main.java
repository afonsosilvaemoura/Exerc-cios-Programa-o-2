public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Joao");
        pessoa1.setIdade(18);
        pessoa1.setAltura(1.70);
        pessoa1.setPeso(75);
        System.out.println(pessoa1.imprimir());
    }
}
