import java.util.Random;

public class Treadmill implements Obstacles {

    private static final int MAX_RUN_RANGE = 10;

    private final int range = new Random().nextInt(MAX_RUN_RANGE);

    @Override
    public void doAction(Species species) {
        species.run(range);
    }
}
