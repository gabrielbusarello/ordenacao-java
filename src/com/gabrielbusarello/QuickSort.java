package com.gabrielbusarello;

public class QuickSort<T> {

    private T[] objeto;
    private Compare<T> compare;

    public QuickSort(T[] objeto, Compare<T> compare) {
        this.objeto = objeto;
        this.compare = compare;
    }

    public void sort(int p, int r) {
        if (p < r) {
            int q = particao(p, r);
            sort(p, q-1);
            sort(q+1, r);
        }
    }

    private int particao(int p, int r) {
        T x = this.objeto[r];
        int i = p - 1;
        for (int j = p; j <= r - 1; j++) {
            if (compare.compareTo(this.objeto[j], x) <= 0) {
                i = i + 1;
                T temp = this.objeto[i];
                this.objeto[i] = this.objeto[j];
                this.objeto[j] = temp;
            }
        }
        T temp = this.objeto[i + 1];
        this.objeto[i + 1] = this.objeto[r];
        this.objeto[r] = temp;
        return i + 1;
    }

    public long imprimir() {
        long tempo = 0;
        long start = System.currentTimeMillis();
        sort(0, this.objeto.length - 1);
        for (int i = 0; i < this.objeto.length; i++) {
            tempo = System.currentTimeMillis() - start;
            System.out.println("Tempo " + i + " = " + tempo);
            // System.out.print(this.objeto[i] + ", ");
        }
        return tempo;
    }

}
