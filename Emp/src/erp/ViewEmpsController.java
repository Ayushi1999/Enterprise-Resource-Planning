/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erp;

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
public class ViewEmpsController implements Initializable 
{
    @FXML
    private TableView<?> tvEmps;
    @FXML
    private TableColumn<?, ?> tcId;
    @FXML
    private TableColumn<?, ?> tcName;
    @FXML
    private TableColumn<?, ?> tcEmail;
    @FXML
    private TableColumn<?, ?> tcAddress;
  
    @FXML
    private TableColumn<?, ?> tcContact;
    @FXML
    private TableColumn<?, ?> tcD_id;
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        // TODO
        tcId.setCellValueFactory(new PropertyValueFactory("id"));
        tcName.setCellValueFactory(new PropertyValueFactory("name"));
        tcEmail.setCellValueFactory(new PropertyValueFactory("email"));
        tcAddress.setCellValueFactory(new PropertyValueFactory("address"));
        tcD_id.setCellValueFactory(new PropertyValueFactory("D_id"));
        tcContact.setCellValueFactory(new PropertyValueFactory("Contact"));
        tvEmps.getItems().addAll(EmpDA.getAll());
    }
 }
