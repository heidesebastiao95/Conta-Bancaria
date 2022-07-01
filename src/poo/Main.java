package poo;

public class Main {

    public static void main(String[] args) {
	// write your code here.
        Conta primConta= new Conta("Heide Sebastiao", 1111,5000);

        System.out.println(""+primConta.Consultar());

        primConta.depositar(3000f);

        System.out.println("\n consultar conta apos o deposito de 3000$.\n");
        System.out.println("\n\n"+primConta.Consultar());

        primConta.sacar(200f);

        System.out.println("\n consultar conta apos uma saca de 200$\n");

        System.out.println(""+primConta.Consultar());

    }
}
