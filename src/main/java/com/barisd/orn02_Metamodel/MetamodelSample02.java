package com.barisd.orn02_Metamodel;

import java.util.Arrays;
import java.util.List;

public class MetamodelSample02 {
    public static void main(String[] args) {

        Metamodel metamodel=Metamodel.of(Person.class);
        PrimaryKeyField primaryKeyField=metamodel.getPrimaryKeyField();
        List<ColumnField> columnFields=metamodel.getColumnFields();

        System.out.println("Primary key name:"+ primaryKeyField.getName());
        System.out.println("Primary key type:"+ primaryKeyField.getType());

        for(ColumnField columnField:columnFields){
            System.out.println("Column name:"+columnField.getName());
            System.out.println("Column type:"+columnField.getType());
        }
    }

    //Bu bilgilerle devamında bir ORM uygulaması geliştirilebilir.
}
