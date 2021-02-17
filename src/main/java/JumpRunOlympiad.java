public class JumpRunOlympiad {

    Actions [] participantsList = new Actions[100];
    Obstacle [] obstaclesList = new Obstacle[100];

    private int participantsPosition = 0;
    private int obstaclePosition = 0;

    public void fillParticipantsList(Actions actions){
        if (this.participantsPosition >= 100){
            System.out.println("Список участников заполнен!");
        }else {
            this.participantsList[this.participantsPosition] = actions;
            this.participantsPosition++;
        }
    }

    public void fillObstacleList(Obstacle obstacle){
        if (this.obstaclePosition >= 100){
            System.out.println("Список препятствий заполнен!");
            this.obstaclePosition++;
        }
    }

    public void startCompetition(){
        for (Actions actions : participantsList){

            if (actions == null){
                System.out.println("Все участники принимают участие в олимпиаде.");
                break;
            }
            for (Obstacle obstacle : obstaclesList){
                int ans;

                if (obstacle == null){
                    System.out.println("Все препятствия пройдены.");
                    System.out.println();
                    break;
                }

                if (obstacle instanceof Wall){
                    ans = actions.jump(((Wall) obstacle).getHeight());
                }else {
                    ans = actions.run(((Treadmill) obstacle).getDistance());
                }
                if (ans == 0){
                    break;
                }
            }
        }
    }

}
