package com.javacourse.homework.task28;

public class Iterator <T> {

    private T [] array; // 5  ["A", "C"]
    private int cursor = -1;

    // внешний array -> @khfjjrbgjbr
    // текущий array -> @khfjjrbgjbr

    public Iterator(T [] array) {
        this.array = array;
    }

    public boolean hasNext() {
        if (cursor + 1 < array.length) {
            return true;
        } else {
            return false;
        }
    }

    public T next() throws Exception {
        cursor++;
        if (cursor >= array.length) {
            String errorMessage = String.format("Index %s out of bounds for length %s", cursor, array.length);
            throw new Exception(errorMessage);
        }
        return array[cursor];
    }

    public void remove() {
        cursor++;  // 0
        // создать массив размер которого меньше на 1
        int length = array.length;  // 3
        T [] newArray = (T[])new Object[length - 1];  // 2
        // бежать фором и игнорировать элемент под индексом "курсор"
        int j = 0;
        for (int i = 0; i < length; i++) {  // 0, 1, 2
            if (i != cursor) {
                newArray[j] = array[i];
                j++;
            }
        }
        array = newArray;
        cursor--;
    }
}
