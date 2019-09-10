package com.reinhart.controller;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

public class prsController  {

    @FXML
    public TextField txtWin;
    @FXML
    public TextField txtLose;
    @FXML
    public TextField txtdraw;
    @FXML
    public ImageView userImg;
    @FXML
    public ImageView compImg;



    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        txtWin.setText("0");
        txtdraw.setText("0");
        txtLose.setText("0");

    }



    public void paperAction(ActionEvent actionEvent) {
        userImg.setImage(new Image("images/paper.jpg"));
        Random random = new Random();
        int x = random.nextInt(3);
        if (x == 0) {
            compImg.setImage(new Image("images/paper.jpg"));
            txtdraw.setText(String.valueOf(Integer.valueOf(txtdraw.getText())
                    + 1));
        } else if (x == 1) {
            compImg.setImage(new Image("images/scissors.jpg"));
            txtLose.setText(String.valueOf(Integer.valueOf(txtLose.getText())
                    + 1));
        } else if (x == 2) {
            compImg.setImage(new Image("images/rock.jpg"));
            txtWin.setText(String.valueOf(Integer.valueOf(txtWin.getText())
                    + 1));
        }
    }

    public void rockAction(ActionEvent actionEvent) {
        userImg.setImage(new Image("images/rock.jpg"));
        Random random = new Random();
        int x = random.nextInt(3);
        if (x == 0) {
            compImg.setImage(new Image("images/paper.png"));
            txtdraw.setText(String.valueOf(Integer.valueOf(txtdraw.getText())
                    + 1));
        } else if (x == 1) {
            compImg.setImage(new Image("images/scissors.png"));
            txtLose.setText(String.valueOf(Integer.valueOf(txtLose.getText())
                    + 1));
        } else if (x == 2) {
            compImg.setImage(new Image("images/rock.png"));
            txtWin.setText(String.valueOf(Integer.valueOf(txtWin.getText())
                    + 1));
        }
    }

    public void scissorsAction(ActionEvent actionEvent) {
        userImg.setImage(new Image("images/scissors.jpg"));
        Random random = new Random();
        int x = random.nextInt(3);
        if (x == 0) {
            compImg.setImage(new Image("images/paper.png"));
            txtdraw.setText(String.valueOf(Integer.valueOf(txtdraw.getText())
                    + 1));
        } else if (x == 1) {
            compImg.setImage(new Image("images/scissors.png"));
            txtLose.setText(String.valueOf(Integer.valueOf(txtLose.getText())
                    + 1));
        } else if (x == 2) {
            compImg.setImage(new Image("images/rock.png"));
            txtWin.setText(String.valueOf(Integer.valueOf(txtWin.getText())
                    + 1));
        }
    }

    public void exitAction(ActionEvent actionEvent) {
        Platform.exit();
    }
}
