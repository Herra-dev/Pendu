import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;


public class PenduTest
{
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
        System.out.println("before each test");
    }

    @AfterEach
    public void tearDown()
    {
        System.out.println("after each test");
    }

    @Test
    public void testMe1()
    {
        System.out.println("test 1");
    }

    @Test
    public void testMe2()
    {
        System.out.println("test 2");
    }
}