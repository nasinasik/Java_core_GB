package lesson1;

public class Team {
    private String name;

    public Team(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }


        public static void main (String[]args){
            Team[] newTeam = new Team[4];
            Team player1 = new Team("AA");
            Team player2 = new Team("BB");
            Team player3 = new Team("CC");
            Team player4 = new Team("DD");
            System.out.println(player1);
            System.out.println(player2);
            System.out.println(player3);
            System.out.println(player4);
        }


    }
