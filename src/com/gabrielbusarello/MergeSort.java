package com.gabrielbusarello;

public class MergeSort<T> {

    private T[] objeto;
    private Compare<T> compare;

    public MergeSort(T[] objeto, Compare<T> compare) {
        this.objeto = objeto;
        this.compare = compare;
    }

    public void sort(int p, int r) {
        if (p < r) {
            int q = (p + r) / 2;
            sort(p, q);
            sort(q+1, r);
            merge(p, q, r);
        }
    }

    //p = start, q = mid, r = end
    public void merge(int p, int q, int r) {
        int n1 = q - p;
        int n2 = r - q;
        System.out.println(n1 + " " + n2);
        T[] L = (T[]) new Object[n1];
        T[] R = (T[]) new Object[n2];
        for (int i = 0; i < n1; i++) {
            L[i] = this.objeto[p + i];
        }
        for (int i = 0; i < n2; i++) {
            R[i] = this.objeto[q + i];
        }
        for (int i = 0; i < L.length; i++) {
            System.out.println("L: " + L[i]);
        }
        for (int i = 0; i < R.length; i++) {
            System.out.println("R: " + R[i]);
        }
        int i = 0;
        int j = 0;
        for (int k = p; k <= r; k++) {
            if (i < L.length && j < R.length) {
                System.out.println("Entrou 1!");
                if (compare.compareTo(L[i], R[j]) <= 0) {
                    this.objeto[k] = L[i];
                    i++;
                } else {
                    this.objeto[k] = R[j];
                    j++;
                }
            } else {
                System.out.println("Entrou 2!");
                if (i < L.length) {
                    this.objeto[k] = L[i];
                    i++;
                }
                if (j < R.length) {
                    this.objeto[k] = R[j];
                    j++;
                }
            }
        }
    }

    public void imprimir() {
        System.out.print("Merge Sort: [ ");
        sort(0, this.objeto.length - 1);
        for (int i = 0; i < this.objeto.length; i++) {
            System.out.print(i > 0 ? ", " : "");
            System.out.print(this.objeto[i]);
        }
        System.out.println(" ]");
    }

}
