import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class LeagueManagerTest {

    private LeagueManager leagueManager;
    private PrintStream printStream;

    @Before
    public void setUp() throws IOException {
        printStream = mock(PrintStream.class);
        leagueManager = new LeagueManager(printStream);
        leagueManager.createRoster();
    }

    @Test
    public void shouldPrintAllPlayers() throws IOException {
        leagueManager.listPlayers();
        verify(printStream).println("Name: line2Team:  team2Number:  num2Age : age100");
    }

    @Test
    public void shouldReturnPlayerIfNameIsSearched(){
        leagueManager.findPlayer("line1");
        verify(printStream).println("Name: line1Team:  team1Number:  num1Age : age100");


    }

}
