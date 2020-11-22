package lesson1;

public class Course {
    void doIt(Team[] player){
        System.out.println("Time for Course");
    }
    public static class Team extends Course{
        @Override
        void doIt(Team[] player) {
            super.doIt(player);

        }
    }

    public static void main(String[] args) {
       Course[] course = new Course[4];
        Course course = new Course();
        Team[] player = new Team[4];
        course.doIt(player);
    }
}
