package com.example.implicitintent_tel_geo_browser;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button tel=(Button)findViewById(R.id.button1);
        Button browser=(Button)findViewById(R.id.button2);
        Button map=(Button)findViewById(R.id.button3);
        map.setOnClickListener(onClickListener);
        tel.setOnClickListener(onClickListener);
        browser.setOnClickListener(onClickListener);

    }

    View.OnClickListener onClickListener=new View.OnClickListener(){

        @Override
        public void onClick(View view) {
            Intent intent = new Intent();
            Button button= (Button) view;
            switch (button.getId()){
                case R.id.button1:
                    intent.setAction(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:10086"));
                    startActivity(intent);
                    break;
                case R.id.button2:
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("http://www.baidu.com"));
                    startActivity(intent);
                    break;
                case R.id.button3:
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("geo:28,66.123456"));
                    startActivity(intent);
                    break;

            }

        }
    };
}


