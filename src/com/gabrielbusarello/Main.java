package com.gabrielbusarello;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        ReadArchives readArchives = new ReadArchives();
        Double[] doubles = readArchives.getFileNumbers("C:/Users/Gabriel/IdeaProjects/Ordenacao/src/arquivos/numeros_100000.txt", 100000);
        Double[] doubles1 = readArchives.getFileNumbers("C:/Users/Gabriel/IdeaProjects/Ordenacao/src/arquivos/numeros_1000000.txt", 1000000);

        BubbleSort bubbleSort = new BubbleSort<Double>(doubles, new CompareNumeric());
        BubbleSort bubbleSortDesc = new BubbleSort<Double>(doubles, new CompareNumericDesc());

        long timeBubble = bubbleSort.imprimir();
        long timeBubbleDesc = bubbleSortDesc.imprimir();

        BubbleSort bubbleSort1 = new BubbleSort<Double>(doubles1, new CompareNumeric());
        BubbleSort bubbleSortDesc1 = new BubbleSort<Double>(doubles1, new CompareNumericDesc());

        long timeBubble1 = bubbleSort1.imprimir();
        long timeBubbleDesc1 = bubbleSortDesc1.imprimir();

        System.out.println("1: " + timeBubble);
        System.out.println("2: " + timeBubbleDesc);
        System.out.println("3: " + timeBubble1);
        System.out.println("4: " + timeBubbleDesc1);
/*
        BubbleSort bubbleSortS = new BubbleSort<String>(new String[]{"C", "E", "F", "C", "I", "A"}, new CompareString());
        BubbleSort bubbleSortSDesc = new BubbleSort<String>(new String[]{"C", "E", "F", "C", "I", "A"}, new CompareStringDesc());

        bubbleSortS.imprimir();
        bubbleSortSDesc.imprimir();

        LatLng latLng1 = new LatLng();
        latLng1.setLatitude(10.0);
        latLng1.setLongitude(20.0);

        LatLng latLng2 = new LatLng();
        latLng2.setLatitude(10.0);
        latLng2.setLongitude(1.0);

        BubbleSort bubbleSortO = new BubbleSort<LatLng>(new LatLng[]{latLng1, latLng2}, new CompareObject());
        BubbleSort bubbleSortODesc = new BubbleSort<LatLng>(new LatLng[]{latLng1, latLng2}, new CompareObjectDesc());

        bubbleSortO.imprimir();
        bubbleSortODesc.imprimir();

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

        QuickSort quickSort = new QuickSort<Double>(doubles, new CompareNumeric());
        QuickSort quickSortDesc = new QuickSort<Double>(doubles, new CompareNumericDesc());

        quickSort.imprimir(false);

        quickSortDesc.imprimir(false);

        QuickSort quickSortS = new QuickSort<String>(new String[]{"C", "E", "F", "C", "I", "A"}, new CompareString());
        QuickSort quickSortSDesc = new QuickSort<String>(new String[]{"C", "E", "F", "C", "I", "A"}, new CompareStringDesc());

        quickSortS.imprimir();
        quickSortSDesc.imprimir();


        MergeSort mergeSort = new MergeSort<Double>(new Double[]{10.0, 4.0, 8.0, 6.0, 1.0, 5.0}, new CompareNumeric());
        MergeSort mergeSortDesc = new MergeSort<Double>(new Double[]{23.0, 79.0, 78.0, 23.0, 434.0, -2.0}, new CompareNumericDesc());

        mergeSort.imprimir();
        mergeSortDesc.imprimir();*/

    }

}
