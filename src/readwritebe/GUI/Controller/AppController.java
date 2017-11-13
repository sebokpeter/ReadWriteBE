/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readwritebe.GUI.Controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import readwritebe.BE.Prisoner;
import readwritebe.BLL.BLController;

/**
 *
 * @author sebok
 */
public class AppController implements Initializable
{
    
    @FXML
    private Button button;
    @FXML
    private ListView<Prisoner> lstPrisoners;
    
    private BLController blc;
            
    @FXML
    private void handleButtonAction(ActionEvent event) 
    {        
        lstPrisoners.getItems().addAll(blc.prepareData());
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        blc = new BLController();
    }    
    
}
