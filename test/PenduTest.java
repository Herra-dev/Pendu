import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PenduTest
{
    protected com.pendu.Pendu p = null;

    @BeforeAll
    public static void setUpBeforeClass() 
    {
        System.out.println("before all");
    }
    
    @AfterAll
    public static void tearDownAfterClass() 
    {
        System.out.println("After all");
    }

    @BeforeEach
    public void setUp() 
    {
        p = new com.pendu.Pendu();
        System.out.println("before each test");
    }

    @AfterEach
    public void tearDown()
    {
        System.out.println("after each test");
    }

    @Test
    public void _test_getHiddenWord()
    {
        String hiddenWordTest = "pendu";
        p.setHiddenWord(hiddenWordTest);
        
        assertEquals(new java.lang.String().getClass(), p.getHiddenWord().getClass(), "Hidden word must be a String");
        assertEquals(hiddenWordTest, p.getHiddenWord());
    }

    @Test
    public void _test_getFoundWord()
    {
        String FoundWordTest = "pendu";
        p.setFoundWord(FoundWordTest);
        
        assertEquals(new java.lang.String().getClass(), p.getFoundWord().getClass(), "Found word must be a String");
        assertEquals(FoundWordTest, p.getFoundWord());
    }

    @Test 
    public void _test_getCharacterEntry()
    {
        char characterEntryTest = '@';
        p.setCharacterEntry(characterEntryTest);
        assertEquals(characterEntryTest, p.getCharacterEntry());

        characterEntryTest = '0';
        p.setCharacterEntry(characterEntryTest);
        assertEquals(characterEntryTest, p.getCharacterEntry());

        characterEntryTest = '*';
        p.setCharacterEntry(characterEntryTest);
        assertEquals(characterEntryTest, p.getCharacterEntry());

        characterEntryTest = 'å';
        p.setCharacterEntry(characterEntryTest);
        assertEquals(characterEntryTest, p.getCharacterEntry());

        characterEntryTest = '€';
        p.setCharacterEntry(characterEntryTest);
        assertEquals(characterEntryTest, p.getCharacterEntry());

        characterEntryTest = 'ü';
        p.setCharacterEntry(characterEntryTest);
        assertEquals(characterEntryTest, p.getCharacterEntry());
    }

    @Test
    public void _test_getPlayer()
    {
        com.pendu.enumeration.Player player = com.pendu.enumeration.Player.ONE;
        p.setPlayer(player);
        assertEquals(player, p.getPlayer());

        player = com.pendu.enumeration.Player.TWO;
        p.setPlayer(player);
        assertEquals(player, p.getPlayer());
    }
}