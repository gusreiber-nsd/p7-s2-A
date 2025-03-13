import java.util.Scanner;

public class Main implements Spec{

    public static final Scanner USER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println();

        Main me = new Main();
        String name = me.askString("who are you?");
        int age  = me.askNumber("how old are you?");
        int size  =   me.askNumber("how big are you?");
        
        Player p = new Player(name, age, size);
        System.out.println("This is my age" + p.getAge());
        System.out.println("This is my name" + p.getName());
        System.out.println("This is my height" + p.getHeight());

        

        Game game = new Game();
        game.addPlayer(p);

        System.out.println();
        System.out.println("RAN WITHOUT ERROR");
        System.out.println();
    }

    @Override
    public String askString(String question) {
        System.out.println(question);
        return USER.next();
    }

    @Override
    public int askNumber(String question) {
        System.out.println(question);
        return USER.nextInt();
    }

    @Override
    public Results getResults(Game guessingOrBetter) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Person makePerson(String name) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void addResults(Person player) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}