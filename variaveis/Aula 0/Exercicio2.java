/*
1. Crie uma variável que armazena o valor de uma laranja;
2. Crie uma variável que informa o valor de uma uva;
3. Some o valor da laranja com a uva;
*/

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double precoLaranja = sc.nextDouble();
        double precoUva = sc.nextDouble();

        double soma = precoLaranja + precoUva;

        System.out.println("preço Uva: "+precoUva);
        System.out.println("preço Laranja: "+precoLaranja);
        System.out.println(soma);
        
        // Recebam duas idades, faça a soma dela e imprima no terminal
        int idade1 = sc.nextInt();
        int idade2 = sc.nextInt();
        int idade3 = 0;
        idade3 = idade2 + idade1;

        System.out.println("A soma entre as idades" +idade3); 
        


    




        
    }
}
