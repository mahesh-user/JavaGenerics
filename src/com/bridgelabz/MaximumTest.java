package com.bridgelabz;


public class MaximumTest<T extends Comparable> {
    //class level variables
    public T x,y,z;


    MaximumTest(T x,T y,T z){
        this.x = x;
        this.y = y;
        this.z = z;
    }



    T maximum(){
        T maximum = null;
        if(x.compareTo(y) > 0 && x.compareTo(z) > 0)
            maximum = x;
        else if (y.compareTo(x) > 0 && y.compareTo(z) > 0)
            maximum = y;
        else
            maximum = z;
        return maximum;   //returning largest one
    }
    public <T> void printMax(){
        System.out.println("Maximum number is : " + this.maximum());
    }
}
