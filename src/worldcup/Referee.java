package worldcup;

/**
 *  Class to define Referee
 */
public class Referee extends Person {

    /** bout the referee's whistle */
    String whisper;
    double tolerance;

    /**
     *  Puts the referee in ruling mode
     */
    public void rule(){
        System.out.println("ruling");
    }

  
}
