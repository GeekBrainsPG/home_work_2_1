import java.util.ArrayList;
import java.util.List;

public class Course {

    private final List<Obstacles> obstacles = new ArrayList<>();

    public void addObstacle(Obstacles obstacle) {
        obstacles.add(obstacle);
    }

    public void doIt(Team team) {
        for (Species teamMember : team.getTeamMembers()) {
            for (Obstacles obstacle : obstacles) {
                if (teamMember != null) {
                    try {
                        obstacle.doAction(teamMember);
                    } catch (RuntimeException exception) {
                        System.out.println(exception.getMessage());
                        break;
                    }
                }
            }

            System.out.println();
        }
    }

}
