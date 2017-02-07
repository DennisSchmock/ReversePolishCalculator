package com.company;

/**
 * Created by dennisschmock on 07/02/2017.
 */
public class Calc {
    private PathStack<Integer> interMediateResults = new PathStack();
    private PathStack<Integer> results = new PathStack();
    private PathStack<String> operators = new PathStack();


    public void prepCalculate(String toBeCalculated) {
        String[] numbersAndOperators = toBeCalculated.split(" ");
        for (String number :
                numbersAndOperators) {
            switch (number) {
                case "+":
                    operators.push(number);

                    break;
                case "-":
                    operators.push(number);
                    break;
                case "*":
                    operators.push(number);
                    break;
                case "/":
                    operators.push(number);
                default:
                    Integer numberToPush = Integer.parseInt(number);
                    interMediateResults.push(numberToPush);
            }
        }

        calculate();


        while (!interMediateResults.isEmpty()) {
            System.out.println(interMediateResults.pop());

        }


    }

    private void calculate() {

        while (!operators.isEmpty()) {
            String operator = operators.pop();
            switch (operator) {
                case "+":
                    add();
                    break;
                case "-":
                    substract();
                    break;
                case "*":
                    multiply();
                    break;
                case "/":
                    divide();
                    break;
                default:
                    break;
            }
        }

    }

    public void add() {
        int value1 = interMediateResults.pop();
        int value2 = interMediateResults.pop();
        interMediateResults.push(value1 + value2);
    }

    public void substract() {
        int value1 = interMediateResults.pop();
        int value2 = interMediateResults.pop();
        interMediateResults.push(value1 - value2);
    }

    public void multiply() {
        int value1 = interMediateResults.pop();
        int value2 = interMediateResults.pop();
        interMediateResults.push(value1 * value2);
    }

    public void divide() {
        int value1 = interMediateResults.pop();
        int value2 = interMediateResults.pop();
        interMediateResults.push((value1) / (value2));
    }


}
