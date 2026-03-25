module HyperSync {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics; // આ લાઈન ખાસ ઉમેરજો

    opens client to javafx.graphics, javafx.fxml;
}