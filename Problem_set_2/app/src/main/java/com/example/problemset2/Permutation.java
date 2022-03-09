package com.example.problemset2;

import java.util.ArrayList;

public class Permutation {
    private final String in;
    private ArrayList<String> a = new ArrayList<String>();
    // additional attribute if needed

//Main Recursive function
    Permutation(final String str){
        in = str;
        // additional initialization if needed
    }

    public void permute(){
        // produce the permuted sequence of 'in' and store in 'a', recursively
        permute("",in);
    }

    public void permute(String done,String remaining){
        if (remaining.length()==0){
            a.add(done);
        } else{
            for (int i=0;i<remaining.length();i++){
                permute(done+remaining.charAt(i),remaining.substring(0,i)+remaining.substring(i+1));
            }
        }
    }

    public ArrayList<String> getA(){
        return a;
    }
    public static void main(String[] args) {
        ArrayList<String> v;

        Permutation p = new Permutation("hat");
        p.permute();
        v = p.getA();
        System.out.println(v);
    }
}
