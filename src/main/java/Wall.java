public class Wall extends Obstacle{

    private int height = 10;

    public Wall() {
    }

    public Wall(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }
}
