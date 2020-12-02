package lesson3;

public class Main {
    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>();
        Box<Apple> appleBox1 = new Box<>();

        appleBox.addFruit(new Apple());
        appleBox1.addFruit(new Apple());


        System.out.println("Apple box: "+(appleBox.getTotalWeight()+appleBox1.getTotalWeight()));



        Box<Orange> orangeBox = new Box<>();
        Box<Orange> orangeBox1 = new Box<>();
        Box<Orange> orangeBox2 = new Box<>();
        orangeBox.addFruit(new Orange());
        orangeBox1.addFruit(new Orange());
        orangeBox2.addFruit(new Orange());
        System.out.println("Orange box: "+(orangeBox.getTotalWeight()+orangeBox1.getTotalWeight()+orangeBox2.getTotalWeight()));
    }

}
