import java.lang.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

public class InputReader {
    public final BufferedReader reader;
    private final PrintStream printStream;
    public ArrayList<Player> roster;

    public InputReader(BufferedReader reader, PrintStream printStream) {
        this.reader = reader;
        this.printStream = printStream;
    }

    public ArrayList<Player> getRoster() throws IOException {
        parseRoster();
        return roster;
    }

    public void parseRoster() throws IOException {
        String line;
        roster = new ArrayList<Player>();
        while((line = reader.readLine()) != null){
            createPlayer(line);
        }
    }

    private void createPlayer(String line) {
        String[] args = line.split(",");
        Player player = new Player(args);
        roster.add(player);
    }
}