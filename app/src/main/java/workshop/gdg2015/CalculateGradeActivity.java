package workshop.gdg2015;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class CalculateGradeActivity extends Activity {


    private EditText score;
    private TextView gradeResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate_grade);
        initElements();
    }

    private void initElements() {
        score = (EditText) this.findViewById(R.id.score);
        gradeResult = (TextView) this.findViewById(R.id.grade_result);
    }

    private int getScoreFromView() {
        String score = this.score.getText().toString();
        return Integer.parseInt(score);
    }


    public void convert(View view) {
        gradeResult.setText("Your grade is "+ new Calculate().convertToGrade(getScoreFromView()));
    }
}
