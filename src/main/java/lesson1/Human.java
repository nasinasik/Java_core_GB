package lesson1;

public class Human {
    void run (){
        System.out.println("Human is running");
    }
    void jump (){
        System.out.println("Human is jumping");
    }

    public static void main(String[] args) {
        Human human = new Human();
        human.jump();
        human.run();
    }
}
