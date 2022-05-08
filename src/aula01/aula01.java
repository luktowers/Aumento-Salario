package aula01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class aula01 {
    public static void main(String[] args) {

        Scanner inputUser = new Scanner(System.in);
        DecimalFormat decFor = new DecimalFormat("0.00");
        
        System.out.println("Qual é o seu nome?");
        String nome = inputUser.nextLine();

        System.out.println("Há quantos anos trabalha aqui? ");
        int tempo = inputUser.nextInt();

        System.out.println("Qual é o seu salário atual? ");
        double salario = inputUser.nextDouble();
        inputUser.close();

        double novoSalario = salario + (10 * salario / 100);


        if (tempo >=10) {
            System.out.println(nome + ", seu novo salario é de: " + decFor.format(novoSalario));            
        } else {
            System.out.println(nome + ", você ainda não tem direito a receber aumento");
        }
    }
}
