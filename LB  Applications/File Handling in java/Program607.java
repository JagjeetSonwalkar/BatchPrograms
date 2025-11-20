// write the data into the file from last , where the file contain allready written some thing .(Appended data into file)

import java.util.*;
import java.io.*;

class Program607
{
    public static void main(String aff[])
    {
        String fileName = null ;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the file name that you want to open");
        fileName = sobj.nextLine();

        File fobj = new File(fileName);

        if(fobj.exists())
        {
            System.out.println("File exists");

            try
            {
                String Rdata = null , Wdata = null ;
                int iRet = 0 ;

                FileInputStream fipobj = new FileInputStream(fobj);
                

                byte arr[] = new byte[1024];

                System.out.println("Data readed from the file is : ");

                while((iRet = fipobj.read(arr)) != -1)
                {
                    Rdata = new String(arr);
                    System.out.print(Rdata);
                }  

                System.out.println();

                FileOutputStream fopobj = new FileOutputStream(fobj,true);

                System.out.println("Write the data into file : ");
                Wdata = sobj.nextLine();

                fopobj.write(Wdata.getBytes());
                
                fipobj.close();
                fopobj.close();
                
            }
            catch(IOException eobj)
            {
                System.out.println("Exception occured"+ eobj);
            }    
        }
        else
        {
            System.out.println("File not exists !!!");
        }

    }
}