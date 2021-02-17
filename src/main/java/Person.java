public class Person implements Actions {

    private int maxRunDistance = 30;
    private int maxJumpHeight = 10;


    public Person() {
    }

    public Person(int maxRunDistance, int maxJumpHeight) {
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
    }

    @Override
    public int run(int distance) {
        if (this.maxRunDistance >= distance) {
            System.out.println("Человек смог добежать");
            return 1;
        }else{
            System.out.println("Человек не смог добежать");
            System.out.println("Его соревнования закончены!");
            return 0;
        }
    }

    @Override
    public int jump(int height) {
        if (this.maxJumpHeight >= height) {
            System.out.println("Человек смог перепрыгнуть");
            return 1;
        }else{
            System.out.println("Человек не смог перепрыгнуть");
            System.out.println("Его соревнования закончены!");
            return 0;
        }
    }
}
