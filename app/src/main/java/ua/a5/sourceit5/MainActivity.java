package ua.a5.sourceit5;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etMathematicalProblem;

    Button btnCalculate;

    TextView tvResult;

    String strMathProb;
    double doubleResult;
    String strDesult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etMathematicalProblem = (EditText) findViewById(R.id.et_mathematical_problem);

        btnCalculate = (Button) findViewById(R.id.btn_plus);

        tvResult = (TextView) findViewById(R.id.tv_result);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                strMathProb = etMathematicalProblem.getText().toString();
                if (strMathProb.contains("+")) {
                    String[] array = strMathProb.split("\\+");
                    for (int i = 0; i < array.length; i++) {
                        System.out.println(array[i]);
                    }
                    doubleResult = Double.parseDouble(array[0]) + Double.parseDouble(array[1]);
                    tvResult.setText(array[0] + " + " + array[1] + " = " + doubleResult);
                }

                if (strMathProb.contains("-")) {
                    String[] array = strMathProb.split("-");
                    for (int i = 0; i < array.length; i++) {
                        System.out.println(array[i]);
                    }
                    doubleResult = Double.parseDouble(array[0]) - Double.parseDouble(array[1]);
                    tvResult.setText(array[0] + " - " + array[1] + " = " + doubleResult);
                }

                if (strMathProb.contains("*")) {
                    String[] array = strMathProb.split("\\*");
                    for (int i = 0; i < array.length; i++) {
                        System.out.println(array[i]);
                    }
                    doubleResult = Double.parseDouble(array[0]) * Double.parseDouble(array[1]);
                    tvResult.setText(array[0] + " * " + array[1] + " = " + doubleResult);
                }

                if (strMathProb.contains("/")) {
                    String[] array = strMathProb.split("/");
                    for (int i = 0; i < array.length; i++) {
                        System.out.println(array[i]);
                    }
                    if (Double.parseDouble(array[1]) == 0) {
                        tvResult.setText("Division by zero!");
                    } else {
                        doubleResult = Double.parseDouble(array[0]) / Double.parseDouble(array[1]);
                        tvResult.setText(array[0] + " / " + array[1] + " = " + doubleResult);
                    }
                }

            }
        });
    }
}
