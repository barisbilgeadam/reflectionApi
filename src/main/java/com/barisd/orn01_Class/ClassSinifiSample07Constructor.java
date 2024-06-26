package com.barisd.orn01_Class;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class ClassSinifiSample07Constructor {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        // Person sınıfını al
        Class<?> clz = Person.class;

        // Parametresiz constructor al
        Constructor<?> defaultConstructor = clz.getConstructor();

        // Parametreli constructor al (örneğin, String ve int parametreleri olan bir constructor)
        Constructor<?> paramConstructor = clz.getConstructor(String.class, Integer.class);

        // Yeni nesneler oluştur
        Person person1 = (Person) defaultConstructor.newInstance();
        Person person2 = (Person) paramConstructor.newInstance("John Doe", 30);

        System.out.println(person1);
        System.out.println(person2);
        // Sadece public constructorlara erişim
        Constructor[] constructors=clz.getConstructors();
        System.out.println(Arrays.toString(constructors));
        // Tüm constructorlara erişim
        Constructor[] declaredConstructors=clz.getDeclaredConstructors();
        System.out.println(Arrays.toString(declaredConstructors));

    }
}
