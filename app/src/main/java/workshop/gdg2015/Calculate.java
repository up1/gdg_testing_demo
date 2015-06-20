package workshop.gdg2015;

public class Calculate {

    public String convertToGrade(int score) {
        if( score >= 80 )
            return "A";
        if(score >= 70)
            return "B";
        return "C";

    }

}
