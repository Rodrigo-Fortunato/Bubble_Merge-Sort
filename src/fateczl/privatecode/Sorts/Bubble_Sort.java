package fateczl.privatecode.Sorts;

public class Bubble_Sort {
    public Bubble_Sort() {
    }

    public int[] bubbleSort(int[] vetor) {
        int tamanho = vetor.length;

        for(int cont = 0; cont < tamanho; ++cont) {
            for(int i = 0; i < tamanho - 1; ++i) {
                if (vetor[i] > vetor[i + 1]) {
                    int aux = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = aux;
                }
            }
        }
        return vetor;

    }
}
