public class RaceTrack implements Obstructive{
    private double length;

    public RaceTrack(double length) {
        this.length = length;
    }

    @Override
    public void overcome(Overcomable oc) {
        oc.run();
    }
}
