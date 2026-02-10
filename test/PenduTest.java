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
        
    }
    
//================================================================================

    @AfterAll
    public static void tearDownAfterClass() 
    {

    }

//================================================================================

    @BeforeEach
    public void setUp() 
    {
        p = new com.pendu.Pendu();
    }

//================================================================================

    @AfterEach
    public void tearDown()
    {
        
    }

//================================================================================

    @Test
    public void _test_getHiddenWord()
    {
        String hiddenWordTest = "pendu";
        p.setHiddenWord(hiddenWordTest);
        
        assertEquals(new java.lang.String().getClass(), p.getHiddenWord().getClass(), "Hidden word must be a String");
        assertEquals(hiddenWordTest, p.getHiddenWord());
    }

//================================================================================

    @Test
    public void _test_getFoundWord()
    {
        String FoundWordTest = "pendu";
        p.setFoundWord(FoundWordTest);
        
        assertEquals(new java.lang.String().getClass(), p.getFoundWord().getClass(), "Found word must be a String");
        assertEquals(FoundWordTest, p.getFoundWord());
    }

//================================================================================

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

//================================================================================

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

//================================================================================

    @Test
    public void _test_getPath()
    {
        java.nio.file.Path path = java.nio.file.Paths.get("../ressources/files/");
        p.setPath(path);

        assertEquals(path.getClass(), p.getPath().getClass());
        assertEquals(path, p.getPath());

        path = java.nio.file.Paths.get("../ressources/files/France");
        p.setPath(path);
        assertEquals(path, p.getPath());
    }

//================================================================================

    @Test 
    public void _test_getLife()
    {
        int life = 5;
        p.setLife(life);

        assertEquals(life, p.getLife());
    }

//================================================================================

    @Test
    public void _test_getAvailableLanguageList()
    {
        java.util.LinkedList<java.nio.file.Path> language = new java.util.LinkedList<>();
        language.add(java.nio.file.Paths.get("../ressources/files/France"));
        p.setAvailableLanguageList(language);

        assertEquals(language.getClass(), p.getAvailableLanguageList().getClass());
        assertEquals(language, p.getAvailableLanguageList());

        //----------------------------------

        language.add(java.nio.file.Paths.get("../ressources/files/France"));
        language.add(java.nio.file.Paths.get("../ressources/files/another"));
        p.setAvailableLanguageList(language);

        assertEquals(language.getClass(), p.getAvailableLanguageList().getClass());
        assertEquals(language, p.getAvailableLanguageList());

        //----------------------------------

        language.add(java.nio.file.Paths.get("../ressources/files/France"));
        language.add(java.nio.file.Paths.get("../ressources/files/anotherOne"));
        p.setAvailableLanguageList(language);

        assertEquals(language.getClass(), p.getAvailableLanguageList().getClass());
        assertEquals(language, p.getAvailableLanguageList());
    }   

//================================================================================

}