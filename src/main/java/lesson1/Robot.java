package lesson1;

public class Robot {

    void run (){
        System.out.println("Robot is running");
    }
    void jump (){
        System.out.println("Robot is jumping");
    }

    public static void main(String[] args) {
        Robot robot = new Robot();
        robot.jump();
        robot.run();
    }
}
