package lesson1;

public class RunningTrack {
    void runrun(){
        System.out.println("Time for running");
    }
    public static class Cat extends RunningTrack {
        @Override
        public void runrun() {
            super.runrun();
            System.out.println("Cat runs fast");
        }
    }
    public static class Human extends RunningTrack{
        @Override
        public void runrun() {
            System.out.println("Human runs slow");
        }
    }
    public static class Robot extends RunningTrack {
        @Override
        public void runrun() {
            System.out.println("Robot runs very fast");

            }
        }
    public static class TeamRun{
        public static void main(String[] args) {
            Cat cat = new Cat();
            cat.runrun();
            Human human = new Human();
            human.runrun();
            Robot robot = new Robot();
            robot.runrun();
        }
    }
    }

