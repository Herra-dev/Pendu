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
        // test if the object returned is a String
        assertEquals(new java.lang.String().getClass(), p.getHiddenWord().getClass(), "Hidden word must be a String");
    }

    @Test
    public void _test_getFoundWord()
    {
        // test if the object returned is a String
        assertEquals(new java.lang.String().getClass(), p.getFoundWord().getClass(), "Found word must be a String");
    }

    @Test 
    public void _test_getCharacterEntry()
    {
        
    }
}