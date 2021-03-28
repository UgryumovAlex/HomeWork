import java.util.Arrays;

public class HomeWork {

    static final int size = 10000000;
    static final int h = size / 2;

    public static void main(String[] args) {

        float[] arrNoThread = new float[size]; //массив для расчёта в один поток
        float[] arrTwoThread = new float[size]; //массив для расчёта в два потока

        Arrays.fill(arrNoThread, 1);
        Arrays.fill(arrTwoThread, 1);

        calcNoThread(arrNoThread); //Расчёт в одном потоке
        calcTwoThreads(arrTwoThread); //Расчёт в два потока

        System.out.println("Результат сравнения двух массивов : " + Arrays.equals(arrNoThread, arrTwoThread));
    }

    private static void calcNoThread(float[] arr) {
        Calculation calc = new Calculation(arr);

        long a = System.currentTimeMillis();
        calc.run();
        System.out.println("Расчёт массива в один поток : " + ((float)(System.currentTimeMillis() - a)/1000) + " сек.");
    }

    private static void calcTwoThreads(float[] arr) {

        float[] arr1 = new float[h];
        float[] arr2 = new float[h];

        long a = System.currentTimeMillis();

        System.arraycopy(arr, 0, arr1, 0, h);
        System.arraycopy(arr, h, arr2, 0, h);

        Thread t1 = new Thread(new Calculation(arr1));
        Thread t2 = new Thread(new Calculation(arr2, h));

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.arraycopy(arr1, 0, arr, 0, h);
        System.arraycopy(arr2, 0, arr, h, h);

        System.out.println("Расчёт массива в два потока : " + ((float)(System.currentTimeMillis() - a)/1000) + " сек.");
    }
}
