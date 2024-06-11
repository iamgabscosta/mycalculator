import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class controller {

    @FXML
    private Text resultText;

    @FXML
    private TextField fieldResult;

    private String calculationType;
    private String firstNumber = " ";
    private String currentNumber = "";
     
    @FXML
    void addButton(ActionEvent event) {
        calculationMoment("+");
    }
    
    @FXML
    void minusButton(ActionEvent event) {
        calculationMoment("-");
    }

    @FXML
    void divideButton(ActionEvent event) {
        calculationMoment("/");
    }

    @FXML
    void multipleButton(ActionEvent event) {
        calculationMoment("*");
    }
    
    public void calculationMoment(String calculationType) {
        this.calculationType = calculationType;
        firstNumber = currentNumber;
        currentNumber = "";
        resultText.setText(firstNumber + " " + calculationType);
    }
    
    @FXML
    void equalityButton(ActionEvent event) {
        int firstNumberInt = Integer.parseInt(firstNumber);
        int secondNumberInt = Integer.parseInt(currentNumber);

        switch (calculationType) {
            case "+" -> {
                int calculateNumber = firstNumberInt + secondNumberInt;
                resultText.setText(firstNumber + " + " + currentNumber + " = " + calculateNumber);
                resultText.setText(String.valueOf(calculateNumber));
            }
            case "-" -> {
                int calculateNumber = firstNumberInt - secondNumberInt;
                resultText.setText(firstNumber + " - " + currentNumber + " = " + calculateNumber);
                resultText.setText(String.valueOf(calculateNumber));
            }
            case "/" -> {
                double calculateNumber = firstNumberInt / (double)secondNumberInt;
                resultText.setText(firstNumber + " / " + currentNumber + " = " + calculateNumber);
                resultText.setText(String.valueOf(calculateNumber));
            }
            case "*" -> {
                int calculateNumber = firstNumberInt * secondNumberInt;
                resultText.setText(firstNumber + " * " + currentNumber + " = " + calculateNumber);
                resultText.setText(String.valueOf(calculateNumber));
            }
        }
    }
    
    @FXML
    void clearButton(ActionEvent event) {
        currentNumber = "";
        fieldResult.setText("");
        resultText.setText("0");
    }
    
    
    @FXML
    void oneButton(ActionEvent event){
        if(!currentNumber.equals("event")){
            addNumber("1");
        }
    }

    @FXML
    void twoButton(ActionEvent event){
        addNumber("2");
    }

    @FXML
    void threeButton(ActionEvent event){
        addNumber("3");
    }

    @FXML
    void fourButton(ActionEvent event){
        addNumber("4");
    }

    @FXML
    void fiveButton(ActionEvent event){
        addNumber("5");
    }

    @FXML
    void sixButton(ActionEvent event){
        addNumber("6");
    }

    @FXML
    void sevenButton(ActionEvent event){
        addNumber("7");
    }
    
    @FXML
    void eightButton(ActionEvent event){
        addNumber("8");
    }
    
    @FXML
    void nineButton(ActionEvent event){
        addNumber("9");
    }
    
    public void updateResultText() {
        resultText.setText(currentNumber);
    }
    
    public void addNumber(String number){
        currentNumber += number;
        updateResultText();
    }
}
