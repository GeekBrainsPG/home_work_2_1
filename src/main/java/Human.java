public class Human implements Species {

    private final int jumpRangeLimit;
    private final int rumRangeLimit;
    private boolean isAllDistancePassed = true;

    public Human(int jumpRangeLimit, int rumRangeLimit) {
        this.jumpRangeLimit = jumpRangeLimit;
        this.rumRangeLimit = rumRangeLimit;
    }

    @Override
    public void run(int distance) {
        if (distance <= rumRangeLimit) {
            System.out.println("Human is running");
        } else {
            isAllDistancePassed = false;
            throw new RuntimeException("Human can't run distance of " + rumRangeLimit + "km");
        }
    }

    @Override
    public void jump(int height) {
        if (height <= jumpRangeLimit) {
            System.out.println("Human is jumping");
        } else {
            isAllDistancePassed = false;
            throw new RuntimeException("Human can't jump with height of" + jumpRangeLimit + "m");
        }
    }

    @Override
    public boolean isAllDistancePassed() {
        return isAllDistancePassed;
    }
}
