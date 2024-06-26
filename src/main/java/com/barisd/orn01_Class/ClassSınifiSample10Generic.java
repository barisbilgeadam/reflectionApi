package com.barisd.orn01_Class;

import java.lang.reflect.Field;

public class ClassSınifiSample10Generic {
    public static void main(String[] args) {
        Person p1 = new Person("Baris D.", 38);
        Student s1 = new Student("Ogrenci1", 5);

        printFields(p1);
        printFields(s1);

        printFieldsGeneric(p1);
        printFieldsGeneric(s1);
    }

    public static void printFields(Object obj) {
        Class<?> clz = obj.getClass();
        Field[] fields = clz.getDeclaredFields();

        for (Field field : fields) {
            field.setAccessible(true); // private alanlara erişimi sağlar
            try {
                System.out.println("Field Name: " + field.getName());
                System.out.println("Field Value: " + field.get(obj)); // alanın değerini alır
                System.out.println("-----------------------------");
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }
    public static <T> void printFieldsGeneric(T obj) {
        Class<?> clz = obj.getClass();
        Field[] fields = clz.getDeclaredFields();

        for (Field field : fields) {
            field.setAccessible(true); // private alanlara erişimi sağlar
            try {
                System.out.println("Field Name: " + field.getName());
                System.out.println("Field Value: " + field.get(obj)); // alanın değerini alır
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }
}
