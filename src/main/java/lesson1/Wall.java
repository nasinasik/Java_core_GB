package lesson1;

public abstract class Wall {
    void jump_wall() {
        System.out.println("One of the team jumps");
    }

    public static class Cat extends Wall {
        @Override
        public void jump_wall() {
           super.jump_wall();
            System.out.println("Cat jumps successfully");
        }
    }

    public static class Robot extends Wall {
        @Override
        public void jump_wall() {
          //  super.jump_wall();
            System.out.println("Robot can't jump");
        }
    }

    public static class Human extends Wall {
        @Override
        public void jump_wall() {
          //  super.jump_wall();
            System.out.println("Human jumps badly");
        }
    }

    public static class TeamJump {
        public static void main(String[] args) {
            Cat cat = new Cat();
            cat.jump_wall();
            Human human = new Human();
            human.jump_wall();
            Robot robot = new Robot();
            robot.jump_wall();
        }
    }
}

