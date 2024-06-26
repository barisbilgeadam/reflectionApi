package com.barisd.orn01_Class;

import java.lang.reflect.Field;
import java.util.Arrays;

public class ClassSinifiSample05Field {
    public static void main(String[] args) throws NoSuchFieldException {
        //Person Class'ının fieldlarına erişmeye çalışalım.
        Class<?> clz= Person.class;
        // şimdi bir Classtaki Fieldlara nasıl erişebiliriz ona bakalım:

        //Tek bir field'a erişme:
        Field field=clz.getField("name");
        //Declare edilmiş tüm fieldlara erişim(private,protected,default access modifier olanlar dahil)
        Field[] declaredFields=clz.getDeclaredFields();
        System.out.println(Arrays.toString(declaredFields));
        //Sadece public fieldlara erişim:
        Field[] fields=clz.getFields();
        System.out.println(Arrays.toString(fields));

//        //Field bilgilerine erişme:
//        String fieldName=field.getName();
//        System.out.println(fieldName);
//        String fieldName2=declaredFields[0].getName();
//        System.out.println(fieldName2);
//        String fieldName3=fields[0].getName();
//        System.out.println(fieldName3);
//

    }
}
