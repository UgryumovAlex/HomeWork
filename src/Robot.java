public class Robot implements Overcomable{

    private String model;
    private double power;

    private double maxJumpHeight;
    private double maxRunLength;


    public Robot(String model, double power, double maxJumpHeight, double maxRunLength) {
        this.model = model;
        this.power = power;
        this.maxJumpHeight = maxJumpHeight;
        this.maxRunLength = maxRunLength;
    }

    @Override
    public boolean jump(double jumpHeight) {
        if (maxJumpHeight >= jumpHeight) {
            System.out.println("прыгнул " + jumpHeight);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean run(double runLength) {
        if (maxRunLength >= runLength) {
            System.out.println("пробежал " + runLength);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void printInfo() {
        System.out.println("Робот " + model + " мощность = " + power + " кВт");
    }

}
