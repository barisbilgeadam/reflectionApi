package com.barisd.orn02_Metamodel;

import java.lang.reflect.Field;

public class ColumnField {
    private Field field;

    public ColumnField(Field field) {
        this.field = field;
    }
    public String getName(){
        return field.getName();
    }
    public String getType(){
        return field.getType().getSimpleName();
    }
}
