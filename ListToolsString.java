import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

/**
 * Tools for working with an ArrayList of Strings
 *
 * @author  APCS-A @ HB
 * @version 2018-11
 */
public class ListToolsString
{
    ArrayList<String> wordList;
    
    public ListToolsString()
    {
        wordList = new ArrayList<String>();
    
        // open the file
        File file = new File("words.txt");
        Scanner input = null;
        try
        {
            input = new Scanner(file);
        }
        catch (FileNotFoundException ex)
        {
            System.out.println("*** Cannot open words.txt ***");
            System.exit(1);        // quit the program
        } 

        // read the words from the file, one per line
        while (input.hasNext())
        {
            wordList.add(input.nextLine());
        }
        input.close();
    }

    public String toString ()
    {
        return wordList.toString();
    }
    
    // ---------------------------------------------------------------------
    //      A main method for testing.
    // ---------------------------------------------------------------------
    public static void main (String[] args)
    {
        ListToolsString myWords = new ListToolsString();
        System.out.println(myWords);
    }    
}
