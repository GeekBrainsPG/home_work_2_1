public class ClimbWall implements Obstacles {
    @Override
    public void doAction(Species species) {
        species.jump();
    }
}
