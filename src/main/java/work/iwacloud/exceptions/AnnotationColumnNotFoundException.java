package work.iwacloud.exceptions;

/*
    Name: Tiago Henrique Iwamoto
    email: tiago.iwamoto@gmail.com
    MBA Business Intelligence | System Analyst
    https://www.linkedin.com/in/tiago-iwamoto/
    2020-02-29 22:58
*/

public class AnnotationColumnNotFoundException extends Exception {

    public AnnotationColumnNotFoundException() {
    }

    public AnnotationColumnNotFoundException(String s) {
        super(s);
    }

    public AnnotationColumnNotFoundException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public AnnotationColumnNotFoundException(Throwable throwable) {
        super(throwable);
    }

    public AnnotationColumnNotFoundException(String s, Throwable throwable, boolean b, boolean b1) {
        super(s, throwable, b, b1);
    }
}
