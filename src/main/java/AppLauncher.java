import java.util.ArrayList;
import java.util.List;

public class AppLauncher {

    public static void main(String[] args) {
        List<Species> team = new ArrayList<>();
        team.add(new Cat());
        team.add(new Human());
        team.add(new Robot());

        List<Obstacles> obstacles = new ArrayList<>();
        obstacles.add(new ClimbWall());
        obstacles.add(new Treadmill());
        obstacles.add(new ClimbWall());

        for (Species species : team) {
            for (Obstacles obstacle : obstacles) {
                obstacle.doAction(species);
            }

            System.out.println();
        }
    }

}

