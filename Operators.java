package edu.touro.mco152;

import java.lang.reflect.Array;

public class Operators {
    public static final String Addition = "+";
    public static final String Multiply = "*";
    public static final String Subtract = "-";
    public static final String Divide = "/";
    public static final String Modulus = "%";

    public double Operator(double leftoperand, String str, double rightoperand){
if (str==Addition){ return leftoperand + rightoperand;}
else if (str==Multiply){  return leftoperand * rightoperand;}
else if (str==Subtract){ return leftoperand - rightoperand;}
else if (str==Divide){  return leftoperand / rightoperand;}
else if (str==Modulus){return leftoperand % rightoperand;}
    else return -1;
}
}