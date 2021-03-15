public class Wall implements Obstructive{
    private double height;

    public Wall(double height) {
        this.height = height;
    }


    @Override
    public void overcome(Overcomable oc) {
        oc.jump();
    }
}
