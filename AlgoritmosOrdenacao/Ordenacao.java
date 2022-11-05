package AlgoritmosOrdenacao;

public class Ordenacao implements Ordenacao_IF {

    @Override
    public boolean checaVetorOrdenado(int[] numeros) {
        for (int i = 0; i < numeros.length - 1; i++) {
            if (numeros[i + 1] < numeros[i]) {
                return false;
            }
        }
        return true;
    }

    @Override
    public long insertionSort(int[] numeros) {
        long tempoI = System.nanoTime();

        int n = numeros.length;

        for (int j = 1; j < n; j++) {
            int key = numeros[j];
            int i = j - 1;

            while ((i > -1) && (numeros[i] > key)) {
                numeros[i + 1] = numeros[i];
                i--;
            }
            numeros[i + 1] = key;
        }
        long tempoF = System.nanoTime();
        return (tempoF - tempoI);
    }


        public void quick(int[] numeros, int left, int right){
            if(left < right){
                int p = partition(numeros, left, right);
                quick(numeros, left, p - 1);
                quick(numeros, p + 1, right);
            }
        }
        @Override
        public long quickSort(int[] numeros){
            long tempoI = System.nanoTime();
            quick(numeros,0 , numeros.length -1);
            long tempoF = System.nanoTime();
            return (tempoF - tempoI);
        }

        static int partition(int[] numeros, int left, int right){
            //int mid = numeros[(left + right) / 2];

            int i = left + 1;
            int j = right;
            int pivot = numeros[left];
            /*while(true){
                do{
                    i++;
                }while(numeros[i] < pivot);
                do{
                    j--;
                }while(numeros[j] > pivot);
                if (i >= j){
                    return j;
                }
                int aux = numeros[i];
                numeros[i] = numeros[j];
                numeros[j] = aux;
            }*/
            while (i <=  j){
                if(numeros[i] <= pivot){
                    i++;
                }
                else if(numeros[j] > pivot) {
                    j--;
                }
                else if(i <= j){
                    swap(numeros, i, j);
                    i++;
                    j--;
                }
            }
            swap(numeros, left, j);
            return j;
        }
        private static void swap(int[] numeros, int i, int j){
            int aux = numeros[i];
            numeros[i] = numeros[j];
            numeros[j] = aux;
        }
    }
