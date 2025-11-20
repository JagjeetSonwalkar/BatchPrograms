// open a file and accept the name of file from the user and write 'Jay Ganesh...' into the file

import java.util.*;
import java.io.*;

class Program603
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
                FileOutputStream foobj = new FileOutputStream(fobj);

                String str = "Jay Ganesh.. Jay Ganesh.. Jay Ganesh.. ";

                byte arr[] = str.getBytes();    // convert the string into byte

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
    time.txt
    File not exists , Unable to write the data.

    Enter the file name that you want to open :
    mi.txt
    File exists.

*/