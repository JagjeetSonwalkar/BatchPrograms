// Create a file and accept the name of file from the user

import java.util.*;
import java.io.*;

class Program602
{
    public static void main(String arg[])
    {
        String sFname = null ;
        boolean bRet = false ;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the file name that you want to create : ");
        sFname = sobj.nextLine();

        File fobj = new File(sFname);

        if(fobj.exists())                       // check file allready exists or not
        {
            System.out.println("File allready exists , So unable to create the file");
            return ;
        }

        try
        {
            bRet = fobj.createNewFile();            // create file
        }
        catch(IOException eobj)
        {
            System.out.println("Exception occured"+ eobj);
        }
        
        if(bRet == true)
        {
            System.out.println("File created.");
        }
        else
        {
            System.out.println("File not created.");
        }
    }
}

/*
    OUTPUT

    Enter the file name that you want to create :
    id.txt
    File created.

    Enter the file name that you want to create :
    id.txt
    File allready exists , So unable to create the file

*/