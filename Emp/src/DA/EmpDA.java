/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DA;

import BO.Emp;
import java.sql.Connection;
import java.sql.PreparedStatement;//A SQL statement is pre-compiled and stored in a PreparedStatement object
import java.sql.ResultSet;
import java.util.ArrayList;
//Connection.prepareStatement(java.lang.String).
//PreparedStatement setString() method throws exception.

/**
 *
 * @author Mr. vipul
 */
public class EmpDA extends Abstractdao 
{
    static Connection con = getConnection();
    public static void add(Emp emp) 
    {
        try 
        {
            PreparedStatement stat = con.prepareStatement("insert into EMPLOYEE(name,address,email,d_id,contact)values(?,?,?,?,?)");
            stat.setString(1, emp.getName());
            stat.setString(2, emp.getAddress());
            stat.setString(3, emp.getEmail());
            stat.setInt(4, emp.getD_id());
            stat.setLong(5, emp.getContact());
            stat.execute();
        } 
        catch(Exception e) 
        {
            System.out.println(e);
        }
    }
    public static void update(Emp emp)
    {
        try 
        {
            PreparedStatement stat1 = con.prepareStatement("update EMPLOYEE set name=?,address=?,email=?,d_id=?,contact=? where Id=?");
            stat1.setString(1, emp.getName());
            stat1.setString(2, emp.getAddress());
            stat1.setString(3, emp.getEmail());
            stat1.setInt(4, emp.getD_id());
            stat1.setLong(5, emp.getContact());
            stat1.setInt(6, emp.getId());
            stat1.execute();
        }
        catch (Exception e) 
        {
            System.out.println(e);
        }
    }
  
    public static void delete(int id)
    {
        try 
        {
          PreparedStatement stat2=con.prepareStatement("delete from EMPLOYEE where id=?");  
             stat2.setInt(1,id);
            stat2.execute();
        
        }
        catch (Exception e) 
        {
            System.out.println(e);
        }
    }
    public static Emp getById(int id) 
    {
        Emp emp = null;
        try {
            PreparedStatement stat = con.prepareStatement("select name,address,email,d_id,contact from EMPLOYEE where id=?");
            stat.setInt(1, id);
            ResultSet rs = stat.executeQuery();
            while (rs.next()) {
                emp = new Emp();
                emp.setName(rs.getString(1));
                emp.setAddress(rs.getString(2));
                emp.setEmail(rs.getString(3));
                emp.setD_id(rs.getInt(4));
                emp.setContact(rs.getLong(5));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return emp;
    }

    public static Emp getLogin(int id, long contact) 
    {
        Emp emp = null;
        try 
        {
            PreparedStatement stat1 = con.prepareStatement("select name,address,email,d_id,contact,id from EMPLOYEE where id=? and contact=?");
            stat1.setInt(1, id);
            stat1.setLong(2, contact);
            ResultSet rs = stat1.executeQuery();//A ResultSet object maintains a cursor that points to the current row in the result set.
            while (rs.next()) //checks if there is a row present.     
            {
                emp = new Emp();
                emp.setName(rs.getString(1));
                emp.setAddress(rs.getString(2));
                emp.setEmail(rs.getString(3));
                emp.setD_id(rs.getInt(4));
                emp.setContact(rs.getLong(5));
                emp.setId(rs.getInt(6));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return emp;
    }

    public static ArrayList getAll() 
    {
        ArrayList emps = new ArrayList();
        try {
            PreparedStatement stat = con.prepareStatement("select name,address,email,d_id,contact,id from EMPLOYEE");
            ResultSet rs = stat.executeQuery();
            while (rs.next()) {
                Emp emp = new Emp();
                emp.setName(rs.getString(1));
                emp.setAddress(rs.getString(2));
                emp.setEmail(rs.getString(3));
                emp.setD_id(rs.getInt(4));
                emp.setContact(rs.getLong(5));
                emp.setId(rs.getInt(6));
                emps.add(emp);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        return emps;
    }

}
