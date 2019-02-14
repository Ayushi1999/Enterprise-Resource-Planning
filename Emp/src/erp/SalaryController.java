/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erp;

import BO.Sal;
import DA.EmpDA;
import DA.SalDA;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import static java.sql.JDBCType.INTEGER;
import static java.sql.Types.INTEGER;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author Mr. vipul
 */
public class SalaryController implements Initializable {
@FXML
    private JFXTextField txtId;

    @FXML
    private JFXTextField txtName;

    @FXML
    private JFXTextField txtContact;

    @FXML
    private JFXTextField txtIncome;

    @FXML
    private JFXButton txtAdd;

    @FXML
    private JFXButton txtUpdate;
    @FXML
    private JFXTextField txtEmpId;
    @FXML
    private JFXComboBox<?> cbYear;
    @FXML
    private JFXComboBox<?> cbMonth;
   
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {    
        ArrayList list=new ArrayList();   
        for(int i=2000;i<2018;i++)
        list.add(i);        
        cbYear.getItems().addAll(list);
  
        ArrayList list1=new ArrayList();       
        for(int j=1;j<=12;j++)
        list1.add(j);        
        cbMonth.getItems().addAll(list1);
        // TODO
    }    

    @FXML
    private void btnAdd(ActionEvent event) 
    {
        //System.out.println("slkfdjalksdfjlaksjflaksjflajkd");
        Sal sal=new Sal();
        sal.setIncome(Integer.parseInt(txtIncome.getText()));
        sal.setId(Integer.parseInt(txtId.getText()));
        sal.setContact(Long.parseLong(txtContact.getText()));
        sal.setName(txtName.getText());
        sal.setEmpid(Integer.parseInt(txtEmpId.getText()));
        sal.setMonth((Integer)(cbMonth.getSelectionModel().getSelectedItem()));
        sal.setYear((Integer)(cbYear.getSelectionModel().getSelectedItem()));
         SalDA.add(sal);
    }

    @FXML 
    private void btnUpdate(ActionEvent event) 
    {
        //System.out.println("slkfdjalksdfjlaksjflaksjflajkd");
        Sal sal=new Sal();
        sal.setIncome(Integer.parseInt(txtIncome.getText()));
        sal.setId(Integer.parseInt(txtId.getText()));
        sal.setContact(Long.parseLong(txtContact.getText()));
        sal.setName(txtName.getText());
        sal.setEmpid(Integer.parseInt(txtEmpId.getText()));
        sal.setMonth((Integer)(cbMonth.getSelectionModel().getSelectedItem()));
        sal.setYear((Integer)(cbYear.getSelectionModel().getSelectedItem()));
        SalDA.update(sal);
    }
    
    @FXML
    private void btnEmpId(ActionEvent event)
    {
        BO.Emp salary=EmpDA.getById(Integer.parseInt(txtId.getText()));
        txtName.setText(salary.getName());
        txtContact.setText(String.valueOf(salary.getContact()));
        /*  BO.Sal sal=SalDA.getByEmpId(Integer.parseInt(txtEmpId.getText()));
        txtName.setText(sal.getName());
        txtId.setText(String.valueOf(sal.getId()));
        txtContact.setText(String.valueOf(sal.getContact()));
        txtIncome.setText(String.valueOf(sal.getIncome()));
        txtEmpId.setText(String.valueOf(sal.getEmpid()));*/
    }
}
