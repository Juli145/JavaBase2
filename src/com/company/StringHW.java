package com.company;

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
}

