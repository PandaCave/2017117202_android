package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class helloworld1 extends AppCompatActivity {
    public static final String TAG="helloworld1";
    private static int objCount=0;
    private int mobjCount=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        mobjCount=objCount;
        objCount++;
        Log.d(TAG, "onCreate: "+mobjCount);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.helloworld1);
        Button button1=(Button)findViewById(R.id.button_1);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(helloworld1.this,helloworld2.class);
                startActivity(intent);
            }
        });

    }
    protected void onStart(){
        super.onStart();
        Log.d(TAG,"onStart"+mobjCount);
    }
    protected void onResume(){
        super.onResume();
        Log.d(TAG,"onResume"+mobjCount);
    }
    protected void onPause(){
        super.onPause();
        Log.d(TAG,"onPause"+mobjCount);
    }
    protected void onStop(){
        super.onStop();
        Log.d(TAG,"onStop"+mobjCount);
    }
    protected void onDestory(){
        super.onDestroy();
        Log.d(TAG,"onDestory"+mobjCount);
    }
    protected void onRestart(){
        super.onRestart();
        Log.d(TAG,"onRestart"+mobjCount);
    }
}
