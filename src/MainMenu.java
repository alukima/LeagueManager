import java.io.*;

public class MainMenu {

    private final PrintStream printStream;

    public MainMenu(PrintStream printStream) {
        this.printStream = printStream;
    }

    public static void main(String[] args) throws IOException {
        MainMenu mainMenu = new MainMenu(System.out);
        mainMenu.listOptions();
    }

    public void listOptions() {
      printStream.println("1 - View All Players");
    }

    public void listPlayers() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("roster.txt"));
        InputReader inputReader = new InputReader(reader, printStream);
        inputReader.parseRoster();

    }


}
