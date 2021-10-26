package com.example.ims;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainFrmController {

    @FXML
    private void onOutgoingBtnClick() throws IOException {
        Parent frmParent = FXMLLoader.load(MainApp.class.getResource("OutgoingFrmView.fxml"));
        Scene SecFrmScene = new Scene(frmParent);

        Stage window = new Stage();
        window.setTitle("Outgoing Stock");
        window.setScene(frmParent.getScene());
        window.show();
    }

    @FXML
    private void onIncomingBtnClick(){
        System.out.println("INCOMING");
    }

    @FXML
    private void onEditStockBtnClick(){
        System.out.println("EDIT STOCK");
    }

    @FXML
    private void onViewStockBtnClick(){
        System.out.println("VIEW STOCK");
    }




}
