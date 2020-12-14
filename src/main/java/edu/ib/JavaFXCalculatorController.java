package edu.ib;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class JavaFXCalculatorController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField display;

    @FXML
    private Button delete;

    @FXML
    private Button changeSign;

    @FXML
    private Button percent;

    @FXML
    private Button divide;

    @FXML
    private Button seven;

    @FXML
    private Button eight;

    @FXML
    private Button nine;

    @FXML
    private Button multiply;

    @FXML
    private Button four;

    @FXML
    private Button five;

    @FXML
    private Button six;

    @FXML
    private Button minus;

    @FXML
    private Button one;

    @FXML
    private Button two;

    @FXML
    private Button three;

    @FXML
    private Button plus;

    @FXML
    private Button zero;

    @FXML
    private Button dot;

    @FXML
    private Button equals;

    private final Calculator c = new Calculator();


    @FXML
    void onCalculate(ActionEvent event) {
        display.setText(c.calculate());
    }

    @FXML
    void onChangeSign(ActionEvent event) {
        display.setText(c.changeSign());
    }

    @FXML
    void onDelete(ActionEvent event) {
        c.delete();
        display.setText("0");
    }

    @FXML
    void onNumber(ActionEvent event) {

        Button btn = (Button) event.getSource();
        switch(btn.getId()) {
            case "zero":
                if ((display.getText()).charAt(0) == '0')
                    break;
                else
                    display.setText(c.modifyNumber("0"));
                break;
            case "one":
                display.setText(c.modifyNumber("1"));
                break;
            case "two":
                display.setText(c.modifyNumber("2"));
                break;
            case "three":
                display.setText(c.modifyNumber("3"));
                break;
            case "four":
                display.setText(c.modifyNumber("4"));
                break;
            case "five":
                display.setText(c.modifyNumber("5"));
                break;
            case "six":
                display.setText(c.modifyNumber("6"));
                break;
            case "seven":
                display.setText(c.modifyNumber("7"));
                break;
            case "eight":
                display.setText(c.modifyNumber("8"));
                break;
            case "nine":
                display.setText(c.modifyNumber("9"));
                break;
            case "dot":
                if ((c.getActualText()).contains("."))
                    break;
                else if ((display.getText()).equals("0")){
                    c.setActualText("0");
                    display.setText(c.modifyNumber("."));}
                else
                    display.setText(c.modifyNumber("."));
                break;
        }
    }

    @FXML
    void onOperator(ActionEvent event) {
        if(((Button) event.getSource()).getId().equals("percent")) {
            display.setText(c.percent());
        }
        else
            c.setOperator(((Button) event.getSource()).getId());
    }

    @FXML
    void initialize() {
        assert display != null : "fx:id=\"display\" was not injected: check your FXML file 'calculator.fxml'.";
        assert delete != null : "fx:id=\"delete\" was not injected: check your FXML file 'calculator.fxml'.";
        assert changeSign != null : "fx:id=\"changeSign\" was not injected: check your FXML file 'calculator.fxml'.";
        assert percent != null : "fx:id=\"percent\" was not injected: check your FXML file 'calculator.fxml'.";
        assert divide != null : "fx:id=\"divide\" was not injected: check your FXML file 'calculator.fxml'.";
        assert seven != null : "fx:id=\"seven\" was not injected: check your FXML file 'calculator.fxml'.";
        assert eight != null : "fx:id=\"eight\" was not injected: check your FXML file 'calculator.fxml'.";
        assert nine != null : "fx:id=\"nine\" was not injected: check your FXML file 'calculator.fxml'.";
        assert multiply != null : "fx:id=\"multiply\" was not injected: check your FXML file 'calculator.fxml'.";
        assert four != null : "fx:id=\"four\" was not injected: check your FXML file 'calculator.fxml'.";
        assert five != null : "fx:id=\"five\" was not injected: check your FXML file 'calculator.fxml'.";
        assert six != null : "fx:id=\"six\" was not injected: check your FXML file 'calculator.fxml'.";
        assert minus != null : "fx:id=\"minus\" was not injected: check your FXML file 'calculator.fxml'.";
        assert one != null : "fx:id=\"one\" was not injected: check your FXML file 'calculator.fxml'.";
        assert two != null : "fx:id=\"two\" was not injected: check your FXML file 'calculator.fxml'.";
        assert three != null : "fx:id=\"three\" was not injected: check your FXML file 'calculator.fxml'.";
        assert plus != null : "fx:id=\"plus\" was not injected: check your FXML file 'calculator.fxml'.";
        assert zero != null : "fx:id=\"zero\" was not injected: check your FXML file 'calculator.fxml'.";
        assert dot != null : "fx:id=\"dot\" was not injected: check your FXML file 'calculator.fxml'.";
        assert equals != null : "fx:id=\"equals\" was not injected: check your FXML file 'calculator.fxml'.";

    }
}
