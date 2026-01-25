package com.pendu;

public class Pendu
{
    protected String hiddenWord;
    protected String foundWord;
    protected char characterEntry;
    protected com.pendu.enumeration.Player player = com.pendu.enumeration.Player.ONE;
    protected static java.nio.file.Path path = java.nio.file.Paths.get("../assets/files/France");

/**
 * default contructor
 * 
 * @author Heriniaina
 */
    public Pendu()
    {
        this.hiddenWord = "Pendu";
        this.foundWord = "";
        this.characterEntry = ' ';
    }

//==================================================================
//===   GETTERS

/**
 * @return String
 * 
 * return the hidden current word
 * @author Heriniaina
 */
    public String getHiddenWord()
    {
        return this.hiddenWord;
    }

//--------------------------------------------------------------------------

/**
 * @return String
 * 
 * return the found word
 * @author Heriniaina
 */
    public String getFoundWord()
    {
        return this.foundWord;
    }

//--------------------------------------------------------------------------

/**
 * @return char
 * 
 * return the character enter by user
 * @author Heriniaina
 */
    public char getCharacterEntry()
    {
        return this.characterEntry;
    }

//--------------------------------------------------------------------------

/**
 * @return char
 * 
 * return the number of player
 * @author Heriniaina
 */
    public com.pendu.enumeration.Player getPlayer()
    {
        return this.player;
    }

//--------------------------------------------------------------------------

    public java.nio.file.Path getPath()
    {
        return path;
    }

//==================================================================
//=== SETTERS

/**
 * @param p_hiddenWord: String
 * 
 * set the property hiddenWord into p_hiddenWord
 * @author Heriniaina
 */
    public void setHiddenWord(String p_hiddenWord)
    {
        this.hiddenWord = p_hiddenWord;
    }

//--------------------------------------------------------------------------

/**
 * @param p_foundWord: String
 * 
 * set the property foundWord into p_hiddenWord
 * @author Heriniaina
 */
    public void setFoundWord(String p_foundWord)
    {
        this.foundWord = p_foundWord;
    }

//--------------------------------------------------------------------------

/**
 * @param p_characterEntry: char
 * 
 * set the property characterEntry into p_characterEntry
 * @author Heriniaina
 */
    public void setCharacterEntry(char p_characterEntry)
    {
        this.characterEntry = p_characterEntry;
    }

//--------------------------------------------------------------------------

    public void setPlayer(com.pendu.enumeration.Player p_Player)
    {
        this.player = p_Player;
    }

//--------------------------------------------------------------------------

    public void setPath(java.nio.file.Path p_path)
    {
        path = p_path;
    }

//--------------------------------------------------------------------------
//==== STATIC METHODS

    public static int randomNumber()
    {
        java.util.Random rand = new java.util.Random();

        //return a random number between 0 and (the number of word available in the file - 1)
        return rand.nextInt(numberOfWords());
    }

//--------------------------------------------------------------------------

    public static int numberOfWords()
    {
        // if the file in the URI path doesn't exists, return 0
        if(!java.nio.file.Files.exists(path)) return 0; 

        int number = 0;
        
        // to instatiate BufferedReader in the try close like this assure that the this object will be closed at end of the structure
        try(java.io.BufferedReader br = java.nio.file.Files.newBufferedReader(path);)
        {
            //read all line one by one and increment number
            while(!((br.readLine()) == null)) number++; 
        }
        catch(java.io.IOException e)
        {
            System.err.println("error: " + e.getMessage());
        }

        return number; // return the number of line read
    }

//--------------------------------------------------------------------------

    @SuppressWarnings("empty-statement")
    public static String pickWord()
    {
        if(!java.nio.file.Files.exists(path)) return "pendu"; 

        String str = "";
        try(java.io.BufferedReader br = java.nio.file.Files.newBufferedReader(path))
        {
            //read all line one by one until i > randomNumber or EOF(end-of-file) was reached 
            int i = 0;
            int max = randomNumber();
            System.out.println("max = " + max);
            while(!((str = br.readLine()) != null) || i < max) i++;
        }
        catch(java.io.IOException e)
        {
            System.err.println("error: " + e.getMessage());
        }

        return str; // return the one last line read from file
    }

//--------------------------------------------------------------------------

