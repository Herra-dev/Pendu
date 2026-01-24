package com.pendu;

public class Pendu
{
    String hiddenWord;
    String foundWord;
    char characterEntry;


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

/**
 * initialise the word found as '*' (length = hiddenWord.length)
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
}