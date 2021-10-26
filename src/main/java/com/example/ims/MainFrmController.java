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
    private void onIncomingBtnClick() throws IOException {
        Parent frmParent = FXMLLoader.load(MainApp.class.getResource("IncomingFrmView.fxml"));
        Scene SecFrmScene = new Scene(frmParent);

        Stage window = new Stage();
        window.setTitle("Incoming Stock");
        window.setScene(frmParent.getScene());
        window.show();
    }

    @FXML
    private void onEditStockBtnClick() throws IOException {
        Parent frmParent = FXMLLoader.load(MainApp.class.getResource("EditStockFrmView.fxml"));
        Scene SecFrmScene = new Scene(frmParent);

        Stage window = new Stage();
        window.setTitle("Edit Stock");
        window.setScene(frmParent.getScene());
        window.show();
    }

    @FXML
    private void onViewStockBtnClick() throws IOException {
        Parent frmParent = FXMLLoader.load(MainApp.class.getResource("ViewStockFrmView.fxml"));
        Scene SecFrmScene = new Scene(frmParent);

        Stage window = new Stage();
        window.setTitle("View Stock");
        window.setScene(frmParent.getScene());
        window.show();
    }




}
