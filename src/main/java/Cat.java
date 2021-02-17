public class Cat implements Actions{

    private int maxRunDistance = 15;
    private int maxJumpHeight = 5;


    public Cat() {
    }

    public Cat(int maxRunDistance, int maxJumpHeight) {
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
    }

    @Override
    public int run(int distance) {
        if (this.maxRunDistance >= distance){
            System.out.println("Кот смог пробежать");
            return 1;
        }else {
            System.out.println("Кот  не смог пробежать");
            return 0;
        }
    }

    @Override
    public int jump(int height) {
        if (this.maxJumpHeight >= height){
            System.out.println("Кот смог перепрыгнуть");
            return 1;
        }else{
            System.out.println("Кот не смог перепрыгнуть");
            return 0;
        }
    }
}
