package lesson1;

public class Competition {

    public static void main(String[] args) {

        Human human = new Human();
        Cat cat = new Cat();
        Robot robot = new Robot();
        Wall wall = new Wall();
        Treadmill treadmill = new Treadmill();


        Obstacle[] obstacles = {wall, treadmill};
        Participant[] participants = {human, cat, robot};

        for (Participant participant : participants) {
            for (int i = 1; i < obstacles.length; i++)
            participant.run();
            participant.jump();

        }
    }
}
