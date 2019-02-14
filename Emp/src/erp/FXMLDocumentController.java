/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erp;

import BO.Dept;
import DA.DeptDA;
import DA.EmpDA;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;


/**
 *
 * @author Mr. vipul
 */
public class FXMLDocumentController implements Initializable 
{
    @FXML
    private Label label;
    @FXML
    private JFXTextField txtEmail;
    @FXML
    private JFXTextField txtName;
    @FXML
    private JFXTextField txtAddress;
    @FXML
    private JFXTextField txtId;
    @FXML
    private JFXTextField txtContact;
    @FXML
    private JFXButton txtAdd;
    @FXML
    private Button txtUpdate;
    @FXML
    private ComboBox<?> cbDepartment;
    @FXML
    private void add_Emp(ActionEvent event)
    {
        BO.Emp emp=new BO.Emp(); 
        emp.setAddress(txtAddress.getText());
        emp.setD_id(((Dept)cbDepartment.getSelectionModel().getSelectedItem()).getId());
        emp.setEmail(txtEmail.getText());
        emp.setId(Integer.parseInt(txtId.getText()));
        emp.setContact(Long.parseLong(txtContact.getText()));
        emp.setName(txtName.getText());
         EmpDA.add(emp);
     }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        // TODO
        cbDepartment.getItems().addAll(DeptDA.getAll());
    if(Emp.emp.getId()!=0)
    {
        txtAdd.setVisible(false);
        txtUpdate.setVisible(false);
    }
    }    

    @FXML
    private void update_Emp(ActionEvent event)
    {
        BO.Emp emp=new BO.Emp(); 
        emp.setAddress(txtAddress.getText());
       emp.setD_id(((Dept)cbDepartment.getSelectionModel().getSelectedItem()).getId());
        emp.setEmail(txtEmail.getText());
        emp.setId(Integer.parseInt(txtId.getText()));
        emp.setContact(Long.parseLong(txtContact.getText()));
        emp.setName(txtName.getText());
         EmpDA.update(emp);
    }
    
    @FXML
    private  void getById(ActionEvent event)
    {
        BO.Emp emp=EmpDA.getById(Integer.parseInt(txtId.getText()));
        txtAddress.setText(emp.getAddress());
        txtName.setText(emp.getName());
        txtEmail.setText(emp.getEmail());
        txtContact.setText(String.valueOf(emp.getContact()));
        //txtD_id.setText(String.valueOf(emp.getD_id()));
    }

    @FXML
    private void delete_emp(ActionEvent event)
    {
         EmpDA.delete(Integer.parseInt(txtId.getText()));
    }
}
