public class Wall implements Obstructive{
    private double height;

    public Wall(double height) {
        this.height = height;
    }

    @Override
    public boolean overcome(Overcomable oc) {
        System.out.println("Препятствие : стена высотой " + height);
        return oc.jump(height);
    }
}
