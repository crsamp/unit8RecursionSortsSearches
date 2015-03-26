import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class WC
{

    public static void main(String[] args) throws FileNotFoundException
    {
        String useFile = "";
        if(args.length>0)
        {
            useFile = args[0];
        }
        else
        {
            Scanner s = new Scanner(System.in);
            useFile = s.next();
            
        }
        File inputFile = new File(useFile);
        File inputFile2 = new File(useFile);
        File inputFile3 = new File(useFile);
        Scanner in = new Scanner(inputFile);
        Scanner in2 = new Scanner(inputFile2);
        Scanner in3 = new Scanner(inputFile3);
        int charectorCount = 0;
        int wordCount = 0;
        int lineCount = 0;
        in.useDelimiter("[^A-Za-z]+");
        
        in2.useDelimiter("");
        in3.useDelimiter("\n");
        while (in.hasNext())
        {
            String value = in.next();
            wordCount++;
        }
        while(in2.hasNext())
        {
            String value = in2.next();
            charectorCount++;
        }
        while(in3.hasNext())
        {
            String value = in3.next();
            lineCount++;
        }
        in.close();
        in2.close();
        in3.close();
        System.out.println("Word Count: "+wordCount);
        System.out.println("Charactor Count: "+charectorCount);
        System.out.println("Line Count: "+lineCount);
    }

}
