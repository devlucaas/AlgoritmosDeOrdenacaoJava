package AlgoritmosOrdenacao;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class BrincandoComOrdenacao {
    static void shuffleArray(int[] ar)
    {
        Random rnd = ThreadLocalRandom.current();
        for (int i = ar.length - 1; i > 0; i--)
        {
            int index = rnd.nextInt(i + 1);
            int a = ar[index];
            ar[index] = ar[i];
            ar[i] = a;
        }
    }

    public static void main(String[] args) {
        //Vetores
        int[] vetorCrescente = new int[5000];
        int[] vetorDecrescente = new int[5000];
        int[] vetorAleatorio = new int[5000];

        for(int i = 0; i < vetorCrescente.length; i++){
            vetorCrescente[i] = i+1;
        }
        for(int i = 0; i < vetorDecrescente.length; i++){
            vetorDecrescente[i] = vetorDecrescente.length - i;
        }
        for(int i = 0; i < vetorAleatorio.length; i++){
            vetorAleatorio[i] = i+1;
        }
        shuffleArray(vetorAleatorio);
        //Fim vetores
        Ordenacao obj = new Ordenacao();

        //Algoritmos
        //insertionSort
        long somaCrescente = 0;
        long somaDecrescente = 0;
        long somaAleatorio = 0;

        for(int i = 0; i < 50; i++){
            somaCrescente += obj.insertionSort(vetorCrescente);
            somaDecrescente += obj.insertionSort(vetorDecrescente);
            somaAleatorio += obj.insertionSort(vetorAleatorio);
        }
        long mediaCrescente = somaCrescente/50;
        long mediaDecrescente = somaDecrescente/50;
        long mediaAleatorio = somaAleatorio/50;

        System.out.println(mediaCrescente);
        System.out.println(mediaDecrescente);
        System.out.println(mediaAleatorio);
        System.out.println();

        System.out.println(Arrays.toString(vetorCrescente));

        //Vetores
        int[] vetorCrescente1 = new int[15000];
        int[] vetorDecrescente1 = new int[15000];
        int[] vetorAleatorio1 = new int[15000];

        for(int i = 0; i < vetorCrescente1.length; i++){
            vetorCrescente1[i] = i+1;
        }
        for(int i = 0; i < vetorDecrescente1.length; i++){
            vetorDecrescente1[i] = vetorDecrescente1.length - i;
        }
        for(int i = 0; i < vetorAleatorio1.length; i++){
            vetorAleatorio1[i] = i+1;
        }
        shuffleArray(vetorAleatorio1);
        //Vetores Fim

        //quickSort
        long somaCrescente1 = 0;
        long somaDecrescente1 = 0;
        long somaAleatorio1 = 0;
        for(int i = 0; i < 50; i++){
            somaCrescente1 += obj.quickSort(vetorCrescente1);
            somaDecrescente1 += obj.quickSort(vetorDecrescente1);
            somaAleatorio1 += obj.quickSort(vetorAleatorio1);
        }
        long mediaCrescente1 = somaCrescente1/50;
        long mediaDecrescente1 = somaDecrescente1/50;
        long mediaAleatorio1 = somaAleatorio1/50;

        System.out.println("Médias do quickSort:");

        System.out.println("Vetor crescente: " + mediaCrescente1);
        System.out.println("Vetor decrescente: " + mediaDecrescente1);
        System.out.println("Vetor aleatório: " + mediaAleatorio1);

        System.out.println(Arrays.toString(vetorCrescente1));

        }
    }
