public class Robot implements Overcomable{

    private String model;
    private double power;

    public Robot(String model, double power) {
        this.model = model;
        this.power = power;
    }

    public String getModel() {
        return model;
    }

    public double getPower() {
        return power;
    }

    @Override
    public void jump() {
        System.out.println("Robot " + model + " power = " + power + "kW jump");
    }

    @Override
    public void run() {
        System.out.println("Robot " + model + " power = " + power + "kW run");

    }
}
