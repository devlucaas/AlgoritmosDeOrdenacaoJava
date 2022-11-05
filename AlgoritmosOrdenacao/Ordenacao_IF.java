package AlgoritmosOrdenacao;
/*
 * Interface para implementação da classe "Ordenacao".
 * O método booleano deve retornar 'false' se 'numeros' não estiver ordenado (crescente).
 */
public interface Ordenacao_IF {

    boolean checaVetorOrdenado(int[] numeros);

    long insertionSort(int[] numeros);

    long quickSort(int[] numeros);

}
