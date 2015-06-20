package workshop.gdg2015;


import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.clearText;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class GradeConvertorEspressoTest {

    @Rule
    public ActivityTestRule<CalculateGradeActivity> calculateGradeActivityRule
            = new ActivityTestRule<>(CalculateGradeActivity.class);

    @Test
    public void gradeA() {
        onView(withId(R.id.score)).perform(clearText());
        onView(withId(R.id.score)).perform(typeText("80"));
        onView(withId(R.id.calculate_button)).perform(click());
        onView(withId(R.id.grade_result)).check(matches(withText("Your grade is A")));
    }

    @Test
    public void gradeB() {
        onView(withId(R.id.score)).perform(clearText());
        onView(withId(R.id.score)).perform(typeText("70"));
        onView(withId(R.id.calculate_button)).perform(click());
        onView(withId(R.id.grade_result)).check(matches(withText("Your grade is B")));
    }

    @Test
    public void gradeC() {
        onView(withId(R.id.score)).perform(clearText());
        onView(withId(R.id.score)).perform(typeText("60"));
        onView(withId(R.id.calculate_button)).perform(click());
        onView(withId(R.id.grade_result)).check(matches(withText("Your grade is C")));
    }


}
