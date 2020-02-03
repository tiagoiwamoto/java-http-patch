package work.iwacloud.helper;

import org.hibernate.AnnotationException;

import javax.persistence.Column;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class AnnotationReader {

    /**
     * This method get the field from class
     * and find the annotation @Column
     * @param field
     * @exception AnnotationException when annotation is missing
     * @return
     */
    public String getAnnotationColumnName(Field field){
        Annotation[] annotations = field.getDeclaredAnnotations();
        String columnAnnotation = "";

        for(Annotation annotation : annotations){
            if(annotation.annotationType() == Column.class){
                Column column = (Column) annotation;
                columnAnnotation = column.name();
                return columnAnnotation;
            }
        }

        return columnAnnotation;
    }

}
