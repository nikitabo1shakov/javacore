package lesson14;

import java.util.Arrays;

/**
    1. Написать метод, которому в качестве аргумента передается не пустой одномерный целочисленный массив. Метод должен вернуть новый массив, который получен путем вытаскивания из исходного массива элементов, идущих после последней четверки. Входной массив должен содержать хотя бы одну четверку, иначе в методе необходимо выбросить RuntimeException.
    Написать набор тестов для этого метода (по 3-4 варианта входных данных).
        Вх: [ 1 2 4 4 2 3 4 1 7 ] -> вых: [ 1 7 ].
 */

public class Task1 {

    public int[] getNewMassiveAfterNumber4(int[] array) throws RuntimeException {
        int nextIndexAfter4 = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 4) {
                nextIndexAfter4 = i + 1;
            }
        }
        if (nextIndexAfter4 == -1) {
            throw new RuntimeException();
        } else {
            return Arrays.copyOfRange(array,nextIndexAfter4,array.length);
        }
    }

}