/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DA;

import BO.Dept;
import BO.Emp;
import static DA.Abstractdao.getConnection;
import static DA.EmpDA.con;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author Mr. vipul
 */
public class DeptDA extends Abstractdao
{
    static Connection con=getConnection();
    public static void add(Dept dept)
    {
        try 
        {
           PreparedStatement stat=con.prepareStatement("insert into DEPARTMENT(id,name,location,manager,contact)values(?,?,?,?,?)");
           stat.setInt(1,dept.getId());
           stat.setString(2,dept.getName());
           stat.setString(3,dept.getLocation());
           stat.setString(4,dept.getManager());
           stat.setLong(5,dept.getContact());
           stat.execute();
        } 
        catch (Exception e) 
        {
            System.out.println(e);
        }
      }
    public static void update(Dept dept)
    {
        try
        {
            PreparedStatement stat1=con.prepareStatement("update DEPARTMENT set id=?,name=?,loctaion=?,manager=?,contact=? where ID=?");
           stat1.setInt(1,dept.getId());
           stat1.setString(2,dept.getName());
           stat1.setString(3,dept.getLocation());
           stat1.setString(4,dept.getManager());
           stat1.setLong(5,dept.getContact());
           stat1.execute();
        }
        catch(Exception e)
        {
           System.out.println(e);
        }
    }
    public static Dept getById(int id)
    {
        Dept dp=null;
        try 
        {
         PreparedStatement stat=con.prepareStatement("select name,manager,contact,location from DEPARTMENT where id=?");
         stat.setInt(1,id);
         ResultSet rs=stat.executeQuery();
         while(rs.next())
         {
             dp=new Dept();
             dp.setName(rs.getString(1));
             dp.setManager(rs.getString(2));
             dp.setContact(rs.getLong(3));
             dp.setLocation(rs.getString(4));
         }
         }
        catch (Exception e) {
        System.out.println(e);
        }
        return dp;
        }
       

    public static ArrayList getAll()
    {
        ArrayList depts = new ArrayList();
        try 
        {
            PreparedStatement stat = con.prepareStatement("select name,id,location,manager,contact,id from DEPARTMENT");
            ResultSet rs = stat.executeQuery();
            while (rs.next()) {
                Dept dep = new Dept();
                dep.setName(rs.getString(1));
                dep.setId(rs.getInt(2));
                dep.setLocation(rs.getString(3));
                dep.setManager(rs.getString(4));
                dep.setContact(rs.getLong(5));
            
                depts.add(dep);
            }

        }
        catch (Exception e) {
            System.out.println(e);
        }
        return depts;
    }
}
