package com.javacourse.homework.task20;

import java.util.Arrays;

public class Runner20 {
    public static void main(String[] args) {
//        String str = "На дворе - трава, на траве - дрова. Не руби дрова на траве двора!";
//        str = str.replaceAll("[^А-Яа-я]", " ");
//        str = str.replaceAll("\\s+", " ");
//        str = str.toLowerCase();
//        str = str.strip();
//        //System.out.println(str);
//        String[] words = str.split(" ");
//
//        for (int i = 0; i < words.length; i++) {
//            int counter = 0;
//            for (int j = i +1; j < words.length; j++) {
//                if (words[i].equals(words[j]) && !words[i].equals("")) {
//                    counter++;
//                    words[j] = "";
//                }
//            }
//            if (counter > 0) {
//                System.out.println("слово " + words[i] + " встречается " + (counter + 1) + " разa.");
//            }
//        }
//________________________________________________________________________________________
//        String str = "Не плюй в колодец, пригодится воды напиться.";
//        String str2 = str.replaceAll("о", "");
//        System.out.println(str.length() - str2.length());
//
//___________________________________________________________________________________
//          String str = "Не плюй в колодец, пригодится воды напиться.";
//          String[] words = str.replaceAll("[^А-Яа-я]"," ")
//                  .strip()
//                  .replaceAll("\\s+", " ")
//                  .split(" ");
//          String max = words[0];
//          for (int i = 0; i < words.length; i++){
//              if (max.length() < words[i].length()){
//                  max = words[i];
//              }
//          }
//          System.out.println(max);
//
//          for (int i = 0; i < words.length; i++){
//              if (words[i].length() >= 5){
//                  String[] symbols = words[i].split("");
//                  symbols[4] = "Z";
//                  String word = "";
//                  for (int j = 0; j < symbols.length; j++){
//                    word = word.concat((symbols[j]));
//                  }
//                  words[i] = word;
//              }
//          }
//          System.out.println(Arrays.toString(words));
//_________________________________________________________________

//        String str1 = "";
//        String str2 = "";
//        long t1 = System.currentTimeMillis();
//        for (int i = 0; i <100000; i++){
//            str1 = str1 + i;
//        }
//        long t2 = System.currentTimeMillis();
//
//        long t3 = System.currentTimeMillis();
//        for (int i = 0; i < 100000; i++){
//            str2 = str2.concat(String.valueOf(i));
//        }
//        long t4 = System.currentTimeMillis();
//
//        System.out.println(t2-t1);
//        System.out.println(t4-t3);

//        ________________________________________________
          StringBuffer str1 = new StringBuffer();
          StringBuilder str2 = new StringBuilder();

          long t1 = System.currentTimeMillis();
          for (int i = 0; i < 100000; i++){
              str1.append(i);
          }
          long t2 = System.currentTimeMillis();
          long t3 = System.currentTimeMillis();
          for (int j = 0; j < 100000; j++){
              str2.append(j);
          }
         long t4 = System.currentTimeMillis();

         System.out.println(t2-t1);
         System.out.println(t4-t3);

    }

}
