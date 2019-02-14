/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erp;
import BO.Leave;
import DA.EmpDA;
import DA.LeaveDA;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;

/**
 * FXML Controller class
 *
 * @author Mr. vipul
 */
public class LeaveController implements Initializable 
{

    @FXML
    private JFXTextField txtName;
    @FXML
    private JFXTextField txtContact;
    @FXML
    private JFXTextField txtId;
    @FXML
    private JFXTextField txtEmpId;
    @FXML
    private JFXTextField txtTotal;
    @FXML
    private Button txtAdd;
    @FXML
    private JFXDatePicker txtFrom;
    @FXML
    private JFXDatePicker txtTo;
    @FXML
    private JFXTextField txtleavestaken;
    @FXML
    private ComboBox<?> cbType_of_leave;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
     ArrayList ar=new ArrayList();
     ar.add("Casual");
     ar.add("Medical");
     ar.add("Foreign");
     cbType_of_leave.getItems().addAll(ar);
    }    

 /*String Name;
    int id,contact,total_leaves,leaves_taken,empid;
    Date from,to;*/
    @FXML
    private void btnAdd(ActionEvent event) 
    {
          Leave le=new Leave(); 
          le.setName(txtName.getText());
          le.setId(Integer.parseInt(txtId.getText()));
          le.setContact(Integer.parseInt(txtContact.getText()));
          le.setEmpid(Integer.parseInt(txtEmpId.getText()));
          le.setTotal_no_of_leaves(Integer.parseInt(txtTotal.getText()));
          le.setLeaves_taken(Integer.parseInt(txtleavestaken.getText()));
          le.setFrom_Date(DateTimeFormatter.ofPattern("dd-MM-yyyy").format(txtFrom.getValue()));
          le.setTo_Date(DateTimeFormatter.ofPattern("dd-MM-yyyy").format(txtTo.getValue()));
          LeaveDA.add(le);
    }
}
