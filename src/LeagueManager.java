import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

public class LeagueManager {
    private final PrintStream printStream;
    public ArrayList<Player> roster;

    public LeagueManager(PrintStream printStream){
        this.printStream = printStream;
    }


    public void createRoster() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("roster.txt"));
        InputReader inputReader = new InputReader(reader, printStream);
        roster = inputReader.getRoster();
    }

    public void listPlayers() {
        for(Player player: roster){
            printStream.print(roster.size());
            printStream.println(player.toString());
        }
    }

    public void findPlayer(String line, String number) {
        for(Player player : roster)
            if (player.name.equals(line) && player.number.equals(number)){
                printStream.println(player.toString());
            }
    }

    public void ReturnLeague() {
    }
}
