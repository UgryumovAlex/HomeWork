public class Calculation implements Runnable {
    private final int startPos;
    private final float[] arr;

    public Calculation(float[] arr, int startPos) {
        this.startPos = startPos;
        this.arr = arr;
    }

    public Calculation(float[] arr) {
        this.arr = arr;
        startPos = 0;
    }

    @Override
    public void run() {
        for (int i=0; i < arr.length; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + (float)(i+startPos) / 5) * Math.cos(0.2f + (float)(i+startPos) / 5) * Math.cos(0.4f + (float)(i+startPos) / 2));
        }
    }
}
