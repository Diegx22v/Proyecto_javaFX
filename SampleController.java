package application;

import javafx.fxml.FXML;
import javafx.scene.web.WebView;

public class SampleController {
    @FXML
    private WebView webView;

    @FXML
    public void initialize() {
        String youtubeEmbedUrl = "https://www.youtube.com/embed/kAbrnfx7axc";
        webView.getEngine().load(youtubeEmbedUrl);
    }
}
