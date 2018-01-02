package com.example.pankaj.appnumber3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txt1 = findViewById(R.id.txt1);
        TextView txt2 = findViewById(R.id.txt2);
        TextView txt3 = findViewById(R.id.txt3);
        TextView txt4 = findViewById(R.id.txt4);
        TextView txt5 = findViewById(R.id.txt5);

        /*
        String myStringValue = "Android Programming is Easy!";

        txt1.setText(myStringValue);

        txt2.setText(myStringValue.charAt(0) + "");

        txt3.setText(myStringValue.substring(2));

        txt4.setText(myStringValue.substring(5, 9));

        txt5.setText(myStringValue.indexOf("Programming") + "");

        */

        //Casting

    /*    byte smallIntValue = 25; // -128 ..127

        int intValue = (int) smallIntValue;

        float floatValue = 7.8f;

        int myIntegerNumber = (int) floatValue;

        txt1.setText(floatValue + "");
        txt2.setText(myIntegerNumber + "");
      */
        float myFirstFloatNumber = 3.9f;
        float mySecondFloatNumber = 15.8f;

        int result = (int)(myFirstFloatNumber * mySecondFloatNumber);

        txt1.setText(myFirstFloatNumber + "");
        txt2.setText(mySecondFloatNumber + "");
        txt3.setText(result + "");

        int myValue = (int)(2.7 * 5) ;
        txt4.setText(myValue + "");

        int firstIntValue = 10;

        int secondIntValue = 20;

        float floatResult = firstIntValue * secondIntValue ;

        txt5.setText(floatResult + "");
    }
}
