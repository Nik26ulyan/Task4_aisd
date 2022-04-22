package ru.vsu.sc.uliyanov_n_s;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointSorterTest {

    @Test
    void sortPointsWithHeapTest1() {
        double[][] input = {{1, 1}, {6, 6}, {4, 4}, {7, 7}, {5, 5}, {3, 3}, {2, 2}, {9, 9}, {8, 8}};
        int valueOfPoints = 4;

        MyPoint[] points = PointSorter.array2ToPointArray(input);
        MyPoint[] sortedPointsWithHeap = PointSorter.sortPointsWithHeap(points, valueOfPoints);

        double[][] actualResult = PointSorter.pointArrayToArray2(sortedPointsWithHeap);
        double[][] expectedResult = {{1, 1}, {2, 2}, {3, 3}, {4, 4}};

        assertArrayEquals(actualResult, expectedResult);
    }

    @Test
    void sortPointsWithHeapTest2() {
        double[][] input = {{2, 3}, {4, 2}, {9, 3}, {8, 4}, {5, 2}, {4, 4}, {1, 1}};
        int valueOfPoints = 5;

        MyPoint[] points = PointSorter.array2ToPointArray(input);
        MyPoint[] sortedPointsWithHeap = PointSorter.sortPointsWithHeap(points, valueOfPoints);

        double[][] actualResult = PointSorter.pointArrayToArray2(sortedPointsWithHeap);
        double[][] expectedResult = {{1, 1}, {2, 3}, {4, 2}, {5, 2}, {4, 4}};

        assertArrayEquals(actualResult, expectedResult);
    }

    @Test
    void sortPointsWithHeapTest3() {
        double[][] input = {{1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 0.5}};
        int valueOfPoints = 1;

        MyPoint[] points = PointSorter.array2ToPointArray(input);
        MyPoint[] sortedPointsWithHeap = PointSorter.sortPointsWithHeap(points, valueOfPoints);

        double[][] actualResult = PointSorter.pointArrayToArray2(sortedPointsWithHeap);
        double[][] expectedResult = {{1, 0.5}};

        assertArrayEquals(actualResult, expectedResult);
    }

    @Test
    void sortPointsWithHeapTest4() {
        double[][] input = {{0.888, 0.888}, {0.333, 0.333}, {0.555, 0.555}, {0.444, 0.444}, {0.222, 0.222}};
        int valueOfPoints = 3;

        MyPoint[] points = PointSorter.array2ToPointArray(input);
        MyPoint[] sortedPointsWithHeap = PointSorter.sortPointsWithHeap(points, valueOfPoints);

        double[][] actualResult = PointSorter.pointArrayToArray2(sortedPointsWithHeap);
        double[][] expectedResult = {{0.222, 0.222}, {0.333, 0.333}, {0.444, 0.444}};

        assertArrayEquals(actualResult, expectedResult);
    }

    @Test
    void sortPointsWithHeapTest5() {
        double[][] input = {{723.12, 812.33}, {612.64, 124.32}, {361.43, 433.23}, {934.43, 544.76}, {834.55, 453.65}};
        int valueOfPoints = 5;

        MyPoint[] points = PointSorter.array2ToPointArray(input);
        MyPoint[] sortedPointsWithHeap = PointSorter.sortPointsWithHeap(points, valueOfPoints);

        double[][] actualResult = PointSorter.pointArrayToArray2(sortedPointsWithHeap);
        double[][] expectedResult = {{361.43, 433.23}, {612.64, 124.32}, {834.55, 453.65}, {934.43, 544.76}, {723.12, 812.33}};

        assertArrayEquals(actualResult, expectedResult);
    }
}