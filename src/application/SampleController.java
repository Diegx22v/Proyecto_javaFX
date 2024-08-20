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
    private CheckBox d1CheckBox;
    @FXML
    private CheckBox d2CheckBox;
    
    
    
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
    	if (b1CheckBox.isSelected() || c1CheckBox.isSelected() || d1CheckBox.isSelected()){
    		JOptionPane.showMessageDialog(null,"Opcion incorrecta");
    	}else  	if(a1CheckBox.isSelected()){
    		JOptionPane.showMessageDialog(null,"Opcion correcta");
    	}else {
    		JOptionPane.showMessageDialog(null, "No puede dejar vacio la pregunta uno");
    	}        
    }

    public boolean getSeleccionGuardada() {
        return seleccionGuardada;
    }

    
    
}
