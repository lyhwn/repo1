import org.junit.Test;

import java.util.ArrayList;

public class Main {

    @Test
    public void demo1() {

        String aaa="aaa";
        String bbb="bbbb";
        System.out.println(aaa.compareTo(bbb));



    }

    public void demo2(){
        String inoutStr="sdfkjsdl1dsrfe54s2dfd1w3145e";
        for (char c:inoutStr.toCharArray()){
            if ("1234567890".contains(c+"")){
                System.out.print(c);
            }
        }
        System.out.println();
        for (int i = 0; i < inoutStr.length(); i++) {
            if ("1234567890".contains(inoutStr.charAt(i)+"")){
                System.out.print(inoutStr.charAt(i));
            }
        }
    }

    @Test
    public void testHelloWrold() {
        System.out.println("HelloWorld!");
        System.out.println("HelloWorld!");
        System.out.println("HelloWorld!");
        System.out.println("HelloWorld!");
        System.out.println("HelloWorld!");
    }
}
