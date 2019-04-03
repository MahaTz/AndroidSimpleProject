package com.example.poisitionbutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.AbsoluteLayout;
import android.widget.Button;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button btn1 ,btn2 , btn3 ,btn4 ,btn5 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
    }

    public void OnclickRandom (View v ){

        Random random = new Random();
        int Id[]={R.id.btn1,R.id.btn2,R.id.btn3,R.id.btn4,R.id.btn5};
        for (int i = 0; i <5 ; i++) {

            Button btnchange = findViewById(Id[i]);
            Toast.makeText(getApplicationContext(),""+String.valueOf(Id[i]),Toast.LENGTH_LONG).show();


        AbsoluteLayout.LayoutParams params =(AbsoluteLayout.LayoutParams)btnchange.getLayoutParams();
        DisplayMetrics displayMetrics =new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int width = displayMetrics.widthPixels;
        int height  =displayMetrics.heightPixels;
        params.x = random.nextInt(width);
        params.y = random.nextInt(height);
        btnchange.setLayoutParams(params);
    }

//        Toast.makeText(getApplicationContext(),"Click",Toast.LENGTH_LONG).show();
//        Button btn = new Button(getApplicationContext());
//        btn.setX(btn1.getX());
//        btn.setY(btn1.getY());
//
//        btn1.setX(btn2.getX());
//        btn1.setY(btn2.getY());
//
//        btn2.setX(btn.getX());
//        btn2.setY(btn.getY());
//
//        Button btn22 = new Button(getApplicationContext());
//        btn22.setX(btn4.getX());
//        btn22.setY(btn4.getY());
//
//        btn4.setX(btn5.getX());
//        btn4.setY(btn5.getY());
//
//        btn5.setX(btn22.getX());
//        btn5.setY(btn22.getY());

//        Button btn1 = new Button(getApplicationContext());
//        btn1.setX(btn3.getX());
//        btn1.setY(btn3.getY());
//        btn3.setX(btn4.getX());
//        btn3.setY(btn4.getY());


//        btn4.setX(btn1.getX());
//        btn4.setY(btn1.getY());






    }
}
