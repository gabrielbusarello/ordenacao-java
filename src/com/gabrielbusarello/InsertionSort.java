package com.gabrielbusarello;

public class InsertionSort<T> {

    private T[] objeto;
    private Compare<T> compare;

    public InsertionSort(T[] objeto, Compare<T> compare) {
        this.objeto = objeto;
        this.compare = compare;
    }

    public T[] sort() {
        for (int i = 0; i < this.objeto.length; i++) {
            T selecionado = this.objeto[i];
            int j = i - 1;
            while (j >= 0 && compare.compareTo(selecionado, this.objeto[j]) < 0) {
                this.objeto[j + 1] = this.objeto[j];
                j = j - 1;
            }
            this.objeto[j + 1] = selecionado;
        }

        return this.objeto;
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
