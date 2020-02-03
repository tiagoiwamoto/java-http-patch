package work.iwacloud.helper;

import org.junit.Assert;
import org.junit.Test;
import work.iwacloud.enums.SysMessages;
import work.iwacloud.exceptions.AnnotationColumnNotFoundException;
import work.iwacloud.springdatahelper.objects.DataTransfer;
import work.iwacloud.springdatahelper.objects.DbColumn;

import java.util.Arrays;
import java.util.Date;
import java.util.LinkedList;


/*
    Name: Tiago Henrique Iwamoto
    email: tiago.iwamoto@gmail.com
    MBA Business Intelligence | System Analyst
    https://www.linkedin.com/in/tiago-iwamoto/
    02/02/2020 - 15:34
*/
public class AnnotationReaderTest {

    @Test
    public void getAnnotationColumnName() throws Exception {

        TestModel m = new TestModel();
        m.setId(1);
        m.setName("Nome completo");
        m.setCreatedAt(new Date());
        DataTransfer<Integer, LinkedList<DbColumn>> result = new PartialUpdateHelper<TestModel>().getObjectToUpdate(m);
        Assert.assertEquals(3, result.getAny().size());

        m = new TestModel();
        m.setId(1);
        m.setName("Nome completo");
        result = new PartialUpdateHelper<TestModel>().getObjectToUpdate(m);
        Assert.assertEquals(2, result.getAny().size());

        m = new TestModel();
        m.setName("Nome completo");
        result = new PartialUpdateHelper<TestModel>().getObjectToUpdate(m);
        Assert.assertEquals(1, result.getAny().size());

    }

    @Test(expected = Exception.class)
    public void getAnnotationColumnNameException() throws Exception {
        TestModel m = new TestModel();
        m.setId(1);
        m.setName("Nome completo");
        m.setCreatedAt(new Date());
        DataTransfer<Integer, LinkedList<DbColumn>> result = new PartialUpdateHelper<TestModel>().getObjectToUpdate(null);
    }

    @Test(expected = AnnotationColumnNotFoundException.class)
    public void getAnnotationWithoutColumnNameException() throws AnnotationColumnNotFoundException {
        throw new AnnotationColumnNotFoundException("Message");
    }

    @Test
    public void getSysMessages(){
        SysMessages[] messages = SysMessages.values();
        Arrays.stream(messages).forEach(message -> {
            Assert.assertNotNull(message);
        });
    }
}