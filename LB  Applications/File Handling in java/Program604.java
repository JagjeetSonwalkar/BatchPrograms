// open a file and accept the name of file from the user and write into the file where accept the writing from the user

import java.util.*;
import java.io.*;

class Program604
{
    public static void main(String arg[])
    {
        String sFname = null , sWrite = null ;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the file name that you want to open : ");
        sFname = sobj.nextLine();

        File fobj = new File(sFname);           // open the file

        if(fobj.exists())
        {
            System.out.println("File exists.");

            try
            {
                FileOutputStream foobj = new FileOutputStream(fobj);

                System.out.println("Write into the file : ");
                sWrite = sobj.nextLine();

                byte arr[] = sWrite.getBytes();    // convert the string into byte

                foobj.write(arr);               // write into the file
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
    Demo.txt
    File exists.
    Write into the file :
    Jay Shree Ram... Jay Shree Ram...


    Enter the file name that you want to open :
    mi.txt
    File exists.
    Write into the file :
    Jay Shree Ram... Jay Shree Ram...


    Enter the file name that you want to open :
    DemoCC.txt
    File not exists , Unable to write the data.

*/