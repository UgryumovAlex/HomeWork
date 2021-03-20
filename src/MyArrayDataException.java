public class MyArrayDataException extends IllegalArgumentException{

    private int cellX;
    private int cellY;

    public MyArrayDataException(int cellX, int cellY) {
        this.cellX = cellX;
        this.cellY = cellY;
    }

    public int getCellX() {
        return cellX;
    }

    public int getCellY() {
        return cellY;
    }
}
