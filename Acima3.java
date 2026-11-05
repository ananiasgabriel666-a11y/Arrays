public class Acima3 {

    //mesmo método soma do Estatistica2
    static double soma(double[] notas) {
        double soma = 0.0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma;
    }

    //mesmos media do Estatistica2
    static double media(double[] notas) {
        return soma(notas) / notas.length;
    }

    
    //novo método que imprime as notas acima da média
    static void acimaDaMedia(double[] notas) {

        //chama o método media para obter a média das notas
        double m = media(notas);

        //percorre o array de notas e imprime as que são maiores que a média
        for (int i = 0; i < notas.length; i++) {
            //se a nota na posição i for maior que a média, imprime a posição e a nota
            if (notas[i] > m) {
                //imprime a posição e a nota que está acima da média
                System.out.println("Posição " + i + ": " + notas[i]);
            }
        }
    }

    public static void main(String[] args) {
        //exemplo de array de notas
        double[] notas = {8.5, 7.0, 9.0, 6.5, 8.0};
        //chama o método acimaDaMedia para imprimir as notas acima da média
        acimaDaMedia(notas);
    }
}