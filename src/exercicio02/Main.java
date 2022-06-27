package exercicio02;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("João", 1, 27, 1.75, 70);
        Pessoa pessoa2 = new Pessoa("Maria",2,25);
        Pessoa pessoa3 = new Pessoa();

        pessoa1.calculaImc();
        pessoa1.ehMaiorIdade();
        System.out.println(pessoa1);

        pessoa2.setAltura(1.60);
        pessoa2.setPeso(65);
        pessoa2.calculaImc();
        pessoa2.ehMaiorIdade();
        System.out.println(pessoa2);

        pessoa3.setNome("Pedro");
        pessoa3.setId(3);
        pessoa3.setAltura(1.90);
        pessoa3.setPeso(130);
        pessoa3.setIdade(17);
        pessoa3.calculaImc();
        pessoa3.ehMaiorIdade();
        System.out.println(pessoa3);

    }
}
