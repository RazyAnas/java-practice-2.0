public class SimpleCalculator {
    // two instance variables as required in question
    private double firstNumber;
    private double secondNumber;
    // getters and setters for instance  (instance methods)
    public double getFirstNumber() { // done
        return firstNumber;
    }
    public void setFirstNumber(double firstNumber) { // done
        this.firstNumber = firstNumber;
    }
    public double getSecondNumber() { // done
        return secondNumber;
    }
    public void setSecondNumber(double secondNumber) { // done
        this.secondNumber = secondNumber;
    }


    // several other instance methods as required in question
    public double getAdditionResult(){
        return getFirstNumber()+getSecondNumber();
    }
    public double getSubtractionResult(){
        return getFirstNumber()-getSecondNumber();
    }
    public double getMultiplicationResult(){
        return getFirstNumber()*getSecondNumber();
    }
    public double getDivisionResult(){
        if (getSecondNumber() == 0){
            return 0;
        }
        return getFirstNumber()/getSecondNumber();
    }

}
