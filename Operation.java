package edu.touro.mco152;

import jdk.nashorn.internal.ir.Symbol;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Optional;

public class Operation {
    private double leftOperand;
    private double rightOperand;
    private String operator;

    public Operation(double leftOperand, String operator, double rightOperand ){
        setLeftOperand(leftOperand);
        setOperator(operator);
        setRightOperand(rightOperand);
    }

    public double getLeftOperand() {
        return leftOperand;
    }

    private void setLeftOperand(double leftOperand) {
        this.leftOperand = leftOperand;
    }

    public double getRightOperand() {
        return rightOperand;
    }

    private void setRightOperand(double rightOperand) {
        this.rightOperand = rightOperand;
    }

    public String getOperator() {
        return operator;
    }

    private void setOperator(String operator) {
        this.operator = operator;
    }

    private Optional<Double> calculatedResult = Optional.empty();

    public double getResult() {
        if (!calculatedResult.isPresent()){
            calculatedResult = Optional.of(performOperation());
        }

        return calculatedResult.get();
    }

    private double performOperation() {
        Field[] operatorscheck = Operators.class.getFields();
        double operators;
        operators = 0;
        for (int i = 0; i < operatorscheck.length; i++) {
            if (Objects.equals(operator, operatorscheck[i])) {
                operators = new Operators().Operator(leftOperand, operator, rightOperand);
            } else {
                operators = 3013;
            }
        }
        return operators;
    }
    }

