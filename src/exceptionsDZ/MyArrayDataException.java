package exceptionsDZ;

public class MyArrayDataException extends RuntimeException {
    public int i;
    public int j;

    public MyArrayDataException(int i, int j) {
        super("Ошибка в ячейке: строка " + i + ", столбец " + j);
        this.i = i;
        this.j = j;
    }
}
