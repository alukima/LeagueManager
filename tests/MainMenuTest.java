import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class MainMenuTest {

    private MainMenu mainMenu;
    private PrintStream printStream;

    @Before
    public void setUp(){
        printStream = mock(PrintStream.class);
        mainMenu = new MainMenu(printStream);
    }

    @Test
    public void shouldShowMenuOptions(){
        mainMenu.displayListOptions();
        verify(printStream).println("1 - View All Players");
        verify(printStream).println("2 - Search");
    }

}
