package com.barisd.orn02_Metamodel;

import java.lang.reflect.Field;

public class MetamodelSample01 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Person p1=new Person();
        Class<?> clz=p1.getClass();

        Field ageField=clz.getDeclaredField("age");
        ageField.set(p1,38);
        System.out.println(p1.getAge());

        //peki private alana değer nasıl atabilirim?
        Field nameField = clz.getDeclaredField("name");
        nameField.setAccessible(true);
        nameField.set(p1,"Baris D.");
        System.out.println(p1.getName());
        //veya:
        System.out.println((String)nameField.get(p1));
    }
}
