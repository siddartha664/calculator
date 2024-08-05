package com.veltech.p3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button ac,del,div,mul,equal,plus,sub,dot,b0,b1,b2,b3,b4,b5,b6,b7,b8,b9;
    TextView tv1,tv2;

     public String num="";
     int first=0,last=0;

    int sign=-1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       ac= findViewById(R.id.Ac);
       del=findViewById(R.id.del);
       div=findViewById(R.id.div);
       mul=findViewById(R.id.mul);
       equal=findViewById(R.id.equal);
       plus=findViewById(R.id.plus);
       sub=findViewById(R.id.minus);
       dot=findViewById(R.id.dot);
        b0=findViewById(R.id.b0);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        b5=findViewById(R.id.b5);
        b6=findViewById(R.id.b6);
        b7=findViewById(R.id.b7);
        b8=findViewById(R.id.b8);
        b9=findViewById(R.id.b9);
        tv1=findViewById(R.id.t1);
        tv2=findViewById(R.id.t2);

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aa("0");
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aa("1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aa("2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aa("3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aa("4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aa("5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aa("6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aa("7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aa("8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aa("9");
            }
        });
        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int temp = Integer.parseInt(num);
                temp/=10;
                num="";
                num=temp+"";
                tv2.setText(num);
            }
        });
        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv2.setText("");
                num="";
                first=0;
                last=0;
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first=Integer.parseInt(num);
                last+=first;
                first=0;
                num="";
                tv2.setText(num);

            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                last+=first;
                tv2.setText(last+"");
            }
        });

    }

    public   void aa(String s ){

            num=num+s;
        tv2.setText(num);
    }
}