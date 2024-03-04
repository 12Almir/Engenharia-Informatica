public class BubSort {
    public static void main(String[] args) {
        int vetor[] = {3, 2, 5, 1, 8, 4};
        bubSort(vetor, vetor.length);
        for (int i = 0; i < vetor.length; ++i) {
            System.out.print(vetor[i]);
        }
    }

    static void bubSort(int vetor[], int n) {
        if (n == 1) {
            return;
        }
        for (int i = 0; i < n - 1; i++) {
            if (vetor[i] > vetor[i + 1]) {
                int temp = vetor[i];
                vetor[i] = vetor[i + 1];
                vetor[i + 1] = temp;
            }
        }
        bubSort(vetor, n - 1);
    }



}
