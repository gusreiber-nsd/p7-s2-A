public class Player implements Person {

    private String name;
    private int age;
    private int height;

    public Player(){

    }
    public Player(String name, int age, int size){
        this.name = name; 
    }

    public void climb(String dir){
        
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getHeight() {
        return this.height;
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getAge() {
        return this.age;
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Results getResults() {
        return new Result();
    }
}
