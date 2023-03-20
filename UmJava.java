package umjava;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*1 - Solicitar a inserção de 5 números, ao final, imprimir os números pares,
números ímpares e a média geral desses números.*/
public class UmJava {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numeros = 0;
        List numerosPares = new ArrayList();
        List numerosImpares = new ArrayList();
        int soma = 0;
        int media = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o " + i + " numero: ");
            numeros = scan.nextInt(); //scanner para guardar o n° digitado

            if (numeros % 2 == 0) {
                numerosPares.add(numeros);   //if se número é par irá salvar na variável
            } else {
                numerosImpares.add(numeros); //senão número ira adicionar na lista de numerosImpares
            }
            soma = numeros + soma; //cálculo da soma 
            media = soma / 5; //cálculo da média
        }
        System.out.println("Numeros pares digitados:" + numerosPares);
        System.out.println("Numeros impares digitados:" + numerosImpares);
        System.out.println("A media dos numeros digitados e: " + media);
    }

}
