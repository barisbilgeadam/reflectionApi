package com.barisd.orn01_Class;

public class ClassSinifiSample02 {
    public static void main(String[] args) {
        //Class<?> getClass();
        // Bu örnek hata vermeden çalışır.
        Class<?> helloClass="Hello".getClass();
        //aşağıdaki örnek hata verir. Sebebi; getClass() metodu Class<? extends String> döner. Tür güvenliği için java bunu engeller. Derleme zamanında hata verir.
        //Class<String> helloClass2="Hello".getClass();

        //aşağıdaki örnek hata verir. Sebebi; getClass() metodu Class<? extends String> döner. Tür güvenliği için java bunu engeller. Derleme zamanında hata verir.
        //Class<Object> helloClass3="Hello".getClass();


        // Javada tür güvenliğinden de bahsetmek gerekli olabilir:
        /*
        Java tür güvenliği, özellikle generics ve reflection ile çalışırken önemlidir. Class<T> kullanırken, T türüyle ilgili tam bilgiye sahip olmanız ve doğru tür atamasını yapmanız gerekir. Class<?> kullanımı, tür güvenliği kurallarını gevşeterek bu tür sorunların önüne geçer, ancak yine de dikkatli kullanılmalıdır.

        Derleme zamanı tür güvenliği hatalarını önlemek için, genel tür (generics) kullanımı ve tür dönüşümleri dikkatle yapılmalıdır. Çalışma zamanında tür güvenliği sorunları yaşamamak için, reflection işlemleri doğru türlerle gerçekleştirilmelidir.
         */

        // o zaman döndüğü tipte alalım:
        Class<? extends String> helloClass4="Hello".getClass();
        Class<? extends Object> helloClass5="Hello".getClass();



    }
}
