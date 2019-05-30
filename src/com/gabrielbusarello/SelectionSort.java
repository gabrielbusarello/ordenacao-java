package com.gabrielbusarello;


public class SelectionSort<T> {

    private T[] objeto;
    private Compare<T> compare;

    public SelectionSort(T[] objeto, Compare<T> compare) {
        this.objeto = objeto;
        this.compare = compare;
    }

    public T[] sort() {
        for (int i = 0; i < this.objeto.length; i++) {
            int menor = i;
            for (int j = i + 1; j < this.objeto.length; j++) {
                if (compare.compareTo(this.objeto[j], this.objeto[menor]) < 0) {
                    menor = j;
                }
            }
            T aux = this.objeto[i];
            this.objeto[i] = this.objeto[menor];
            this.objeto[menor] = aux;
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
