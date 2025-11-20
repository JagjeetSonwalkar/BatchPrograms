// Read the data from the file  and close the file

import java.io.*;
import java.util.*;

class Program606
{
    public static void main(String arg[])
    {
        String sFname = null , sRead = null ;
        int iRet = 0 ;

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

                byte arr[] = new byte[1024];            // create the byte to take the data inside  

                System.out.println("Reading the data from the file : ");

                while((iRet = fiobj.read(arr)) != -1)                        // Read the data     
                {
                    sRead = new String(arr);         // Convert the byte into string
                    System.out.print(sRead);  
                }     

                fiobj.close();     
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