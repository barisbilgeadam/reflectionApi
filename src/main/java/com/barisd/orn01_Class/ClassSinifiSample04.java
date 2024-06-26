package com.barisd.orn01_Class;

public class ClassSinifiSample04 {
    public static void main(String[] args) throws ClassNotFoundException {
        //Bir objenin Class'ını bulmak için Class instance almanın 3 farklı yolunu gördük:
        Class<?> clz1="Hello".getClass(); //nesne ile
        Class<?> clz2=String.class; // bilinen bir class ile.
        Class<?> clz3=Class.forName("java.lang.String"); // sınıfın adı ile.

        // peki Class'ı bulduysak bununla neler yapabiliriz?
        // varsa super classlarına ulaşabiliriz.
        Class<?> superClass=clz1.getSuperclass(); //burada Object class'ının superclassı alınmak istenirse null gelir.
        // eğer implemente edilmiş interface varsa onlara ulaşabiliriz.
        Class<?> interfaces[]=clz1.getInterfaces(); // varsa dolu yoksa boş bir dizi döner.

    }
}
