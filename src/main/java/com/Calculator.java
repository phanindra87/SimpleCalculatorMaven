package com;

/**
 * Created by phteluku on 3/11/2016.
 */
public class Calculator {
    private int first, second;
    public Calculator(int first, int second) {
        this.first = first;
        this.second = second;

    }

    public void setFirst(int first) {
        this.first = first;
    }

    public void setSecond(int second) {
        this.second = second;
    }
      public Calculator() {
    }


    public int add(){
        return first+second;
    }

    public int prod(){
        return first*second;
    }
}
