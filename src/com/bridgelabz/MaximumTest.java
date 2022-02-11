package com.bridgelabz;


public class MaximumTest<T extends Comparable> {

    public T x,y,z;


    MaximumTest(T x,T y,T z){
        this.x = x;
        this.y = y;
        this.z = z;
    }



    T maximumOfObjects(T x,T y,T z){
        T maximum = null;
        if(x.compareTo(y) > 0 && x.compareTo(z) > 0)
            maximum = x;
        else if (y.compareTo(x) > 0 && y.compareTo(z) > 0)
            maximum = y;
        else
            maximum = z;
        return maximum;
    }

}
