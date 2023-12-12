package com.example.praktikum6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Tabel extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        TableView tabel = new TableView();
        TableColumn<Mahasiswa, String> kolomNIM = new TableColumn<>("NIM");
        kolomNIM.setCellValueFactory(
                new PropertyValueFactory<>("nim")
        );
        TableColumn<Mahasiswa, String> kolomNama = new TableColumn<>("Nama");
        kolomNama.setCellValueFactory(
                new PropertyValueFactory<>("nama")
        );

        tabel.getColumns().addAll(kolomNIM, kolomNama);
        tabel.getItems().add(new Mahasiswa("Ryan Muhammad Irfan", "2210817310013"));
        tabel.getItems().add(new Mahasiswa("Hafiz Pratama Budiman", "2210817310007"));
        tabel.getItems().add(new Mahasiswa("Bima Sanjaya", "2210817210008"));
        tabel.getItems().add(new Mahasiswa("Akhmad Raihan Ridha", "2210817110001"));
        tabel.getItems().add(new Mahasiswa("Trisna Cahya Permadi", "2210817210021"));
        tabel.getItems().add(new Mahasiswa("Kevin Maleakhi", "2210817210031"));
        tabel.getItems().add(new Mahasiswa("Ahmad Reza Alfayiet", "2210817210016"));
        tabel.getItems().add(new Mahasiswa("Riyo Aurora Gusion", "2210817310016"));
        tabel.getItems().add(new Mahasiswa("Ady T. Adilang", "2210817710001"));
        tabel.getItems().add(new Mahasiswa("M.Daffa Az-Zikra", "2210917310011"));

        VBox box = new VBox(tabel);
        Scene scene = new Scene(box);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}