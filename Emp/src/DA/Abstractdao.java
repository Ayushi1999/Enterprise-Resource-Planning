/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DA;
import java.sql.Connection;      
import java.sql.DriverManager;  
//The basic service for managing a set of JDBC drivers.The use of a DataSource object is the preferred means of connecting to a data source. 
//ctrl+shift+i  method to import
public abstract class Abstractdao 
{
 public static Connection getConnection()
 {
 Connection con=null;
 try
 {   //local host means on our own virtual machine.
     Class.forName("oracle.jdbc.driver.OracleDriver");
     con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","AYUSHI1216","vipulgoyal");
 }
    catch(Exception e)
     {
          System.out.println(e);
     }
 return con;
 }
}
