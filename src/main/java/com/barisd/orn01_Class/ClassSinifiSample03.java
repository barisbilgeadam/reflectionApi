package com.barisd.orn01_Class;

public class ClassSinifiSample03 {
    public static void main(String[] args) throws ClassNotFoundException {
        // bildiğiniz bir sınıfdan da Class nesnesini oluşturabilirsiniz:
        Class<?> stringClass=String.class;

        // veya derleme zamanında adını bilmiyorsan bile referans alarak oluşturabilirsin.
        String className="java.lang.String";
        // Class nesnesini bildiğiniz sınıfın adını kullanarak bile oluşturabilirsiniz.
        // Burası zaten Reflection Api'nin başlangıç noktasıdır.
        Class<?> stringClass2=Class.forName(className);


    }
}
