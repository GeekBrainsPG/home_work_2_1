import java.util.Random;

public class ClimbWall implements Obstacles {

    private static final int MAX_CLIMB_RANGE = 10;

    private final int range = new Random().nextInt(MAX_CLIMB_RANGE);

    @Override
    public void doAction(Species species) {
        species.jump(range);
    }
}
