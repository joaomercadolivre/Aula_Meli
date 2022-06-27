package exercicio02;

public class Pessoa {

    private String nome;
    private long id;
    private int idade;
    private double altura;
    private double peso;

    public Pessoa(String nome, long id, int idade, double altura, double peso) {
        this.nome = nome;
        this.id = id;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    public Pessoa(String nome, long id, int idade) {
        this.nome = nome;
        this.id = id;
        this.idade = idade;
    }

    public Pessoa() {

    }

    public void calculaImc() {
        double imc = this.getPeso() / (this.getAltura() * this.getAltura());
        if (imc < 20) {
            System.out.println(this.getNome() + " Está abaixo do peso");
        } else if (imc >= 20 && imc <= 25) {
            System.out.println(this.getNome() + " Está como o peso saudável");
        } else if (imc > 25) {
            System.out.println(this.getNome() + " Sobrepeso");

        }

    }

    public boolean ehMaiorIdade() {
        if (this.getIdade() >= 18) {
            System.out.println(getNome() + " Eh maior de idade");
        } else {
            System.out.println(getNome() + " Eh menor de idade");
        }
        return false;

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public double setAltura(double altura) {
        return this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Pessoa:" +
                " nome= " + nome +
                ", id= " + id +
                ", idade= " + idade +
                ", altura= " + altura +
                ", peso= " + peso;
    }
}
