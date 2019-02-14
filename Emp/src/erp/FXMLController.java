/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erp;
import BO.Emp;
import DA.EmpDA;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Mr. vipul
 */
public class FXMLController implements Initializable {

    @FXML
    private JFXTextField txtUser;
    @FXML
    private JFXTextField txtPass;
    @FXML
    private JFXButton txtLog;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void btnLogin(ActionEvent event) 
    {
         BO.Emp emp=EmpDA.getLogin((Integer.parseInt(txtUser.getText())),(Long.parseLong(txtPass.getText())));
              if(emp!=null)
              {
                  Alert alert=new Alert(Alert.AlertType.INFORMATION);
                  alert.setContentText("succesfully login");
                  alert.showAndWait();
                  erp.Emp.emp=emp;
                  try 
                  {
                     Parent root = FXMLLoader.load(getClass().getResource("Dashboard.fxml"));
                     Stage stage=new Stage();
                     Scene scene=new Scene(root);
                     stage.setScene(scene);
                     stage.show();
                     txtUser.getScene().getWindow().hide();
                  }
                  catch (Exception e) 
                  {
                      System.out.println(e);
                      e.printStackTrace();
                  }
              }
              else
              {
                  Alert alert=new Alert(Alert.AlertType.INFORMATION);
                  alert.setContentText("Unable to login");
                  alert.showAndWait();
              }

    }
    
}
