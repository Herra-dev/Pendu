public class App
{
    public static void main(String[] args)
    {
        com.pendu.Pendu p = new com.pendu.Pendu();

        p.initialiseFoundWord();

        java.util.Scanner sc = new java.util.Scanner(java.lang.System.in);

        while(!p.test()) 
        { 
            System.out.println("word found: " + p.getFoundWord());
            System.out.println("Enter one character: ");
            p.setCharacterEntry(sc.nextLine().charAt(0));
            
            p.changeFoundWord();
        } 

        System.out.println("hello world"); 
    }
}