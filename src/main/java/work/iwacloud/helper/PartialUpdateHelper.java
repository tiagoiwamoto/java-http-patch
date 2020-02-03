package work.iwacloud.helper;

import org.hibernate.AnnotationException;
import work.iwacloud.springdatahelper.enums.StatusMessages;
import work.iwacloud.springdatahelper.objects.DataTransfer;
import work.iwacloud.springdatahelper.objects.DbColumn;

import java.lang.reflect.Field;
import java.util.LinkedList;

/*
    Name: Tiago Henrique Iwamoto
    email: tiago.iwamoto@gmail.com
    MBA Business Intelligence | System Analyst
    https://www.linkedin.com/in/tiago-iwamoto/
    29/01/2020 - 23:07
*/
public class PartialUpdateHelper<T> {

    /**
     * This method will get the value of annotation COLUMN
     * to execute a partial update
     * @param obj
     * @exception Exception if something wrong
     * @return
     */
    public DataTransfer<Integer, LinkedList<DbColumn>> getObjectToUpdate(T obj) throws Exception {
        LinkedList<DbColumn> querys = new LinkedList<>();
        Class addressClass = obj.getClass();
        Field[] valueObjFields = addressClass.getDeclaredFields();
        if(obj == null){
            throw new Exception("Object is empty");
        }
        for (int line = 0; line < valueObjFields.length; line++) {

            valueObjFields[line].setAccessible(true);

            try {
                Field field = valueObjFields[line];

                String columnAnnotation = new AnnotationReader().getAnnotationColumnName(field);

                Object value = valueObjFields[line].get(obj);

                /* Add only attributes not null */
                if(value != null){
                    querys.add(new DbColumn(columnAnnotation, value));
                }
            }catch (AnnotationException e){
                throw new AnnotationException(e.getMessage());
            }catch (Exception e){
                throw new Exception(e.getMessage());
            }


        }
        return new DataTransfer<>(5, StatusMessages.EXECUTED.value(), querys);
    }

}
