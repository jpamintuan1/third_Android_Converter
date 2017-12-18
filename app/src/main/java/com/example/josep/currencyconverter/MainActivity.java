package com.example.josep.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public void convert(View view)  {

        EditText dollarConvert = (EditText) findViewById(R.id.dollarConvert);

        Double dollarAmountDouble = Double.parseDouble(dollarConvert.getText().toString());

        Double poundAmount = dollarAmountDouble / 50;

        Toast.makeText(MainActivity.this, "E" + String.format("%.2f", poundAmount), Toast.LENGTH_LONG).show();

        Log.i("amount", dollarConvert.getText().toString());



    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
