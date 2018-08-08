package timeTracker;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    public TextField sampleTextField;
    public Label errorMessage;
    private TimeValue sampleText;
    private WorkingYear year;

    @FXML
    private void readTextField() {
        try {
            sampleText = new TimeValue(sampleTextField.getText());
            errorMessage.setText("");
        } catch (IllegalArgumentException ex) {
            errorMessage.setText("Invalid input use 'hh:mm'\n" + ex.getMessage());
        }
        year = new WorkingYear(2018);
    }
}
