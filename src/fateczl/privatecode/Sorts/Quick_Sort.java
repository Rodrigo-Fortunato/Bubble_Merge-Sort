package fateczl.privatecode.Sorts;

public class Quick_Sort {
    public Quick_Sort(){
        super();
    }

    public void quickSort(int[]vetor, int inicio, int fim){
        if (fim > inicio){
            int posicaoPivo = dividir(vetor,inicio,fim);
            quickSort(vetor,inicio,posicaoPivo-1);
            quickSort(vetor,posicaoPivo+1, fim);

        }
    }

    private int dividir (int[] vetor, int inicio, int fim){
        int ponteiroEsquerda = inicio +1;
        int ponteiroDireita = fim;
        int pivo = vetor[inicio];

        while (ponteiroEsquerda <= ponteiroDireita){
            while ( ponteiroEsquerda <= ponteiroDireita &&vetor[ponteiroEsquerda] <= pivo ){
                ponteiroEsquerda++;
            }
            while (ponteiroDireita >= ponteiroEsquerda && vetor[ponteiroDireita] > pivo ){
                ponteiroDireita--;
            }
            if (ponteiroEsquerda< ponteiroDireita){
                trocar(vetor,ponteiroEsquerda,ponteiroDireita);
                ponteiroEsquerda++;
                ponteiroDireita--;
            }
        }
        trocar(vetor,inicio,ponteiroDireita);
        return ponteiroDireita;
    }

    private void trocar(int[] vetor, int ponteiroEsquerda, int ponteiroDireita) {
        int aux = vetor[ponteiroEsquerda];
        vetor[ponteiroEsquerda] = vetor[ponteiroDireita];
        vetor[ponteiroDireita] = aux;
    }


}
