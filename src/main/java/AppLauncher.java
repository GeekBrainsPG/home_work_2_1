import java.util.ArrayList;
import java.util.List;

public class AppLauncher {

    public static void main(String[] args) {
//        doTaskFromTrainingManual();
        doTaskFromLesson();
    }

    public static void doTaskFromLesson() {
        Course course = new Course();
        course.addObstacle(new ClimbWall());
        course.addObstacle(new Treadmill());
        course.addObstacle(new ClimbWall());
        course.addObstacle(new Treadmill());

        Team team1 = new Team(
                "Team 1",
                new Cat(8, 8),
                new Human(5, 9),
                new Robot(3, 6)
        );

        course.doIt(team1);

        team1.showResult();
        System.out.println();
        team1.showSuccessResult();
    }

    public static void doTaskFromTrainingManual() {
        List<Species> team = new ArrayList<>();
        team.add(new Cat(8, 8));
        team.add(new Human(5, 9));
        team.add(new Robot(3, 6));

        List<Obstacles> obstacles = new ArrayList<>();
        obstacles.add(new ClimbWall());
        obstacles.add(new Treadmill());
        obstacles.add(new ClimbWall());

        for (Species species : team) {
            for (Obstacles obstacle : obstacles) {
                try {
                    obstacle.doAction(species);
                } catch (RuntimeException exception) {
                    System.out.println(exception.getMessage());
                    break;
                }
            }

            System.out.println();
        }
    }

}

