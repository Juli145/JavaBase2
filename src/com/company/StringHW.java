package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringHW {

    public static String string_A_Z (){
        char [] alphabet = new char[26];
        for (int i = 0; i < 26; i++) {
            alphabet[i] = (char) (65 + i);
        }
        return new String(alphabet);
    }

    public static String string_z_a (){
        char [] alphabet = new char[26];
        for (int i = 25; i >= 0; i--) {
            alphabet[i] = (char) (122 - i);
        }
        return new String(alphabet);
    }

    public static String string_а_я () {
        char[] alphabet = new char[32];
        for (int i = 0; i < 32; i++) {
            alphabet[i] = (char) (1072 + i);
        }
        return new String(alphabet);
    }

    public static String string_0_9 (){
        char[] numbers = new char[10];
        for (int i = 0; i <= 9; i++) {
            numbers[i] = (char) (48 + i);
        }
        return new String(numbers);
    }


    public static String string_printable_char () {
        char[] chars = new char[95];
        for (int i = 0; i <= 94; i++) {
            chars[i] = (char) (32 + i);
        }
        return new String(chars);
    }

    public static String integer_to_String(int x){
        return String.valueOf(x);
    }

    public static String double_to_String(double x){
        return  String.valueOf(x);
    }

    public static int string_to_Integer(String str){
        return Integer.parseInt(str);
    }

    public static double string_to_Double(String str){
        return  Double.valueOf(str);
    }

    public static int shortestWord (String str) {
        String[] words = str.split(" ");
        int min = words[0].length(); // длинна 1го элемента - 5
        for (int i = 1; i < words.length; i++) {
            min = Math.min(words[i].length(), min);
        }
        return min;
    }

    public static String change_to_$ (String str, int quantity) {
        String result = "";
        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() == quantity) {
                result = words[i].substring(0, words[i].length() - 3);
                result = result + "$$$";
                System.out.println(result);
            }
        }
        return result;
    }

    public static String add_space(String str){
        Pattern pattern = Pattern.compile("[\\pP\\W]");
        Matcher matcher = pattern.matcher(str);
        while(matcher.find()) {
            String w = matcher.group();
            str = str.replaceAll("\\" + w, w + " ");
            str = str.replaceAll("\\s+", " ");
        }
        return str;
    }

    public static String getUniqueChar(String value){
        String result = "";
        for(int i = 0; i < value.length(); i++) {
            if (result.indexOf(value.charAt(i)) == - 1) {
                result += value.charAt(i);
            }
        }
        return result;
    }

    public static int amountOfWords(String str){
        String[] words = str.split(" ");
        int amount = 0;
        for (int i = 0; i < words.length; i++) {
            amount++;
        }
        return amount;
    }

    public static String deletePosition(String str, int startIndex, int amountToDelete){
        return str.replace(str.substring(startIndex, (startIndex + amountToDelete)), "");
    }

    public static String reverse(String str){
        StringBuilder string = new StringBuilder(str);
        return string.reverse().toString();
    }

    public static String deleteLastWord(String str) {
        int a = str.length();
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == ' ') {
                a = i;
                break;
            }
        }
        return str.substring(0, a);
    }
}