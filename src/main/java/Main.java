

public class Main {
    public static void main(String[] args) {

        JumpRunOlympiad jumpRunOlympiad = new JumpRunOlympiad();

        for (int i = 0; i < 2; i++) {

            jumpRunOlympiad.fillParticipantsList(new Cat());
            jumpRunOlympiad.fillParticipantsList(new Robot());
            jumpRunOlympiad.fillParticipantsList(new Person());


            jumpRunOlympiad.fillObstacleList(new Treadmill());
            jumpRunOlympiad.fillObstacleList(new Wall());

        }

        jumpRunOlympiad.startCompetition();

    }
}
