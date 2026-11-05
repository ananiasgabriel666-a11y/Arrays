// Para um array de notas, escreva métodos que devolvam a maior, a menor, a soma e a média.
import java.util.Scanner;

public class Estatistica2 {

    //devolve a maior nota do array
    static double maior(double[] notas) { 
        //nota candidata a maior é a primeira do array
        double maior = notas[0];

        //percorre o array a partir da segunda posição (i = 1)
        for (int i = 1; i < notas.length; i++) {

            //se a nota na posição i for maior que a maior candidata, ela passa a ser a maior
            if (notas[i] > maior) {

                //atualiza a maior nota candidata
                maior = notas[i];
            }
        }
        //devolve a maior nota encontrada
        return maior;
    }

    //devolve a menor nota do array
    static double menor(double[] notas) {
        double menor = notas[0];
        for (int i = 1; i < notas.length; i++) {
            if (notas[i] < menor) {
                menor = notas[i];
            }
        }
        return menor;
    }

    //devolve a soma das notas do array
    static double soma(double[] notas) {
        double soma = 0.0;
        //percorre o array e soma cada nota (for each)
        for (double nota : notas) {
            //soma a nota atual na soma acumulada
            soma += nota;
        }
        return soma;
    }

    //devolve a média das notas do array
    static double media(double[] notas) {
        //chama o método soma para obter a soma das notas
        double total = soma(notas);

        //divide a soma pelo número de notas para obter a média
        return total / notas.length;
    }


    public static void main(String [] args) {
        
        Scanner teclado = new Scanner(System.in);

        //cria uma array de 10 posições com (indices de 0 a 9)
        double[] notas = new double[10];

        //primeiro laço preenche a array nas posições de 0 a 9
        for(int i = 0; i < notas.length; i++) {
            System.out.println("Nota" + (i + 1) + ": ");
            notas[i] = teclado.nextDouble(); // leia uma nota
        }

        //exibe os resultados chamando os métodos definidos acima
        System.out.println("Maior nota: " + maior(notas));
        System.out.println("Menor nota: " + menor(notas));
        System.out.println("Soma das notas: " + soma(notas));
        System.out.println("Média das notas: " + media(notas));

    }

}