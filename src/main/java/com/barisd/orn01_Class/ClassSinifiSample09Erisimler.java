package com.barisd.orn01_Class;

import java.lang.reflect.Field;
import java.util.Arrays;

public class ClassSinifiSample09Erisimler {
    public static void main(String[] args) {
        Person p1=new Person("Baris D.",38);
        Class<?> clz=p1.getClass();
        Field[] fields = clz.getDeclaredFields();

        for (Field field : fields) {
            field.setAccessible(true); // private alanlara erişimi sağlar
            try {
                System.out.println("Field Name: " + field.getName());
                System.out.println("Field Value: " + field.get(p1)); // alanın değerini alır
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }

}
