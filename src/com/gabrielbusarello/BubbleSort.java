package com.gabrielbusarello;

public class BubbleSort<T> {

    private T[] objeto;
    private Compare<T> compare;

    public BubbleSort(T[] objeto, Compare<T> compare) {
        this.objeto = objeto;
        this.compare = compare;
    }

    public void sort() {
        for (int i = this.objeto.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (compare.compareTo(this.objeto[j], this.objeto[j + 1]) > 0) {
                    T temp = this.objeto[j];
                    this.objeto[j] = this.objeto[j + 1];
                    this.objeto[j + 1] = temp;
                }
            }
        }
    }

    public long imprimir() {
        long tempo = 0;
        long start = System.currentTimeMillis();
        this.sort();
        for (int i = 0; i < this.objeto.length; i++) {
            tempo = System.currentTimeMillis() - start;
            System.out.println("Tempo " + i + " = " + tempo);
            // System.out.print(this.objeto[i] + ", ");
        }
        return tempo;
    }

}
