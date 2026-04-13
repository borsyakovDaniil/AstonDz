package exceptionsDZ;

public class exceptions {
    public static int processArray(String[][] matrix) {
        int sum = 0;
        {
            if (matrix.length != 4)
                throw new MyArraySizeException("В массиве должно быть 4 строки, а пришло :" + matrix.length);
        }
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i].length != 4) {
                throw new MyArraySizeException("В массиве должно быть 4 столбца, а пришло :" + matrix.length);
            }
        }
        return sum;
    }

    int sum = 0;

    public int sumMatrix(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[i].length; j++) {
                try {
                    sum += (Integer.parseInt(matrix[i][j]));
                } catch
                (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }

        return sum;
    }

    public static void main(String[] args) {

        String[][] matrix = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };
        try {
            processArray(matrix);
            exceptions obj = new exceptions();
            int result = obj.sumMatrix(matrix);
            System.out.println("Сумма: " + result);
        } catch (MyArraySizeException e) {
            System.out.println("Массив имеет не верный размер " + e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println("Ошибка данных: " + e.getMessage());
        }

        try {
            int[] array = new int[5];
            array[5] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива!");
        }
    }
}

