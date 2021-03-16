public class Human implements Overcomable{

    private String name;
    private int age;

    private double maxJumpHeight;
    private double maxRunLength;
    private double distanceRun;

    public Human(String name, int age, double maxJumpHeight, double maxRunLength) {
        this.name = name;
        this.age = age;
        this.maxJumpHeight = maxJumpHeight;
        this.maxRunLength = maxRunLength;
        distanceRun = 0;
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
        if ( (distanceRun += runLength) <= maxRunLength) {
            System.out.println("пробежал " + runLength);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void printInfo() {
        System.out.println("Человек " + name + ", возраст " + age);
    }
}
