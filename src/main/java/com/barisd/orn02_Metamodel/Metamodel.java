package com.barisd.orn02_Metamodel;

import com.barisd.orn02_Metamodel.anotations.Column;
import com.barisd.orn02_Metamodel.anotations.PrimaryKey;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Metamodel <T>{
    private Class<T> clss;

    public Metamodel(Class<T> clss) {
        this.clss = clss;
    }

    public static <T> Metamodel<T> of(Class<T> clss){
        return new Metamodel<>(clss);
    }

    public PrimaryKeyField getPrimaryKeyField(){
        Field[] fields = clss.getDeclaredFields();
        for (Field field : fields) {
            PrimaryKey primaryKey = field.getAnnotation(PrimaryKey.class);
            if(primaryKey!=null){
                PrimaryKeyField primaryKeyField=new PrimaryKeyField(field);
                return primaryKeyField;
            }

        }
        throw new IllegalArgumentException(clss.getSimpleName()+ " Sınıfında Primary Key bulunamadı");
    }
    public List<ColumnField> getColumnFields() {
        List<ColumnField> columnFields = new ArrayList<>();
        Field[] fields = clss.getDeclaredFields();
        for (Field field : fields) {
            Column column = field.getAnnotation(Column.class);
            if (column != null) {
                ColumnField columnField = new ColumnField(field);
                columnFields.add(columnField);
            }
        }
        return columnFields;
    }
}
