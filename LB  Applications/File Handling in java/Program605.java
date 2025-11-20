// Read the data from the file 

import java.io.*;
import java.util.*;

class Program605
{
    public static void main(String arg[])
    {
        String sFname = null ;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the file name that you want to open : ");
        sFname = sobj.nextLine();

        File fobj = new File(sFname);           // open the file

        if(fobj.exists())
        {
            System.out.println("File exists.");

            try
            {
                FileInputStream fiobj = new FileInputStream(fobj);

                System.out.println("Reading the data from the file : ");

                byte arr[] = new byte[1024];            // create the byte to take the data inside  

                fiobj.read(arr);                        // Read the data               

                String sRead = new String(arr);         // Convert the byte into string
                System.out.print(sRead);            
            }

            catch(IOException eobj)
            {
                System.out.println("Exception occured"+ eobj);
            }
        }
        else
        {
            System.out.println("File not exists , Unable to write the data.");
        } 
    }
}

/*

    OUTPUT

    Enter the file name that you want to open :
    mi.txt
    File exists.
    Reading the data from the file :
    Jay Shree Ram... Jay Shree Ram...

*/