package work.iwacloud.exceptions;

/*
    Name: Tiago Henrique Iwamoto
    email: tiago.iwamoto@gmail.com
    MBA Business Intelligence | System Analyst
    https://www.linkedin.com/in/tiago-iwamoto/
    2020-02-29 22:58
*/

public class AnnotationColumnNotFound extends Exception {

    public AnnotationColumnNotFound() {
    }

    public AnnotationColumnNotFound(String s) {
        super(s);
    }

    public AnnotationColumnNotFound(String s, Throwable throwable) {
        super(s, throwable);
    }

    public AnnotationColumnNotFound(Throwable throwable) {
        super(throwable);
    }

    public AnnotationColumnNotFound(String s, Throwable throwable, boolean b, boolean b1) {
        super(s, throwable, b, b1);
    }
}
