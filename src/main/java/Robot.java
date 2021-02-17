public class Robot implements Actions{

    private int maxRunDistance = 25;
    private int maxJumpHeight = 15;


    public Robot() {

    }

    public Robot(int maxRunDistance, int maxJumpHeight) {
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
    }

    @Override
    public int run(int distance) {
        if (this.maxRunDistance >= distance){
            System.out.println("Робот смог пробежать");
            return 1;
        }else {
            System.out.println("Робот не смог пробежать");
            System.out.println("Его соревнования закончены!");
            return 0;
        }
    }

    @Override
    public int jump(int height) {
        if (this.maxJumpHeight >= height){
            System.out.println("Робот смог перепрыгнуть");
            return 1;
        }else {
            System.out.println("Робот не смог перепрыгнуть");
            System.out.println("Его соревнования закончены!");
            return 0;
        }

    }
}
