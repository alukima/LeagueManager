import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class MainMenuTest {

    private MainMenu mainMenu;
    private PrintStream printStream;

    @Test
    public void shouldShowMenuOptions(){
        printStream = mock(PrintStream.class);
        mainMenu = new MainMenu(printStream);
        mainMenu.listOptions();
        verify(printStream).println("1 - View All Players");
    }


    @Test
    public void shouldPrintAllPlayers() throws IOException {
        printStream = mock(PrintStream.class);
        mainMenu = new MainMenu(printStream);
        mainMenu.listPlayers();
        verify(printStream).println("Name: line1Team:  team1Number:  num1Age : age100");
    }
}
