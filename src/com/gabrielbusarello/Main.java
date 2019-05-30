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
        String[] strings = readArchives.getFileStrings("C:/Users/Gabriel/IdeaProjects/Ordenacao/src/arquivos/palavras_100000.txt", 100000);
        String[] strings1 = readArchives.getFileStrings("C:/Users/Gabriel/IdeaProjects/Ordenacao/src/arquivos/palavras_1000000.txt", 1000000);
        LatLng[] latLngs = readArchives.getFileObject("C:/Users/Gabriel/IdeaProjects/Ordenacao/src/arquivos/objetos_100000.txt", 100000);
        LatLng[] latLngs1 = readArchives.getFileObject("C:/Users/Gabriel/IdeaProjects/Ordenacao/src/arquivos/objetos_1000000.txt", 1000000);

        // BubbleSort bubbleSort = new BubbleSort<Double>(doubles1, new CompareNumeric());
        // BubbleSort bubbleSortDesc = new BubbleSort<Double>(doubles1, new CompareNumericDesc());
        // BubbleSort bubbleSortS = new BubbleSort<String>(strings1, new CompareString());
        // BubbleSort bubbleSortSDesc = new BubbleSort<String>(strings1, new CompareStringDesc());
        // BubbleSort bubbleSortO = new BubbleSort<LatLng>(latLngs1, new CompareObject());
        // BubbleSort bubbleSortODesc = new BubbleSort<LatLng>(latLngs1, new CompareObjectDesc());

        // long timeBubble = bubbleSort.imprimir();
        // System.out.println("timeBubble " + timeBubble);
        // long timeBubbleDesc = bubbleSortDesc.imprimir();
        // System.out.println("timeBubbleDesc " + timeBubbleDesc);
        // long timeBubbleS = bubbleSortS.imprimir();
        // System.out.println("timeBubbleS " + timeBubbleS);
        // long timeBubbleSDesc = bubbleSortSDesc.imprimir();
        // System.out.println("timeBubbleSDesc " + timeBubbleSDesc);
        // long timeBubbleO = bubbleSortO.imprimir();
        // System.out.println("timeBubbleO " + timeBubbleO);
        // long timeBubbleODesc = bubbleSortODesc.imprimir();
        // System.out.println("timeBubbleODesc " + timeBubbleODesc);

        // SelectionSort selectionSort = new SelectionSort<Double>(doubles1, new CompareNumeric());
        // SelectionSort selectionSortDesc = new SelectionSort<Double>(doubles1, new CompareNumericDesc());
        // SelectionSort selectionSortS = new SelectionSort<String>(strings1, new CompareString());
        // SelectionSort selectionSortSDesc = new SelectionSort<String>(strings1, new CompareStringDesc());
        // SelectionSort selectionSortO = new SelectionSort<LatLng>(latLngs1, new CompareObject());
        // SelectionSort selectionSortODesc = new SelectionSort<LatLng>(latLngs1, new CompareObjectDesc());

        // long timeSelection = selectionSort.imprimir();
        // System.out.println("timeSelection " + timeSelection);
        // long timeSelectionDesc = selectionSortDesc.imprimir();
        // System.out.println("timeSelectionDesc " + timeSelectionDesc);
        // long timeSelectionS = selectionSortS.imprimir();
        // System.out.println("timeSelectionS " + timeSelectionS);
        // long timeSelectionSDesc= selectionSortSDesc.imprimir();
        // System.out.println("timeSelectionSDesc " + timeSelectionSDesc);
        // long timeSelectionO = selectionSortO.imprimir();
        // System.out.println("timeSelectionO " + timeSelectionO);
        // long timeSelectionODesc= selectionSortODesc.imprimir();
        // System.out.println("timeSelectionODesc " + timeSelectionODesc);

        InsertionSort insertionSort = new InsertionSort<Double>(doubles1, new CompareNumeric());
        // InsertionSort insertionSortDesc = new InsertionSort<Double>(doubles1, new CompareNumericDesc());
        // InsertionSort insertionSortS = new InsertionSort<String>(strings1, new CompareString());
        // InsertionSort insertionSortSDesc = new InsertionSort<String>(strings1, new CompareStringDesc());
        // InsertionSort insertionSortO = new InsertionSort<LatLng>(latLngs1, new CompareObject());
        // InsertionSort insertionSortODesc = new InsertionSort<LatLng>(latLngs1, new CompareObjectDesc());

        long timeInsertion = insertionSort.imprimir();
        System.out.println("timeInsertion " + timeInsertion);
        // long timeInsertionDesc = insertionSortDesc.imprimir();
        // System.out.println("timeInsertionDesc " + timeInsertionDesc);
        // long timeInsertionS = insertionSortS.imprimir();
        // System.out.println("timeInsertionS " + timeInsertionS);
        // long timeInsertionSDesc= insertionSortSDesc.imprimir();
        // System.out.println("timeInsertionSDesc " + timeInsertionSDesc);
        // long timeInsertionO = insertionSortO.imprimir();
        // System.out.println("timeInsertionO " + timeInsertionO);
        // long timeInsertionODesc= insertionSortODesc.imprimir();
        // System.out.println("timeInsertionODesc " + timeInsertionODesc);

        // QuickSort quickSort = new QuickSort<Double>(doubles1, new CompareNumeric());
        // QuickSort quickSortDesc = new QuickSort<Double>(doubles1, new CompareNumericDesc());
        // QuickSort quickSortS = new QuickSort<String>(strings1, new CompareString());
        // QuickSort quickSortSDesc = new QuickSort<String>(strings1, new CompareStringDesc());
        // QuickSort quickSortO = new QuickSort<LatLng>(latLngs1, new CompareObject());
        // QuickSort quickSortODesc = new QuickSort<LatLng>(latLngs1, new CompareObjectDesc());

        // long timeQuick = quickSort.imprimir();
        // System.out.println("timeQuick " + timeQuick);
        // long timeQuickDesc = quickSortDesc.imprimir();
        // System.out.println("timeQuickDesc " + timeQuickDesc);
        // long timeQuickS = quickSortS.imprimir();
        // System.out.println("timeQuickS " + timeQuickS);
        // long timeQuickSDesc= quickSortSDesc.imprimir();
        // System.out.println("timeQuickSDesc " + timeQuickSDesc);
        // long timeQuickO = quickSortO.imprimir();
        // System.out.println("timeQuickO " + timeQuickO);
        // long timeQuickODesc= quickSortODesc.imprimir();
        // System.out.println("timeQuickODesc " + timeQuickODesc);

        // MergeSort mergeSort = new MergeSort<Double>(doubles1, new CompareNumeric());
        // MergeSort mergeSortDesc = new MergeSort<Double>(doubles1, new CompareNumericDesc());
        // MergeSort mergeSortS = new MergeSort<String>(strings1, new CompareString());
        // MergeSort mergeSortSDesc = new MergeSort<String>(strings1, new CompareStringDesc());
        // MergeSort mergeSortO = new MergeSort<LatLng>(latLngs1, new CompareObject());
        // MergeSort mergeSortODesc = new MergeSort<LatLng>(latLngs1, new CompareObjectDesc());

        // long timeMerge = mergeSort.imprimir();
        // System.out.println("timeMerge " + timeMerge);
        // long timeMergeDesc = mergeSortDesc.imprimir();
        // System.out.println("timeMergeDesc " + timeMergeDesc);
        // long timeMergeS = mergeSortS.imprimir();
        // System.out.println("timeMergeS " + timeMergeS);
        // long timeMergeSDesc= mergeSortSDesc.imprimir();
        // System.out.println("timeMergeSDesc " + timeMergeSDesc);
        // long timeMergeO = mergeSortO.imprimir();
        // System.out.println("timeMergeO " + timeMergeO);
        // long timeMergeODesc= mergeSortODesc.imprimir();
        // System.out.println("timeMergeODesc " + timeMergeODesc);

    }

}
