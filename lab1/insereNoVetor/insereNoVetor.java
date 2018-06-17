import java.util.Scanner;

public class insereNoVetor {

    public static void main (String[] args){
        Scanner leitorParametros = new Scanner(System.in);

        int vetor[];
        vetor = inicializaVetor();

        System.out.println("Digite a posicao em que deseja inserir o novo valor: ");
        int posicao = leitorParametros.nextInt();

        System.out.println("Digite o novo valor: ");
        int valorMudanca = leitorParametros.nextInt();

        insereInteiro(vetor, posicao, valorMudanca);
        imprimeVetor(vetor);
    }
    // Le do teclado os valores da array

    private static int[] inicializaVetor (){
        Scanner leitorElementos = new Scanner(System.in);
        System.out.println("Digite o comprimento do seu vetor: ");
        int comprimentoVetor = leitorElementos.nextInt();
        int[] vetorTemp = new int[comprimentoVetor];

        for (int i=0; i < comprimentoVetor; i++){
            System.out.printf("Digite o elemento de indice %d: ",i);
            vetorTemp[i] = leitorElementos.nextInt();
        }
        return vetorTemp;
    }

    //Imprime os valores do vetor; sem valor de retorno.

    private static void imprimeVetor(int[] vetor){
        for(int i=0; i < vetor.length; i++){
            if(i==0){
                System.out.printf("[%d, ", vetor[i]);
            }
            else{
                if(i < vetor.length -1 ){
                    System.out.printf("%d, ", vetor[i]);
                }
                else{
                    if (i == (vetor.length -1)){
                        System.out.printf("%d]\n", vetor[i]);
                    }
                }
            }
        }
        System.out.printf("o vetor vai da posicao 0 à %d\n", (vetor.length-1));
    }
    
    // Tenta introduzir no vetor um valor dado pelo usuario.

    private static int[] insereInteiro (int[] vetor, int posicao, int valorMudanca){
        Scanner leitorNumero = new Scanner(System.in);
        int posicaoPrimeiroZero = vetor.length + 10;

        //As posicoes vao de 0 a vetor.length-1.
        while (posicao > vetor.length - 1){
            
            System.out.println("Escreva uma posicao dentro do range do vetor. Lembre que as posições comecam em zero até x = tamanho do vetor -1: ");
            posicao = leitorNumero.nextInt();

        }
        if(vetor[posicao] == 0){
            vetor[posicao] = valorMudanca;
        }
        else{
            for (int i = posicao + 1; i < vetor.length; i++){
                if (vetor[i]==0){
                    posicaoPrimeiroZero = i;
                    break;
                }
            }
            if (posicaoPrimeiroZero >= vetor.length){
                System.out.println("Nao ha posicoes vagas. A seguir, o vetor impresso (inalterado):\n");
            }
            else{
                //Desloca todos os valores à frente da posicao de interesse uma "casa" para a direita
                for(int i = posicaoPrimeiroZero; i > posicao; i--){
                    vetor[i] = vetor[i-1];
                    vetor[i-1] = 0;
                }
                vetor[posicao] = valorMudanca;
            }
        }
        return vetor;
    }
}