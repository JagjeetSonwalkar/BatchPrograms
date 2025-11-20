// Delete existing file

import java.io.*;
import java.util.*;

class Program608
{
    public static void main(String qwe[])
    {
        String fileName = null ;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of file , that you want to delete : ");
        fileName = sobj.nextLine();

        File fobj = new File(fileName);

        if(fobj.exists())
        {
            System.out.println("File exists.");

            if(fobj.delete())
            {
                System.out.println("File deleted.");
            }
            else
            {
                System.out.println("File not deleted.");
            }
        }
        else
        {
            System.out.println("File not exists.");
        }
    }
}

/*

    OUTPUT

    Enter the name of file , that you want to delete :
    id.txt
    File exists.
    File deleted.

    Enter the name of file , that you want to delete :
    Jaggi.txt
    File exists.
    File deleted.

*/