package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringHWTest {
    @Test
    public void test_string_A_Z(){
        char [] actual = StringHW.string_A_Z();
        char [] expected = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void test_string_z_a(){
        char [] actual = StringHW.string_z_a();
        char [] expected = {'z','y','x','w','v','u','t','s','r','q','p','o','n','m','l','k','j','i','h','g','f','e','d','c','b','a'};
        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void test_string_а_я(){
        char [] actual = StringHW.string_а_я();
        char [] expected = {'а','б','в','г','д','е','ж','з','и','й','к','л','м','н','о','п','р','с','т','у','ф','х','ц','ч','ш','щ','ъ','ы','ь','э','ю','я'};
        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void test_string_0_9(){
        char [] actual = StringHW.string_0_9();
        char [] expected = {'0','1','2','3','4','5','6','7','8','9'};
        Assertions.assertArrayEquals(actual, expected);
    }

    //@Test
//    public void symbolsASCII() {
//        char[] actual = First.symbolsASCII();
//        char[] expected = new char[]{' ', '!', '"', '#', '$', '%', '&', '(', ')', '*', '+', ',', '-', '.', '/', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ':', ';', '<', '=', '>', '?', '@', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '[', '/', ']', '^','_', '`', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '{', '|', '}', '~',' '};
//                Assertions.assertArrayEquals(actual, expected);
//}

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

//    @Test
//    public void test_reverse(){
//        StringBuilder actual = StringHW.reverse("qwertyuiop");
//        String expected = (StringBuilder) "poiuytrewq";
//        Assertions.assertEquals(actual, expected);
//    }

    @Test
    public void test_deleteLastWord(){
        String actual = StringHW.deleteLastWord("car id fox");
        String expected = "car id";
        Assertions.assertEquals(actual, expected);
    }
}
