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
        verify(printStream).println("Name: line1 Team: team1 Number: num1 Age :age100");
    }

    @Test
    public void shouldReturnPlayerIfNameandNumberAreSearched(){
        leagueManager.findPlayer("line1", "num1");
        verify(printStream).println("Name: line1 Team: team1 Number: num1 Age :age100");
    }

    @Test
    public void shouldReturnCoachesAndPlayers(){
        leagueManager.ReturnLeague();
    }
}
