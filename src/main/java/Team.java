public class Team {

    private String teamName;
    private Species[] teamMembers = new Species[4];

    public Team(String teamName, Species firstPlayer) {
        this.teamName = teamName;
        teamMembers[0] = firstPlayer;
    }

    public Team(String teamName, Species firstPlayer, Species secondPlayer) {
        this.teamName = teamName;
        teamMembers[0] = firstPlayer;
        teamMembers[1] = secondPlayer;
    }

    public Team(String teamName, Species firstPlayer, Species secondPlayer, Species thirdPlayer) {
        this.teamName = teamName;
        teamMembers[0] = firstPlayer;
        teamMembers[1] = secondPlayer;
        teamMembers[2] = thirdPlayer;
    }

    public Team(String teamName, Species firstPlayer, Species secondPlayer, Species thirdPlayer, Species fourthPlayer) {
        this.teamName = teamName;
        teamMembers[0] = firstPlayer;
        teamMembers[1] = secondPlayer;
        teamMembers[2] = thirdPlayer;
        teamMembers[3] = fourthPlayer;
    }

    public Species[] getTeamMembers() {
        return teamMembers;
    }

    public void showResult() {
        for (int i = 0; i < teamMembers.length; i++) {
            if (teamMembers[i] != null) {
                boolean isDistancePassed = teamMembers[i].isAllDistancePassed();

                if (isDistancePassed) {
                    System.out.printf("%d player passed all distances \n", ++i);
                } else {
                    System.out.printf("%d player didn't passed all distances \n", ++i);
                }
            }
        }
    }

    public void showSuccessResult() {
        for (int i = 0; i < teamMembers.length; i++) {
            if (teamMembers[i] != null) {
                boolean isDistancePassed = teamMembers[i].isAllDistancePassed();

                if (isDistancePassed) {
                    System.out.printf("%d player passed all distances \n", ++i);
                }
            }
        }
    }
}
