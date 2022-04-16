package ru.vsu.sc.uliyanov_n_s;

import java.util.Arrays;

public class PointSorter {
    public static MyPoint[] sortPointsWithHeap(MyPoint[] arr, int valueOfElements) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        for (int i = n - 1; i >= 0; i--) {
            MyPoint temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }

        MyPoint[] newArr = new MyPoint[valueOfElements];

        for (int i = 0; i < valueOfElements; i++) {
            newArr[i] = arr[i];
        }

        return newArr;
    }

    private static void heapify(MyPoint[] arr, int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < n && arr[l].getDistanceToCenter() > arr[largest].getDistanceToCenter()) {
            largest = l;
        }

        if (r < n && arr[r].getDistanceToCenter() > arr[largest].getDistanceToCenter()) {
            largest = r;
        }

        if (largest != i) {
            MyPoint swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, n, largest);
        }
    }

    public static double[][] pointArrayToArray2(MyPoint[] pointsArr) {
        double[][] arr = new double[pointsArr.length][2];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = pointsArr[i].toArray();
        }

        return arr;
    }

    public static MyPoint[] array2ToPointArray(double[][] arr) {
        MyPoint[] pointsArr = new MyPoint[arr.length];

        for (int i = 0; i < arr.length; i++) {
            pointsArr[i] = new MyPoint(arr[i][0], arr[i][1]);
        }

        return pointsArr;
    }
}
