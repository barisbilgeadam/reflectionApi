package com.barisd.orn02_Metamodel;

/**
 * Derleme aşamasında T'nin hangi tip olduğunu bilmeden bu sınıfın db'ye okuyup yazmasını sağlayacağız.
 * @param <T>
 */
public interface EntityManager <T>{
    void persist(T t);
    T read(Class<?> clzz,Long primaryKey);
}

