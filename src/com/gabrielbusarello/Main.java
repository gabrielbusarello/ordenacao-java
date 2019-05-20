package com.gabrielbusarello;

public class Main {

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort<Double>(new Double[]{23.0, 79.0, 78.0, 23.0, 434.0, -2.0}, new CompareNumeric());
        BubbleSort bubbleSortDesc = new BubbleSort<Double>(new Double[]{23.0, 79.0, 78.0, 23.0, 434.0, -2.0}, new CompareNumericDesc());

        bubbleSort.imprimir();
        bubbleSortDesc.imprimir();

        BubbleSort bubbleSortS = new BubbleSort<String>(new String[]{"C", "E", "F", "C", "I", "A"}, new CompareString());
        BubbleSort bubbleSortSDesc = new BubbleSort<String>(new String[]{"C", "E", "F", "C", "I", "A"}, new CompareStringDesc());

        bubbleSortS.imprimir();
        bubbleSortSDesc.imprimir();

        SelectionSort selectionSort = new SelectionSort<Double>(new Double[]{23.0, 79.0, 78.0, 23.0, 434.0, -2.0}, new CompareNumeric());
        SelectionSort selectionSortDesc = new SelectionSort<Double>(new Double[]{23.0, 79.0, 78.0, 23.0, 434.0, -2.0}, new CompareNumericDesc());

        selectionSort.imprimir();
        selectionSortDesc.imprimir();

        SelectionSort selectionSortS = new SelectionSort<String>(new String[]{"C", "E", "F", "C", "I", "A"}, new CompareString());
        SelectionSort selectionSortSDesc = new SelectionSort<String>(new String[]{"C", "E", "F", "C", "I", "A"}, new CompareStringDesc());

        selectionSortS.imprimir();
        selectionSortSDesc.imprimir();

        InsertionSort insertionSort = new InsertionSort(new Double[]{23.0, 79.0, 78.0, 23.0, 434.0, -2.0}, new CompareNumeric());
        InsertionSort insertionSortDesc = new InsertionSort<Double>(new Double[]{23.0, 79.0, 78.0, 23.0, 434.0, -2.0}, new CompareNumericDesc());

        insertionSort.imprimir();
        insertionSortDesc.imprimir();

        InsertionSort insertionSortS = new InsertionSort<String>(new String[]{"C", "E", "F", "C", "I", "A"}, new CompareString());
        InsertionSort insertionSortSDesc = new InsertionSort<String>(new String[]{"C", "E", "F", "C", "I", "A"}, new CompareStringDesc());

        insertionSortS.imprimir();
        insertionSortSDesc.imprimir();

        QuickSort quickSort = new QuickSort<Double>(new Double[]{23.0, 79.0, 78.0, 23.0, 434.0, -2.0}, new CompareNumeric());
        QuickSort quickSortDesc = new QuickSort<Double>(new Double[]{23.0, 79.0, 78.0, 23.0, 434.0, -2.0}, new CompareNumericDesc());

        quickSort.imprimir();
        quickSortDesc.imprimir();

        QuickSort quickSortS = new QuickSort<String>(new String[]{"C", "E", "F", "C", "I", "A"}, new CompareString());
        QuickSort quickSortSDesc = new QuickSort<String>(new String[]{"C", "E", "F", "C", "I", "A"}, new CompareStringDesc());

        quickSortS.imprimir();
        quickSortSDesc.imprimir();

    }

}
