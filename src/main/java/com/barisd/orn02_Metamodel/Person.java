package com.barisd.orn02_Metamodel;

import com.barisd.orn02_Metamodel.anotations.Column;
import com.barisd.orn02_Metamodel.anotations.PrimaryKey;

/**
 * Person class için id alanını nasıl @PrimaryKey tanımlayacağız?
 * age ve name alanlarını nasıl @Column tanımlayacağız?
 * Daha doğrusu nasıl anotasyon yazacağız?
 */
public class Person {
    @PrimaryKey
    private Long id;
    @Column
    private Integer age;
    @Column
    private String name;

    public Person() {
    }

    public Person( Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    public static Person of(Integer age, String name) {
        return new Person(age, name);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
