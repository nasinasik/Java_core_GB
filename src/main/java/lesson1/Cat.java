package lesson1;

public class Cat {
    void run() {
        System.out.println("Cat is running");
    }

    void jump() {
        System.out.println("Cat is jumping");
    }
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.jump();
        cat.run();

    }

//    public class Cat extends Wall {
//        @Override
//        public void jump_wall() {
//            super.jump_wall();
//            System.out.println("Cat jumps successfully");
        }


