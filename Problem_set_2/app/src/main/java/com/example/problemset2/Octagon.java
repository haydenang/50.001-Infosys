package com.example.problemset2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Octagon implements Comparator<Octagon> {

    private double side;
    public Octagon(double side){
        this.side = side;
    }
    public double getSide() {
        return side;
    }

    @Override
    public int compare(Octagon o1, Octagon o2) {
        if (o1.getSide()> o2.getSide()){
            return 1;
        }
        else if (o1.getSide()==o2.getSide()){
            return 0;
        }
        else{
            return -1;
        }
    }

}





