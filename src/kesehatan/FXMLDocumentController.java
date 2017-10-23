/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kesehatan;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXTextField;
import static java.lang.Integer.parseInt;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 *
 * @author Rara ^___^
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    
     @FXML
    private JFXTextField nama;

    @FXML
    private JFXTextField tinggi;

    @FXML
    private JFXTextField berat;

    @FXML
    private JFXRadioButton laki;

    @FXML
    private JFXRadioButton perempuan;

    @FXML
    private JFXButton proses;

    @FXML
    private TextArea hasil;

    @FXML
    private TextArea saran;

    @FXML
    private TextField idel;
    

    @FXML
    void proses(ActionEvent event) {
        int beratideal=0;
        String analisa=null;
        String analisasa=null;
        if(laki.isSelected()){
            beratideal=parseInt(tinggi.getText())-105;
        }
        if(perempuan.isSelected()){
            beratideal=parseInt(tinggi.getText())-110;
        }
        idel.setText(""+beratideal);
        if(beratideal==parseInt(berat.getText())){
            analisa="ideal";
            analisasa="berat anda ideal jaga berat badan anda agar tetap ideal";
        }
        else if(beratideal < parseInt(berat.getText())){
            analisa="overweight";
            analisasa="diet o";
        }
        else if(beratideal>parseInt(berat.getText())){
            analisa="Underweight";
            analisasa="Anda terlalu kurus tolong naikan berat badan anda agar ideal";
        }
        hasil.setText(analisa);
        saran.setText(analisasa);
    }

    @FXML
    void reset(ActionEvent event) {
        nama.setText("");
        tinggi.setText("");
        berat.setText("");
        laki.setSelected(false);
        perempuan.setSelected(false);
        idel.setText("");
        hasil.setText("");
        saran.setText("");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
