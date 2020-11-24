package examples.chapter3.insertionsort;

public class InsertionSort {
    public static Integer[] sort(Integer[] array) {
        for (int i = 1; i < array.length; i++) {
            int currentElement = array[i];
            int cursor = i - 1;
            int positionToSave = i;
            while (cursor > -1) {
                if (array[cursor] > currentElement) {
                    array[cursor + 1] = array[cursor];
                    positionToSave = cursor;
                }
                cursor--;
            }
            array[positionToSave] = currentElement;
        }

        return array;
    }
}
