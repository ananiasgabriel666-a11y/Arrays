//Leia 10 inteiros para um array e exiba-os na ordem inversa da leitura
import java.util.Scanner;

public class Preenchimento1 {
    public static void main(String [] args) {
        Scanner teclado = new Scanner(System.in);
        
        //cria uma array de 10 posições com (indices de 0 a 9)
        int[] numeros = new int[10];
        
        //primeiro laço preenche a array nas posições de 0 a 9
        //i < numero.length garante que nunca passe da ultima posição
        for(int i = 0; i < numeros.length; i++) {

            //mostra quan numero o ususario deve digitar (Ex: Numero1)
            System.out.println("Numero" + (i + 1) + ": ");

            // le um inteiro do teclado e guarda na posição i do array
            numeros[i] = teclado.nextInt(); // leia um numero
        }
        
        System.out.print("Ordem invesa:");

        //segundo laço percorre de trás para frente
        // int i = numero.length - 1: começa na ultima posição valida (9)
        //continuando ate chegar na pocição 0
        for(int i = numeros.length - 1; i >=0; i--){


            //imprime o numero que esta na posição i
            System.out.println(numeros[i]);
        }
    }
    
}
