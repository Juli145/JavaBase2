package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringHWTest {

    @Test
    public void test_string_A_Z(){
        String actual = StringHW.string_A_Z();
        String expected = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_string_z_a(){
        String actual = StringHW.string_z_a();
        String expected = "zyxwvutsrqponmlkjihgfedcba";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_string_а_я(){
        String actual = StringHW.string_а_я();
        String expected = "абвгдежзийклмнопрстуфхцчшщъыьэюя";
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void test_string_0_9(){
        char [] actual = StringHW.string_0_9();
        char [] expected = {'0','1','2','3','4','5','6','7','8','9'};
        Assertions.assertArrayEquals(actual, expected);
    }


    @Test
    public void test_integer_to_String(){
        String actual = StringHW.integer_to_String(5);
        String expected = "5";
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void test_double_to_String(){
        String actual = StringHW.double_to_String(5.0);
        String expected = "5.0";
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void test_string_to_Integer(){
        int actual = StringHW.string_to_Integer("5");
        int expected = 5;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void test_string_to_Double(){
        double actual = StringHW.string_to_Double("5.0");
        double expected = 5.0;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void test_shortestWord(){
        int actual = StringHW.shortestWord("car apple id fox");
        int expected = 2;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void test_change_to_$(){
        String actual = StringHW.change_to_$("cara apple id fox", 4);
        String expected = "c$$$";
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void test_add_space(){
        String actual = StringHW.add_space("cara,apple!id.fox");
        String expected = "cara, apple! id. fox";
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void test_getUniqueChar(){
        String actual = StringHW.getUniqueChar("asdfaghjkla");
        String expected = "asdfghjkl";
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void test_amountOfWords(){
        int actual = StringHW.amountOfWords("car id fox");
        int expected = 3;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void test_deletePosition(){
        String actual = StringHW.deletePosition("caridfox", 3, 2);
        String expected = "carfox";
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void test_reverse(){
        String actual = StringHW.reverse("qwertyuiop");
        String expected = "poiuytrewq";
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void test_deleteLastWord(){
        String actual = StringHW.deleteLastWord("car id fox");
        String expected = "car id";
        Assertions.assertEquals(actual, expected);
    }
}
