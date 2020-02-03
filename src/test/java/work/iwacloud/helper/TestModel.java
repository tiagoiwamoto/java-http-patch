package work.iwacloud.helper;

/*
    Name: Tiago Henrique Iwamoto
    email: tiago.iwamoto@gmail.com
    MBA Business Intelligence | System Analyst
    https://www.linkedin.com/in/tiago-iwamoto/
    02/02/2020 - 15:35
*/

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.Date;

public class TestModel {

    @Id
    @Column(name = "TB_ID")
    private Integer id;

    @Column(name = "STR_NAME")
    private String name;

    @Column(name = "CREATED_AT")
    private Date createdAt;

    private String semColuna;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getSemColuna() {
        return semColuna;
    }

    public void setSemColuna(String semColuna) {
        this.semColuna = semColuna;
    }
}
