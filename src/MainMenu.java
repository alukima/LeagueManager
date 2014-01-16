import java.io.*;

public class MainMenu {

    private static LeagueManager leagueManager;
    private final PrintStream printStream;

    public MainMenu(PrintStream printStream) {
        this.printStream = printStream;
    }

    public static void main(String[] args) throws IOException {
        PrintStream printStream = System.out;
        leagueManager = new LeagueManager(printStream);
        leagueManager.createRoster();
        MainMenu mainMenu = new MainMenu(printStream);
        mainMenu.displayListOptions();
        mainMenu.handleUserListChoice(new BufferedReader(new InputStreamReader(System.in)));
    }

    public void displayListOptions() {
      printStream.println("1 - View All Players");
      printStream.println("2 - Search");
    }

    public void handleUserListChoice(BufferedReader reader ) throws IOException {
        String input;
        input = getUserInput(reader);
        processUserInput(input, reader);
    }

    private String getUserInput(BufferedReader reader) {
        String input = "0";
        try {
            input = reader.readLine();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return input;
    }

    private void processUserInput(String input, BufferedReader reader) throws IOException {
        if(input.equals("1"))
            leagueManager.listPlayers();
        else if (input.equals("2")) {
            printStream.println("Enter a player name: ");
            String search = getUserInput(reader);
            leagueManager.findPlayer(search);
        }
    }

}



