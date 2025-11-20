import java.sql.*;          // 1

class DatabaseDemo1
{
    public static void main(String arg[]) throws Exception
    {
        String URL = "jdbc:mysql://localhost:3306/joinn";
        String Username = "root";
        String Password = "";
        String Query = "select * from customer";

        Connection cobj = DriverManager.getConnection(URL,Username,Password);   // 2
        
        Statement sobj = cobj.createStatement();        // 3

        ResultSet robj = sobj.executeQuery(Query);      // 4

        while(robj.next())          // 5
        {
            System.out.println("CID : "+robj.getInt("CID"));
            System.out.println("Name : "+robj.getString("Name"));
            System.out.println("City : "+robj.getString("City"));  
            System.out.println("\n");                                 
        }
    }
}

// execute()            Create table
// executeQuery()       select
// executeUpdate()      delete / update / alter / insert