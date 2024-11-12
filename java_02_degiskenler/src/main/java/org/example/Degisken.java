package org.example;

import java.sql.SQLOutput;

public class Degisken {
    public static void main(String[] args){
        int myInt = 10;
        byte myByte = 20;
        short myShort = 30;
        float myFloat = 40;
        long myLong = 50;
        double myDouble = 60;
        char myChar = 'a';
        boolean myBoolean = true; // false
        System.out.println("4 byte, integer değerler tam sayısyı ifade eder " + myInt);
        System.out.println("1 byte, byte değerler küçük değerleri tutmak için kullanırız " + myByte);
        System.out.println("2 byte short daha kücük değerleri saklamak için kullanılır. " +  myShort);
        System.out.println("4 byte,  float değerler ondalıklı sayısalrı kaydeder " + myFloat);
        System.out.println("4 byte, long daha büyük sayıları kayıt eder " + myLong);
        System.out.println("8 byte, ondalıklı sayıları kayıt eder ama daha büyük kapsam alanı vardır " + myDouble);
        System.out.println("1 bit, boolen true false 1 - 0 doğru yanlış gibi durumları kayıt eder " + myBoolean);
        System.out.println("2 byte , char karakterleri tutmak için kulanılır " + myChar);




    }
}
