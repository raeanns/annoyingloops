import java.util.*;
import java.io.*;

public class fileFun
{
  public static void main (String[] args)
    throws IOException
  {
    String inputFilename = "";    //variable for file name
    String outputFilename = "";   //variable for output file name
    Scanner scan = new Scanner(System.in);  //allows for input from keyboard
    
    System.out.print ("Please input a file name.");
    inputFilename = scan.next();  //not .nextLine() because we don't want spaces
    
    System.out.print ("Please input an output file name");
    outputFilename = scan.next();
    
    Scanner scanFile = new Scanner(new File(inputFilename)); //assigns users file name to the new file
    PrintWriter outFile = new PrintWriter (new File (outputFilename)); //assigns output file name
    
    String inputLine = scanFile.nextLine(); //assigns file contents to inputLine
    inputLine=inputLine.toUpperCase();    //converts contents to uppercase
    
    //System.out.println (inputLine);         //displays file
    
    for(;scanFile.hasNext();)
    {
      System.out.println(inputLine.replaceAll(""," "));
    }
      
      

    
    
   
      
     
         
      }
  }


                                    
          
     
     
     