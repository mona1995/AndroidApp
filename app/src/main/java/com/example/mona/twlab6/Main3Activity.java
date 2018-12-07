package com.example.mona.twlab6;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity {
    private Button butsub;
   private String serType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        butsub = (Button) findViewById(R.id.butsub);

        butsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent returnIntent = new Intent();
                returnIntent.putExtra("Result_Suubmit", serType);
                setResult(RESULT_OK, returnIntent);
                finish();
            }
        });
    }
      public void selectSer(View V){
          switch (V.getId()) {
              case R.id.radioExcellent:
                  serType = "Excellent";
                  break;
              case R.id.radioAvg:
                  serType = "avg";
                  break;
              case R.id.radioGood:
                  serType = "good";
                  break;
              case R.id.radiopoor:
                  serType = "poor";
                  break;

          }}}


