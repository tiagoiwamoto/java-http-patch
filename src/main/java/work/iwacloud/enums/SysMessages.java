package work.iwacloud.enums;

/*
    Name: Tiago Henrique Iwamoto
    email: tiago.iwamoto@gmail.com
    MBA Business Intelligence | System Analyst
    https://www.linkedin.com/in/tiago-iwamoto/
    29/01/2020 - 22:59
*/
public enum SysMessages {

    ANNOTATION_NOTFOUND("Annotation COLUMN not found in your class attribute.");


    private String message;

    SysMessages(String message) {
        this.message = message;
    }

    public String value() {
        return message;
    }
}
