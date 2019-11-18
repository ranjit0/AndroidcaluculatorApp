package com.example.calculatorappactivity;

public class Arthemetic {

    private int value1, value2;
    public Arthemetic(int valueOne, int valuetwo){
        this.value1=valueOne;
        this.value2=valuetwo;
    }

    public int plus(){
        return value1 +value2;

    }
    public int minus(){
        return value1 - value2;
    }
    public int multiply(){
        return value1*value2;
    }
    public int divide(){
        return value1/value2;
    }
    public int modulus(){
        return value1%value2;
    }


}
