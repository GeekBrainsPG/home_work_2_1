public class Robot implements Species {

    private final int jumpRangeLimit;
    private final int rumRangeLimit;
    private boolean isAllDistancePassed = true;

    public Robot(int jumpRangeLimit, int rumRangeLimit) {
        this.jumpRangeLimit = jumpRangeLimit;
        this.rumRangeLimit = rumRangeLimit;
    }

    @Override
    public void run(int distance) {
        if (distance <= rumRangeLimit) {
            System.out.println("Robot is running");
        } else {
            isAllDistancePassed = false;
            throw new RuntimeException("Robot can't run distance of " + rumRangeLimit + "km");
        }
    }

    @Override
    public void jump(int height) {
        if (height <= jumpRangeLimit) {
            System.out.println("Robot is jumping");
        } else {
            isAllDistancePassed = false;
            throw new RuntimeException("Robot can't jump with height of" + jumpRangeLimit + "m");
        }
    }

    @Override
    public boolean isAllDistancePassed() {
        return isAllDistancePassed;
    }
}
