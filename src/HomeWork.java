/**
 * 1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4.
 *    При подаче массива другого размера необходимо бросить исключение MyArraySizeException.
 * 2. Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
 *    Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ
 *    или текст вместо числа), должно быть брошено исключение MyArrayDataException с детализацией,
 *    в какой именно ячейке лежат неверные данные.
 * 3. В методе main() вызвать полученный метод, обработать возможные исключения MyArraySizeException
 *    и MyArrayDataException и вывести результат расчета (сумму элементов, при условии что подали
 *    на вход корректный массив).
 * Заметка: Для преобразования строки к числу используйте статический метод класса Integer:
 * Integer.parseInt(сюдаподатьстроку);
 * Заметка: Если Java не сможет преобразовать входную строку (в строке число криво написано), то будет сгенерировано исключение NumberFormatException.
 *
 * */

public class HomeWork {

    public static void main(String[] args) {

        /*  Некорректная размерность
        String[][] intArr = {
                                {"1", "11", "111", "1111"},
                                {"2", "22", "222", "2222"},
                                {"3",  "333", "3333"},
                                {"4", "44", "444", "4444"}
                             };
        */

        /* Некорректное значение в ячейке
        String[][] intArr = {
                                {"1", "11", "111", "1111"},
                                {"2", "2B2", "222", "2222"},
                                {"3", "33", "333", "3333"},
                                {"4", "44", "444", "4444"}
                             };
        */

        String[][] intArr = {
                                {"1", "11", "111", "1111"},
                                {"2", "22", "222", "2222"},
                                {"3", "33", "333", "3333"},
                                {"4", "44", "444", "4444"}
                             };
        try {
            System.out.println("Сумма элементов массива : " + calcArray(intArr));
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println("Некорректное значение в ячейке ["+(e.getCellX()+1)+"]["+(e.getCellY()+1)+"] = " +
                                intArr[e.getCellX()][e.getCellY()]);
        }
    }

    private static int calcArray(String[][] strArr) throws MyArraySizeException, MyArrayDataException {
        //Проверяем размерность входящего массива
        if (strArr.length != 4) {
            throw new MyArraySizeException("Количество строк массива не равно 4");
        } else {
            for (int i=0; i < strArr.length; i++) {
                if (strArr[i].length != 4) {
                    throw new MyArraySizeException("Количество столбцов строки " + (i+1) + " не равно 4");
                }
            }
        }

        //Перебираем все элементы, ищем сумму
        int arraySum = 0;
        for (int i=0; i < strArr.length; i++) {
            for (int j=0; j < strArr[i].length; j++) {
                try {
                    arraySum += Integer.parseInt(strArr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }

        return arraySum;
    }
}
