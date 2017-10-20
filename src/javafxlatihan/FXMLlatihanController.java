/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxlatihan;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Ikhsan
 */
public class FXMLlatihanController implements Initializable {
    @FXML
    private TextField Nama;

    @FXML
    private TextField Alamat;

    @FXML
    private TextField Absen;

    @FXML
    private TextField Telepon;

    @FXML
    private TextArea hasil;
    
    @FXML
    void Hasil(ActionEvent event) {
        String nama = Nama.getText();
        String telepon = Telepon.getText();
        String absen = Absen.getText();
        String alamat = Alamat.getText();
        
        hasil.setText(" Nama : "+nama+"\n Alamat : "+"\n Absen : "+absen+"\n Telepon : "+telepon );
    }
    @FXML
    void Hapus(ActionEvent event) {
        String nama = Nama.getText();
        String telepon = Telepon.getText();
        String absen = Absen.getText();
        String alamat = Alamat.getText();
        
        Nama.setText("");
        Telepon.setText("");
        Absen.setText("");
        Alamat.setText("");
        hasil.setText("");
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
