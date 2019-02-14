/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DA;

import BO.Emp;
import BO.Sal;
import static DA.EmpDA.con;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Mr. vipul
 */
public class SalDA extends Abstractdao
{
 static Connection con=getConnection();
 public static void add(Sal sal)
 {
     //System.out.println("sdfasf");
     try 
     {
        PreparedStatement stat=con.prepareStatement("insert into Sal(Name,id,Income,Contact,empid,month,year)values(?,?,?,?,?,?,?)");
        stat.setString(1,sal.getName());
        stat.setInt(2,sal.getId());
        stat.setInt(3,sal.getIncome());
        stat.setLong(4, sal.getContact());
        stat.setInt(5,sal.getEmpid());
        stat.setInt(6,sal.getMonth());
        stat.setInt(7,sal.getYear());
        stat.execute();
     } 
     catch (Exception e) 
     {
         System.out.println(e);
     }   
 }
 public static void update(Sal sal)
 {
     try 
     {
        PreparedStatement stat=con.prepareStatement("update Sal set Name=?,Income=?,Contact=?,empid=?,month=?,year=? where id=?");
        stat.setInt(7,sal.getId());
        stat.setString(1,sal.getName());
        stat.setInt(2,sal.getIncome());
        stat.setLong(3, sal.getContact());
        stat.setInt(4,sal.getEmpid());
        stat.setInt(5,sal.getMonth());
        stat.setInt(6,sal.getYear());
        stat.execute();
     } 
     catch(Exception e) 
     {
         System.out.println(e);
     }
 }
public static Sal getByEmpId(int empid)
    {
        Sal sal=null;
        try 
        {
         PreparedStatement stat=con.prepareStatement("select name,id,income,contact,empid,month,year from SAL where empid=?");    
         stat.setInt(1,empid);
         ResultSet rs=stat.executeQuery();
         while(rs.next())
         {
            sal=new Sal();
            sal.setName(rs.getString(1));
            sal.setId(rs.getInt(2));
            sal.setIncome(rs.getInt(3));
            sal.setContact(rs.getLong(4));
            sal.setEmpid(rs.getInt(5));
            sal.setMonth(rs.getInt(6));
            sal.setYear(rs.getInt(7));
         }
         }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return sal; 
    }
}
