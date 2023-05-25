import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface CricketPlayer {
    int age();
    String country() default "India";
}

@CricketPlayer(age = 33, country =  "India")
class Virat {
    private int runs;
    private int innings;

    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public int getInnings() {
        return innings;
    }

    public void setInnings(int innings) {
        this.innings = innings;
    }
}

public class AnnotationsClass1{

}
