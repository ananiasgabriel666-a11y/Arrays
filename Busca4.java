public class Busca4 {

    //método que busca um nome em um array de nomes e devolve a posição ou -1 se não encontrado
    static int buscar(String[] nomes, String alvo){

        //percorre o array de nomes
        for (int i = 0; i < nomes.length; i++) {

            //se o nome na posição i for igual ao alvo, devolve a posição i
            if (nomes[i].equals(alvo)) {
                //devolve a posição do nome encontrado
                return i;
            }
        }
        //se não encontrou o nome, devolve -1
        return -1;
    }

    public static void main(String[] args) {
        //exemplo de array de nomes
        String[] nomes = {"Ana", "Bruno", "Carla", "Diego"};

        //chama o método buscar para procurar "Carla" e "Eduardo" no array de nomes
        System.out.println(buscar(nomes, "Carla"));

        //chama o método buscar para procurar "Eduardo" no array de nomes e imprime a posição ou -1 se não encontrado
        System.out.println(buscar(nomes, "Eduardo"));
    }
}
    