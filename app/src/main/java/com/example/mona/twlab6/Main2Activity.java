package com.example.mona.twlab6;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class Main2Activity extends AppCompatActivity {
    private String coffeeType;
    private String addTocofee;

    private CheckBox cre;
    private CheckBox sug;
    private Button btnOrder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        cre=(CheckBox)findViewById(R.id.creamChkBox);
        sug=(CheckBox)findViewById(R.id.sugarChkBox);
        btnOrder=(Button) findViewById(R.id.btnOrder);



        btnOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addTocofee=" ";
                if (cre.isChecked())
                    addTocofee="...Cream added";
                if (sug.isChecked())
                    addTocofee="...Sugar added";

                Intent returnIntent =new Intent();
                returnIntent.putExtra("coff_Type" , coffeeType);
                returnIntent.putExtra("addTo_Coffee" , addTocofee);
                setResult(RESULT_OK,returnIntent);
                finish();

            }
        });
    }

    public void selectCoffee(View V){

        switch (V.getId()){
            case R.id.radioDecaf:
                coffeeType= "Decaf";
                break;

            case R.id.radioExpresso:
                coffeeType="Expressor";
                break;
            case R.id.radioColombian:
                coffeeType="Colombian";
                break;

        }
    }
}
