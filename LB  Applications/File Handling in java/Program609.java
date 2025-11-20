// Display the details or information of file 

import java.util.*;
import java.io.*;

class Program609
{
    public static void main(String agg[])throws IOException
    {
        String fileName = null ;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of file that you want to open : ");
        fileName = sobj.nextLine();

        File fobj = new File(fileName);

        if(fobj.exists())
        {
            System.out.println("File exists.");
            System.out.println("Name of file is : "+ fobj.getName());
            System.out.println("Size of file is : "+ fobj.length());
            System.out.println("Path of File is : "+ fobj.getAbsolutePath());
            System.out.println("File is readable : "+ fobj.canRead());
            System.out.println("File is writable : "+ fobj.canWrite());
        }
        else
        {
            System.out.println("File not exists.");
        }
    }
}

/*
    Enter the name of file that you want to open :
    Program1.c
    File not exists.

    Enter the name of file that you want to open :
    Demo.txt
    File exists.
    Name of file is : Demo.txt
    Size of file is : 33
    Path of File is : C:\Users\DELL\OneDrive\Desktop\File Handling\Demo.txt
    File is readable : true
    File is writable : true

    Enter the name of file that you want to open :
    Program609.java
    File exists.
    Name of file is : Program609.java
    Size of file is : 989
    Path of File is : C:\Users\DELL\OneDrive\Desktop\File Handling\Program609.java
    File is readable : true
    File is writable : true

    Enter the name of file that you want to open :
    mi.txt
    File exists.
    Name of file is : mi.txt
    Size of file is : 33
    Path of File is : C:\Users\DELL\OneDrive\Desktop\File Handling\mi.txt
    File is readable : true
    File is writable : true
*/