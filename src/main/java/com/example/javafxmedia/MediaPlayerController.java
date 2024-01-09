package com.example.javafxmedia;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.FileChooser;

import java.io.File;

public class MediaPlayerController {

    @FXML
    private Button btnPlay;

    @FXML
    private Label lblDuration;

    @FXML
    private MediaView mediaView;

    private Media media;
    private MediaPlayer mediaPlayer;

    @FXML
    void btnPlay(MouseEvent event) {

    }

    @FXML
    void btnStop(MouseEvent event) {

    }

    @FXML
    void mediaPlay(ActionEvent event) {

    }

    @FXML
    void selectMedia(ActionEvent event) {

        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Select Media: ");
        File selectedFile = fileChooser.showOpenDialog(null);

        if(selectedFile != null) {
            String url = selectedFile.toURI().toString();

            media = new Media(url);
            mediaPlayer = new MediaPlayer(media);

            mediaView.setMediaPlayer(mediaPlayer);

            mediaPlayer.setAutoPlay(true);
        }
    }

}
