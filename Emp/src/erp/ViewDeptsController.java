/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erp;

import DA.DeptDA;
import DA.EmpDA;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author Mr. vipul
 */
public class ViewDeptsController implements Initializable {

    @FXML
    private TableView<?> tvDepts;
    @FXML
    private TableColumn<?, ?> tcId;
    @FXML
    private TableColumn<?, ?> tcName;
    @FXML
    private TableColumn<?, ?> tcLocation;
    @FXML
    private TableColumn<?, ?> tcManager;
    @FXML
    private TableColumn<?, ?> tcContact;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        tcId.setCellValueFactory(new PropertyValueFactory("id"));
        tcName.setCellValueFactory(new PropertyValueFactory("name"));
        tcLocation.setCellValueFactory(new PropertyValueFactory("Location"));
        tcManager.setCellValueFactory(new PropertyValueFactory("Manger"));
        
        tcContact.setCellValueFactory(new PropertyValueFactory("Contact"));
        tvDepts.getItems().addAll(DeptDA.getAll());
    }    
    
}
