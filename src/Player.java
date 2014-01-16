/**
 * Created by thoughtworker on 1/16/14.
 */
public class Player {
    public String name;
    public String team;
    public String number;
    public String age;

    public Player(String[] args) {
        this.name = args[0];
        this.team = args[1];
        this.number = args[2];
        this.age = args[3];
    }

    @Override
    public String toString(){
        return "Name: " + name + " Team: " +team + " Number: " + number + " Age :" +age;
    }
}
