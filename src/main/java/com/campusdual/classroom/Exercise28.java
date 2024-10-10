package com.campusdual.classroom;

public class Exercise28 {
    public static void main(String[] args){
        int divisor = 10;
        int dividend = 0;
        if(dividend==0){
            throw new ArithmeticException("Error de división por cero:");
        }else{
            double result = divisor / dividend;
        }
    }
}
