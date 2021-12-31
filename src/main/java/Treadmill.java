public class Treadmill implements Obstacles {
    @Override
    public void doAction(Species species) {
        species.run();
    }
}
