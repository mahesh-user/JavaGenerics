package com.bridgelabz;


public class MaximumTest<T extends Comparable> {
    //class level variables
    public T x,y,z;

    /**
     * parameterised constructor to assign values to the instance variables
     * @param x
     * @param y
     * @param z
     */
    MaximumTest(T x,T y,T z){
        this.x = x;
        this.y = y;
        this.z = z;
    }


    /**
     *passing three objects as parameters to get maximum number
     * @return maximum
     */
    T maximumOfObjects(T x,T y,T z){
        T maximum = null;
        if(x.compareTo(y) > 0 && x.compareTo(z) > 0)
            maximum = x;
        else if (y.compareTo(x) > 0 && y.compareTo(z) > 0)
            maximum = y;
        else
            maximum = z;
        return maximum;   //returning largest one
    }

}
