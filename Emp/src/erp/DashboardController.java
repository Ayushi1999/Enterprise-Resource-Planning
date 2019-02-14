/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erp;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Mr. vipul
 */
public class DashboardController implements Initializable 
{

                                                                   
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        // TODO
        String username="Welcome,  "+erp.Emp.emp.getName();
        

    }    

    @FXML
    private void btnGetDetail(ActionEvent event) {
         try 
                  {
                     Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
                     Stage stage=new Stage();
                     Scene scene=new Scene(root);
                     stage.setScene(scene);
                     stage.initModality(Modality.APPLICATION_MODAL);
                     stage.show();
                    
                  }
                  catch (Exception e) 
                  {
                      System.out.println(e);
                  }
    }

    @FXML
    private void btnDeptDetail(ActionEvent event) {
        try 
                  {
                     Parent root = FXMLLoader.load(getClass().getResource("Department.fxml"));
                     Stage stage=new Stage();
                     Scene scene=new Scene(root);
                     stage.setScene(scene);
                     stage.initModality(Modality.APPLICATION_MODAL); 
                     stage.show();
                    
                  }
                  catch (Exception e) 
                  {
                      System.out.println(e);
                  }
    }

    @FXML
    private void btnSalDetail(ActionEvent event) {
        try 
                  {
                     Parent root = FXMLLoader.load(getClass().getResource("Salary.fxml"));
                     Stage stage=new Stage();
                     Scene scene=new Scene(root);
                     stage.setScene(scene);
                     stage.initModality(Modality.APPLICATION_MODAL);
                     stage.show();
                    
                  }
                  catch (Exception e) 
                  {
                      System.out.println(e);
                  }
    }

    @FXML
    private void btnLeaveDetail(ActionEvent event) {
        try 
                  {
                     Parent root = FXMLLoader.load(getClass().getResource("Leave.fxml"));
                     Stage stage=new Stage();
                     Scene scene=new Scene(root);
                     stage.setScene(scene);
                     stage.initModality(Modality.APPLICATION_MODAL);
                     stage.show();
                    
                  }
                  catch (Exception e) 
                  {
                      System.out.println(e);
                  }
    }
    
}
