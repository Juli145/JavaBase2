package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringHW {

    public void string_A_Z (){
        for (int i = 65; i <= 90; i++) {
            System.out.print((char) i);
            System.out.print(" ");
        }
    }

    public void string_z_a (){
        for (int i = 122; i >= 97; i--) {
            System.out.print((char) i);
            System.out.print(" ");
        }
    }

    public void string_а_я (){
        for (int i = 1072; i <= 1103; i++) {
            System.out.print((char) i);
            System.out.print(" ");
        }
    }

    public void string_0_9 (){
        for (int i = 48; i <= 57; i++) {
            System.out.print((char) i);
            System.out.print(" ");
        }
    }

    public void string_printable_char (){
        for (int i = 32; i <= 126; i++) {
            System.out.print((char) i);
            System.out.print(" ");
        }
    }

    public void integer_to_String(int x){
        String num = String.valueOf(x);
        System.out.println(num);
    }

    public void double_to_String(double x){
        String num = String.valueOf(x);
        System.out.println(num);
    }

    public void string_to_Integer(String str){
        Integer i = Integer.parseInt(str);
        System.out.println(i);
    }

    public void string_to_Double(String str){
        Double d = Double.valueOf(str);
        System.out.println(d);
    }

    public void shortestWord (String str) {
        String[] words = str.split(" ");
        int min = words[0].length(); // длинна 1го элемента - 5
        for (int i = 1; i < words.length; i++) {
            min = Math.min(words[i].length(), min);
        }
        System.out.println(min);
    }

    public void change_to_$ (String str, int quantity) {
        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() == quantity) {
                String result = words[i].substring(0, words[i].length() - 3);
                result = result + "$$$";
                System.out.println(result);
            }
        }
    }

    public String add_space(String value){
        Pattern pattern = Pattern.compile("[\\pP\\W]");
        Matcher matcher = pattern.matcher(value);
        while(matcher.find()) {
            String w = matcher.group();
            value = value.replaceAll("\\" + w, w + " ");
            value = value.replaceAll("\\s+", " ");
        }
        return value;
    }

    public String getUniqueChar(String value){
        String result = "";
        for(int i = 0; i < value.length(); i++) {
            if (result.indexOf(value.charAt(i)) == - 1) {
                result += value.charAt(i);
            }
        }
        return result;
    }

    public int amountOfWords(String str){
        String[] words = str.split(" ");
        int amount = 0;
        for (int i = 0; i < words.length; i++) {
            amount++;
        }
        return amount;
    }

    public String deletePosition(String str, int startIndex, int amountToDelete){
        return str.replace(str.substring(startIndex, (startIndex + amountToDelete)), "");
    }

    public StringBuilder reverse(String str){
        StringBuilder string = new StringBuilder(str);
        string.reverse();
        return string;
    }

    public StringBuilder deleteLastWord(String str){
        StringBuilder words = new StringBuilder(str);
          words.deleteCharAt(words.length() - 1);
        return words;
    }
}


