module ejem {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.web;
	requires javafx.graphics;
	
	opens application to javafx.graphics, javafx.fxml;
}
