package com.barisd.orn01_Class;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class ClassSinifiSample08Modifiers {
    public static void main(String[] args) throws NoSuchFieldException {
        // modifierlar ile bir metodun veya field'ın erişimini kontrol edebilirsiniz.
        // static mi değil mi?
        // public mi?
        // protected mi?
        // private mi?
        // final mi? değil mi?
        // abstract mi? değil mi?
        // synchronized mi? volatile mi?
        // transient mi?
        // native mi?

        // burada hedef eğer metod abstract ise şunu yap, değilse bunu yap nasıl deriz ona bakacağız...
        // Bunun için Field, Method ve Constructor sınıflarında getModifiers() metodu kullanılır ama anlaşılması zordur.
        // Geriye int değer döner ve her bir değerin farklı bir anlamı vardır.
        // burada bitmasklarla and işlemine sokarak sonuçlar kontrol edilebilir ama çok zor olur bu.

        try {
            // Person sınıfını al
            Class<?> clz = Person.class;

            // "name" alanını al
            Field field = clz.getDeclaredField("name");

            // Modifiers değerini al
            int modifiers = field.getModifiers();


            // Modifier'ları bitwise işlemlerle kontrol et
            boolean isPublic = (modifiers & 0x00000001) != 0;
            boolean isProtected = (modifiers & 0x00000004) != 0;
            boolean isPrivate = (modifiers & 0x00000002) != 0;
            boolean isFinal = (modifiers & 0x00000010) != 0;
            boolean isVolatile = (modifiers & 0x00000040) != 0;
            boolean isTransient = (modifiers & 0x00000080) != 0;
            boolean isNative = (modifiers & 0x00001000) != 0;
            boolean isAbstract = (modifiers & 0x00004000) != 0;
            boolean isSynchronized = (modifiers & 0x00002000) != 0;



            // Modifier'ları kontrol et: Burada Modifier factory class ile bu işlem çok daha mantıklı bir şekilde yapılabilir.
             isPublic = Modifier.isPublic(modifiers);
             isProtected = Modifier.isProtected(modifiers);
             isPrivate = Modifier.isPrivate(modifiers);
             isFinal = Modifier.isFinal(modifiers);
             isAbstract = Modifier.isAbstract(modifiers);
             isSynchronized = Modifier.isSynchronized(modifiers); // Bu metod Field'lar için geçerli değildir, Method'lar için geçerlidir
             isVolatile = Modifier.isVolatile(modifiers);
             isTransient = Modifier.isTransient(modifiers);
             isNative = Modifier.isNative(modifiers); // Bu metod Field'lar için geçerli değildir, Method'lar için geçerlidir

            // Sonuçları yazdır
            System.out.println("isPublic: " + isPublic);
            System.out.println("isProtected: " + isProtected);
            System.out.println("isPrivate: " + isPrivate);
            System.out.println("isFinal: " + isFinal);
            System.out.println("isAbstract: " + isAbstract); // Field'lar için geçerli değildir, class'lar ve method'lar için geçerlidir
            System.out.println("isSynchronized: " + isSynchronized); // Field'lar için geçerli değildir
            System.out.println("isVolatile: " + isVolatile);
            System.out.println("isTransient: " + isTransient);
            System.out.println("isNative: " + isNative); // Field'lar için geçerli değildir
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
