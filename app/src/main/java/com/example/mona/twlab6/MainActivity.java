package com.example.mona.twlab6;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }
public void moveTofrstAct(View V){
        Intent i =new Intent(getApplicationContext(),Main2Activity.class);
        startActivityForResult(i, 1); // 1: an arbitrary value  
    }
 public void moveToSecAct(View V) {
        Intent i = new Intent(getApplicationContext(), Main3Activity.class);
        startActivityForResult(i, 2);
    }

protected void onActivityResult (int requestCode ,int resultCod,Intent data){
        if(resultCod==RESULT_OK && requestCode==1){
            String order="Order is:" + data.getStringExtra("coff_Type")+data.getStringExtra("addTo_Coffee");
            Toast.makeText(getApplicationContext(),
                        order,
                           Toast.LENGTH_LONG).show();
        }
        else if(resultCod==RESULT_OK && requestCode==2){
               String result ="Result is:" + data.getStringExtra("Result_Suubmit");
               Toast.makeText(getApplicationContext(),result,Toast.LENGTH_LONG).show();
        }
}
}
