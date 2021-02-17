public class Treadmill extends Obstacle{

    private int distance = 15;

    public Treadmill() {
    }

    public Treadmill(int distance) {
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }
}
