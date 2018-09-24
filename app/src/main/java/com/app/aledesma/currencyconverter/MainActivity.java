package com.app.aledesma.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public void doTheThings(View view){
        EditText USDEditText = (EditText) findViewById(R.id.USDEditText);
        TextView ResultTextView = (TextView) findViewById(R.id.ResultTextView);

        Double cur = Double.parseDouble(USDEditText.getText().toString());

        Double USD = Double.parseDouble(USDEditText.getText().toString());
        Double CAD = cur * .77;
        Double AUD = cur * 1.38;
        Double GBP = cur * 0.7624;

        String result = String.format("Converted! $%1$,.2f USD has been converted to $%2$,.2f CAD $%3$,.2f AUD and £%4$,.2f GBP!", USD, CAD, AUD, GBP);
        ResultTextView.setText(result);
        ResultTextView.setVisibility(View.VISIBLE);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
