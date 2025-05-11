package oopLesson.string;

import java.awt.*;
import java.util.Arrays;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class StringExample {

    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        System.out.println(s1.equals(s2));

        String s3 = "abc";
        String s4 = "abc";
        System.out.println(s3.compareTo(s4));

        String fName = "Zin";
        String lName = "Phyo";

        System.out.println("Hello "+ fName+ " World");
        System.out.println(fName.concat(lName));

        StringBuilder str = new StringBuilder("Hello");
        StringBuilder str2 = new StringBuilder(" World");
        StringBuilder result = str.append(str2);
        System.out.println(result);

        String result2 = String.format("%s%s",fName,lName);
        System.out.println(result2);

        String result3 = String.join("-",fName,lName);
        System.out.println(result3);

        StringJoiner output = new StringJoiner("-");
        output.add("my");
        output.add("name");
        output.add("is");
        System.out.println(output);

//        List<String> strings = Arrays.asList("one","two","three");
//        String str4 = strings.stream().collect(Collectors.joining("_"));
//        System.out.println(str4);

        String message = "Hel,lo";
        String r1 = message.substring(0);
        System.out.println(r1);


        String r2 = message.substring(0,3);
        System.out.println(r2);

        String setntences[] = message.split(",");
        System.out.println(Arrays.toString(setntences));

    }
}

//String constant pool

//String compare
