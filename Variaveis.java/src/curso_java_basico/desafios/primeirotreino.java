package curso_java_basico.desafios;

import java.util.Scanner;

public class primeirotreino {
    public static void main(String [] args) {
        System.out.println();
        String nome = "Rhy";
        int idade = 17;
        byte segundos = 1;

        System.out.println(nome);
        System.out.println(idade);
        System.out.println(segundos);

        Scanner scan = new Scanner(System.in);
        System.out.println("Seu nome completo: ");
        String saidaNome = scan.nextLine();
        System.out.println(saidaNome + ", Esse é o seu nome.");
       scan.close();

       // INCREMENTAR E DECREMENTAR / OPERADORES
       int soma = 2; // SOMA
       soma = 2 + 2;
       System.out.println("2 + 2 é: " + soma);

       int multiplicação = 12 * 2;
       System.out.println("12 * 2 é: " + multiplicação); // MULTIPLICAÇÃO

       int incremento = 10;
       System.out.println(++incremento); // INCREMENTO

       int decremento = 10;
       System.out.println(--decremento); // DECREMENTO

    }
}
