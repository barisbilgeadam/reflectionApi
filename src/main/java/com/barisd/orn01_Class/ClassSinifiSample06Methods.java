package com.barisd.orn01_Class;

import java.lang.reflect.Method;
import java.util.Arrays;

public class ClassSinifiSample06Methods {
    public static void main(String[] args) throws NoSuchMethodException {
        Class<?> clz= Person.class;
        // Tek bir metoda erişim.
        Method method=clz.getMethod("setName", String.class);
        System.out.println(method);
        // Public metodlara erişim, Ayrıca kalıtımla Object sınıfından gelen tüm metodları da getirir.
        Method[] methods=clz.getMethods();
        System.out.println(Arrays.toString(methods));
        // Sadece sınıftaki Tüm metodlara erişim
        Method[] declaredMethods=clz.getDeclaredMethods();
        System.out.println(Arrays.toString(declaredMethods));
    }
}
