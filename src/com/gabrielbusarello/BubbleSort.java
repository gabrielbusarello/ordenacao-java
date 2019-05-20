package com.gabrielbusarello;

public class BubbleSort<T> {

    private T[] objeto;
    private Compare<T> compare;

    public BubbleSort(T[] objeto, Compare<T> compare) {
        this.objeto = objeto;
        this.compare = compare;
    }

    public T[] sort() {
        for (int i = this.objeto.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (compare.compareTo(this.objeto[j], this.objeto[j + 1]) > 0) {
                    T temp = this.objeto[j];
                    this.objeto[j] = this.objeto[j + 1];
                    this.objeto[j + 1] = temp;
                }
            }
        }

        return this.objeto;
    }

    public void imprimir() {
        System.out.print("Bubble Sort: [ ");
        for (int i = 0; i < sort().length; i++) {
            System.out.print(i > 0 ? ", " : "");
            System.out.print(sort()[i]);
        }
        System.out.println(" ]");
    }

}
