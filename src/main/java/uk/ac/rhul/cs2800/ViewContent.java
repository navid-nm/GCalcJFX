package uk.ac.rhul.cs2800;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ViewContent {
  
  CalcModel cm = new CalcModel();
  
  @FXML
  private TextField expr;

  @FXML
  private TextArea output;

  @FXML
  void isPressed(ActionEvent event) {
    String out = Float.toString(cm.evaluate(expr.getText(), false));
    output.setText(out);
  }
}
