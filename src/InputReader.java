import java.lang.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

public class InputReader {
    private final BufferedReader reader;
    private final PrintStream printStream;

    public InputReader(BufferedReader reader, PrintStream printStream) {
        this.reader = reader;
        this.printStream = printStream;
    }

    public void parseRoster() throws IOException {
        String line;
        while((line = reader.readLine()) != null){
            createPlayer(line);
        }
    }

    private void createPlayer(String line) {
        String[] args = line.split(",");
        Player player = new Player(args);
        printStream.println(player.toString());
    }
}