/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erp;

import BO.Dept;
import DA.DeptDA;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author Mr. vipul
 */
public class DepartmentController implements Initializable {

    @FXML
    private JFXTextField txtId;
    @FXML
    private JFXTextField txtName;
    @FXML
    private JFXTextField txtLoc;
    @FXML
    private JFXTextField txtManag;
    @FXML
    private JFXTextField txtCont;
    @FXML
    private JFXButton btnAdddept;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        
        // TODO
    }    

    @FXML
    private void add_deptt(ActionEvent event) 
    {
        BO.Dept dept=new BO.Dept(); 
        dept.setName(txtName.getText());
        dept.setId(Integer.parseInt(txtId.getText()));
        dept.setLocation(txtLoc.getText());
        dept.setContact(Long.parseLong(txtCont.getText()));
        dept.setManager(txtManag.getText());
         DeptDA.add(dept);
    }
     @FXML
    private void update_deptt(ActionEvent event)
    {
        Dept dept=new Dept();
        dept.setName(txtName.getText());
        dept.setId(Integer.parseInt(txtId.getText()));
        dept.setLocation(txtLoc.getText());
        dept.setContact(Long.parseLong(txtCont.getText()));
        dept.setManager(txtManag.getText());
         DeptDA.update(dept);
    }
    
}
