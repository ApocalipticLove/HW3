package org.example;

public class Main {

    public static void main(String[] args) {

        byte byte1 = 127;
        short short1 = 32676;
        int int1 = 214748;
        long long1 = 9223372;
        float float1 = 5.5f;
        double double1 = -8.1;

        System.out.println(byte1 + double1);
        System.out.println(int1 - long1);
        System.out.println(float1 * short1);
        System.out.println(byte1 / float1);

        byte a = 120;
        System.out.println((byte) (a+100));

        if (a>127){
            System.out.println("Это не byte");
        }
        else if (a==127) {
            System.out.println("Это byte");
        }
        if (a<-128){
            System.out.println("Это не byte");
        }
    }
}