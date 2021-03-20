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
        System.out.println("Java, уровень 2, домашняя работа №2");

        String[][] strArr = {
                              {"Весна", "Лето", "Осень", "Зима"},
                              {"Азия", "Европа", "Америка", "Африка"},
                              {"Футбол", "Хоккей", "Баскетбол", "Воллейбол"},
                              {"Конь", "Слон", "Ладья", "Ферзь"}
                             };
        try {
            int arrayRes = calcArray(strArr);
            System.out.println(arrayRes);
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        }


    }

    private static int calcArray(String[][] strArr) throws MyArraySizeException {
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
        System.out.println("Размерность массива корректная");

        return 0; //Пока подсчёт элементов не реализован
    }
}
