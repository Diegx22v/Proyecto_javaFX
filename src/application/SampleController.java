package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.web.WebView;
import javax.swing.JOptionPane;;

public class SampleController {
    @FXML
    private WebView webView;

    @FXML
    private CheckBox a1CheckBox;
    @FXML
    private CheckBox b1CheckBox;
    @FXML
    private CheckBox c1CheckBox;
    @FXML
    private CheckBox a2CheckBox;
    @FXML
    private CheckBox b2CheckBox;
    @FXML
    private CheckBox c2CheckBox;
    @FXML
    private Button guardarButton;

    private boolean seleccionGuardada;
    
    @FXML
    public void initialize() {
        String youtubeEmbedUrl = "https://www.youtube.com/embed/kAbrnfx7axc";
        webView.getEngine().load(youtubeEmbedUrl);
    }
    
    @FXML
    private void guardarSeleccion() {
        seleccionGuardada = a1CheckBox.isSelected();
        JOptionPane.showMessageDialog(null,"Selección guardada: " + (seleccionGuardada ? "Opción a1 seleccionada" : "Opción a1 no seleccionada"));
    }

    public boolean getSeleccionGuardada() {
        return seleccionGuardada;
    }

    
    
}
