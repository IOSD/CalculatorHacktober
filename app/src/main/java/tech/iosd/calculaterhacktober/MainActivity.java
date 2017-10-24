package tech.iosd.calculaterhacktober;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    TextView tvInputOne, tvInputTwo, tvResult;
    Button btnAdd, btnSubtract, btnMultiply, btnDivide, btnEquals;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvInputOne = (TextView) findViewById(R.id.tvInputOne);
        tvInputTwo = (TextView) findViewById(R.id.tvInputTwo);
        tvResult = (TextView) findViewById(R.id.tvResult);

        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnSubtract = (Button) findViewById(R.id.btnSubtract);
        btnMultiply = (Button) findViewById(R.id.btnMultiply);
        btnDivide = (Button) findViewById(R.id.btnDivide);
        btnEquals = (Button) findViewById(R.id.btnEquals);


        final String[] selected = new String[1];

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                btnAdd.setBackgroundResource(R.color.selectedOperation);
                selected[0] = "Add";

                if (tvResult.getText().toString().length() > 0) {
                    Double result = Double.parseDouble(tvResult.getText().toString());
                    tvInputOne.setText(result.toString());
                    tvInputTwo.setText("");
                    tvResult.setText("");
                }
            }
        });
        btnSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                btnSubtract.setBackgroundResource(R.color.selectedOperation);
                selected[0] = "Subtract";

                if (tvResult.getText().toString().length() > 0) {
                    Double result = Double.parseDouble(tvResult.getText().toString());
                    tvInputOne.setText(result.toString());
                    tvInputTwo.setText("");
                    tvResult.setText("");
                }
            }
        });
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                btnMultiply.setBackgroundResource(R.color.selectedOperation);
                selected[0] = "Multiply";

                if (tvResult.getText().toString().length() > 0) {
                    Double result = Double.parseDouble(tvResult.getText().toString());
                    tvInputOne.setText(result.toString());
                    tvInputTwo.setText("");
                    tvResult.setText("");
                }
            }
        });
        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                btnDivide.setBackgroundResource(R.color.selectedOperation);
                selected[0] = "Divide";

                if (tvResult.getText().toString().length() > 0) {
                    Double result = Double.parseDouble(tvResult.getText().toString());
                    tvInputOne.setText(result.toString());
                    tvInputTwo.setText("");
                    tvResult.setText("");
                }
            }
        });
        btnEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double inputOne = Double.parseDouble(tvInputOne.getText().toString());
                Double inputTwo = Double.parseDouble(tvInputTwo.getText().toString());

                Double result = null;
                if(selected[0] == "Add") {
                    result = inputOne + inputTwo;
                    btnAdd.setBackgroundResource(android.R.drawable.btn_default);
                    tvResult.setText(result.toString());
                }
                else if(selected[0] == "Subtract") {
                    result = inputOne - inputTwo;
                    btnSubtract.setBackgroundResource(android.R.drawable.btn_default);
                    tvResult.setText(result.toString());
                }
                else if(selected[0] == "Multiply") {
                    result = inputOne * inputTwo;
                    btnMultiply.setBackgroundResource(android.R.drawable.btn_default);
                    tvResult.setText(result.toString());
                }
                else if(selected[0] == "Divide") {
                    btnDivide.setBackgroundResource(android.R.drawable.btn_default);
                    if (inputTwo == 0)
                        tvResult.setText("Cannot divide by 0");
                    else {
                        result = inputOne / inputTwo;
                        tvResult.setText(result.toString());
                    }
                }

            }
        });


    }
}