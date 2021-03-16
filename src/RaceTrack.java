public class RaceTrack implements Obstructive{
    private double length;

    public RaceTrack(double length) {
        this.length = length;
    }

    @Override
    public boolean overcome(Overcomable oc) {
        System.out.println("Препятствие : беговая дорожка длиной " + length);
        return oc.run(length);
    }
}
