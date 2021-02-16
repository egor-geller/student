package com.example.opitulab1;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.text.DecimalFormat;

public class MainActivity extends Activity {
    private TextView resultTextView;
    private TextView signTextView;
    private TextView enterEditText;
    private String lastSign = "=";
    private Double lastValue = null;

    DecimalFormat format = new DecimalFormat("0.##########");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resultTextView = findViewById(R.id.resultTextView);
        enterEditText = findViewById(R.id.enterEditText);
        signTextView = findViewById(R.id.signTextView);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putString("OPERATION", lastSign);
        if (lastValue != null) {
            outState.putDouble("lastValue", lastValue);
        }
        if (enterEditText != null) {
            outState.putString("currentValue", enterEditText.getText().toString());
        }
        super.onSaveInstanceState(outState);
    }

    @SuppressLint("SetTextI18n")
    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        lastSign = savedInstanceState.getString("OPERATION");
        lastValue = savedInstanceState.getDouble("lastValue");
        String currentValue = savedInstanceState.getString("currentValue");
        resultTextView.setText(format.format(lastValue));
        enterEditText.setText(currentValue);
        signTextView.setText(lastSign);
    }

    public void onNumberClick(View view) {
        if (lastSign.equals("=") && lastValue != null) {
            lastValue = null;
        }
        enterEditText.append(((Button) view).getText());
    }

    public void onDelete(View view) {
        if (enterEditText.getText().toString().length() > 0) {
            String number = enterEditText.getText().toString();
            number = number.subSequence(0, number.length() - 1).toString();
            enterEditText.setText(number);
        }
    }

    public void onDeleteAll(View view) {
        enterEditText.setText("");
        signTextView.setText("");
        resultTextView.setText("");
        lastSign = "";
        lastValue = null;
    }

    public void onChangeSign(View view) {
        if (lastSign.equals("-")) {
            lastSign = "+";
            signTextView.setText(lastSign);
        } else if (lastSign.equals("+")) {
            lastSign = "-";
            signTextView.setText(lastSign);
        }
    }

    public void onSingClick(View view) {
        String sing = ((Button) view).getText().toString();
        String number = enterEditText.getText().toString();
        if (number.length() > 0) {
            try {
                execute(Double.valueOf(number.replace(',', '.')), sing);
            } catch (NumberFormatException ex) {
                enterEditText.setText("");
            }
        }
        lastSign = sing;
        signTextView.setText(sing);
    }

    @SuppressLint("SetTextI18n")
    private void execute(Double number, String sing) {

        if (lastValue == null) {
            lastValue = number;
        } else {
            if (lastSign.equals("=")) {
                lastSign = sing;
            }
            checkSing(number);
        }

        resultTextView.setText(format.format(lastValue));
        enterEditText.setText("");
    }

    private void checkSing(double number) {
        switch (lastSign) {
            case "=":
                lastValue = number;
                break;
            case "/":
                if (number == 0) {
                    lastValue = 0.0;
                } else {
                    lastValue /= number;
                }
                break;
            case "*":
                lastValue *= number;
                break;
            case "+":
                lastValue += number;
                break;
            case "-":
                lastValue -= number;
                break;
        }
    }
}
