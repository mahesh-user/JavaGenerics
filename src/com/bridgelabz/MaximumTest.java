package com.bridgelabz;


public class MaximumTest<T extends Comparable<T>> {

    T maximum(T ...element ){
        T maximum = element[0];
        for (T a:element) {
            if(a.compareTo(maximum) > 0)
                maximum = a;
        }
        return maximum;
    }
}
