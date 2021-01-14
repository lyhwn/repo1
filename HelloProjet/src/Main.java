import org.junit.Test;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String content = sc.nextLine();
            System.out.println(Pattern.matches("^[0-9]*$", content));
        }
    }

    @Test
    public void demo4() {

    }

    @Test
    public void demo3() throws Exception {
        ObjectOutputStream oo = null;
        ObjectInputStream ois = null;
        Map<String, String> telMap;
        try {
            //  oo= new ObjectOutputStream(new FileOutputStream( createAddrBookFile("D:/通讯录.txt")));
            ois = new ObjectInputStream(new FileInputStream(createAddrBookFile("D:/通讯录.txt")));
            telMap = (HashMap) ois.readObject();
            //telMap.put("1","1");
            System.out.println(telMap);
            //   oo.writeObject(telMap);
            //  ois.close();
            //   oo.close();
        } catch (EOFException e) {
            oo = new ObjectOutputStream(new FileOutputStream(createAddrBookFile("D:/通讯录.txt")));
            telMap = new HashMap<String, String>();
            oo.writeObject(telMap);
            oo.close();
            System.out.println(e);
        }
    }

    private static File createAddrBookFile(String path) {
        File file = new File(path);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return file;
    }

    @Test
    public void demo1() {

        String aaa = "aaaabbbcccaaarrrwwwdcxcvdfgagaaa";
        String bbb = "bbbb";
        // System.out.println(aaa.compareTo(bbb));
        //   StringBuilder sb=new StringBuilder(aaa);
        //System.out.println(sb.reverse());
        int count = 0;
        System.out.println(aaa.indexOf("aaa"));
        while (aaa.indexOf("aaa") != -1) {
            System.out.println(aaa);
            aaa = aaa.substring(aaa.indexOf("aaa") + "aaa".length());
            System.out.println(aaa);
            count++;
        }
        System.out.println(count);


    }

    public void demo2() {
        String inoutStr = "sdfkjsdl1dsrfe54s2dfd1w3145e";
        for (char c : inoutStr.toCharArray()) {
            if ("1234567890".contains(c + "")) {
                System.out.print(c);
            }
        }
        System.out.println();
        for (int i = 0; i < inoutStr.length(); i++) {
            if ("1234567890".contains(inoutStr.charAt(i) + "")) {
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
