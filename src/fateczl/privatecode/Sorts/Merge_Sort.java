package fateczl.privatecode.Sorts;



public class Merge_Sort {
    public Merge_Sort(){
        super();
    }

    public int[] mergeSort(int[] vetor, int inicio, int fim){
        if (inicio < fim){
            int meio = (inicio+fim)/2;
            mergeSort(vetor, inicio,meio);
            mergeSort(vetor,meio+1, fim);
            intercala(vetor, inicio,meio,fim);
        }
        return vetor;
    }

    private void intercala(int[] vetor, int inicio, int meio, int fim) {
        int[] newVetor  = new int[vetor.length];
        int esquerda = inicio;
        int direita = meio +1;


        for(int cont = inicio; cont <= fim; cont++){
            newVetor[cont] = vetor[cont];
        }

        for (int cont=inicio; cont <= fim;cont++){
            
            if (esquerda>meio){
                vetor[cont] = newVetor[direita];
                direita++;

            }else if (direita > fim){
                vetor[cont] = newVetor[esquerda];
                esquerda++;
                
            } else if (newVetor[esquerda] < newVetor[direita]) {
                vetor[cont] = newVetor[esquerda];
                esquerda++;
                
            }else {
                vetor[cont] = newVetor[direita];
                direita++;
            }
        }

    }
}
