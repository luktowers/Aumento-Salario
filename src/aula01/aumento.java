package aula01;

import java.util.Scanner;

public class aumento {
    public static void main(String[] args) {

        Scanner inputUser = new Scanner(System.in);
        
        System.out.println("Qual é o seu nome?");
        String nome = inputUser.nextLine();

        System.out.println("Há quantos anos trabalha aqui? ");
        int tempo = inputUser.nextInt();

        System.out.println("Qual é o seu salário atual? ");
        double salario = inputUser.nextDouble();
        inputUser.close();

        double novoSalario = salario + (10 * salario / 100);


        if (tempo >=10) {
            System.out.printf("%s, seu novo salario é de R$ %.2f", nome, novoSalario);            
        } else {
            System.out.println(nome + ", você ainda não tem direito a receber aumento");
        }
    }
}