    public static boolean askToRetry()
    {
        java.util.Scanner sc = new java.util.Scanner(java.lang.System.in);
        char answer;

        System.out.println("Do you want to retry: ");
        do
        {
            System.out.println("o/N");
            answer = sc.nextLine().charAt(0);
        }while(answer != 'o' && answer != 'N' && answer != 'n');

        return answer == 'o';
    }

//==== END STATIC METHODS
//--------------------------------------------------------------------------

/**
 * initialise the word found as '*' (with length = hiddenWord.length)
 * 
 * @author Heriniaina
 */
    public void initialiseFoundWord()
    {
        String str = "";
        for(int i = 0; i < this.getHiddenWord().length(); i++)
            str += "*";

        this.setFoundWord(str);
    }

//--------------------------------------------------------------------------

/**
 * @return true if the hiddenWord is equals to foundWord, otherwise returns false
 * 
 * @author Heriniaina
 */
    public boolean  test()
    {
        return this.hiddenWord.equals(this.foundWord);
    }

//--------------------------------------------------------------------------
    
/**
 * @return true if the hiddenWord contains the character enter by user, otherwise returns false
 * 
 * @author Heriniaina
 */
    public boolean isHiddenWordContainsCharEntry()
    {
        for(int i = 0; i < this.hiddenWord.length(); i++)
            if(hiddenWord.charAt(i) == this.characterEntry)
                return true;
        
        return false;
    }

//--------------------------------------------------------------------------

/**
 * quit function if the hiddenWord doesn't contains the character enter by user.
 * changes character into characterEntry at index where occurences of characterEntry in HiddenWord was found
 * 
 * @author Heriniaina
 */
    public void changeFoundWord()
    {
        if(!isHiddenWordContainsCharEntry())
            return;
        
        char s[] = this.getFoundWord().toCharArray();

        for(int i = 0; i < this.getHiddenWord().length(); i++)
        {
            if(this.getCharacterEntry() == this.getHiddenWord().charAt(i))
            {
                s[i] = this.getCharacterEntry();
            }
        }
        
        String s1 = "";
        for(int i = 0; i < s.length; i++)
            s1 += s[i];

        this.setFoundWord(s1);
    }

//--------------------------------------------------------------------------

    public void askForPlayerNumber()
    {
        java.util.Scanner sc = new java.util.Scanner(java.lang.System.in);
        String answer;
        System.out.println("""
                           Choose the number of player: (Answer with --> ONE or TWO)
                           \t\t\t\tONE (Pendu will search for the hidden word)
                           \t\t\t\tTWO (One player set the hidden word and the second one try to guess it)
                           """);
        answer = sc.nextLine();

        while(!answer.equals(com.pendu.enumeration.Player.ONE.getPlayerNumber()) && !answer.equals(com.pendu.enumeration.Player.TWO.getPlayerNumber()))
            answer = sc.nextLine();
        
        this.setPlayer((answer.equals(com.pendu.enumeration.Player.ONE.getPlayerNumber()) 
                            ? com.pendu.enumeration.Player.ONE
                            : com.pendu.enumeration.Player.TWO));

        System.out.println("Player: " + this.getPlayer().getPlayerNumber());
    }

//--------------------------------------------------------------------------

    public void askForHiddenWord()
    {
        java.util.Scanner sc = new java.util.Scanner(java.lang.System.in);

        System.out.println("Choose the hidden word: ");
        setHiddenWord(sc.nextLine());
    }

//--------------------------------------------------------------------------

    public void askForCharacter()
    {
        java.util.Scanner sc = new java.util.Scanner(java.lang.System.in);

        System.out.println("Choose one character: ");
        setCharacterEntry(sc.nextLine().charAt(0));
    }

//--------------------------------------------------------------------------

    public void startGame()
    {
        askForPlayerNumber();

        if(com.pendu.enumeration.Player.ONE.equals(this.player)) startOnePlayer();
        else startTwoPlayer();

        this.initialiseFoundWord();
        this.askForCharacter();
        this.changeFoundWord();

    }

//--------------------------------------------------------------------------

    public void startOnePlayer()
    {
        // show introduction
        // pick a hidden word from appropriate file
        this.setHiddenWord(pickWord());
        // clean terminal
        // 

        
    }

//--------------------------------------------------------------------------

    public void startTwoPlayer()
    {
        // show introduction
        // ask for hidden word
        this.askForHiddenWord();
        // clean terminal
    }

    
}