package workshop.gdg2015;


import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.clearText;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(Parameterized.class)
public class WorkingWithParameterized {

    private final String score;
    private final String expectedGrade;
    @Rule
    public ActivityTestRule<CalculateGradeActivity> calculateGradeActivityRule
            = new ActivityTestRule<>(CalculateGradeActivity.class);

    @Parameters
    public static Iterable<Object[]> setupData() {
        return Arrays.asList(new Object[][]{
                {"80", "A"},
                {"70", "B"},
        });
    }

    public WorkingWithParameterized(String score, String expectedGrade) {
        this.score = score;
        this.expectedGrade = expectedGrade;
    }


}



