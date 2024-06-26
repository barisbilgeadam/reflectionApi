package com.barisd.orn01_Class;

public class ClassSinifiSample01 {

    public static void main(String[] args) {
        String merhaba="merhaba";
        Class merhabaClass=merhaba.getClass(); //getClass Object sınıfı içinden gelmektedir.


        String hello="hello";
        Class helloClass=hello.getClass();

        if(merhabaClass==helloClass){
            System.out.println("esit");
        }
    }
}
