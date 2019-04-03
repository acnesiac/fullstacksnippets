package com.ds;

import java.util.*;


public class Merge {

    public static void main( String args[]){
      Merge m = new Merge();
//      m.merge();
      m.count();
    }

//    public void merge(){
//        List<String> l = Arrays.asList("1", "2", "3", "4");
//        List<String> l2 = Arrays.asList("3", "5", "6", "7", "9", "15", "20");
//
//        l.addAll(l2);
//
//        //l.add("");
//        //l.stream().forEach();
//
//
//
//        System.out.println(l);
//    }

    public void random(){
        double[] d = new double[10];
        for (int i =0 ; i <d.length ; i++){
            d[i] = Math.random();
        }
    }



    public void count(){


        List<String> words = Arrays.asList("hola", "mundo", "demo", "words", "hello","mundo");

        HashMap<String, Integer> hm = new HashMap<String,Integer>();
        for (String word : words){
            hm.put(word,0);
        }

        for (String s : words){
            if( hm.containsKey(s) ){
                int i = hm.get(s);
                ++i;
                hm.put(s,i);
            }
        }

        System.out.println(hm);
    }

//
//
//    public int distance(Node root, int n1) {
//        if (root != null) {
//            int x = 0;
//            if ((root.data == n1) || (x = distance(root.left, n1)) > 0
//                    || (x = distance(root.right, n1)) > 0) {
//                // System.out.println(root.data);
//                return x + 1;
//            }
//            return 0;
//        }
//        return 0;
//    }



}
