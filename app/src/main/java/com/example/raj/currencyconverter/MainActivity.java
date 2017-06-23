package com.example.raj.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    EditText et1;
    TextView tv;
    Spinner spn;
    Button b1;
    String[] names={"A","B","C","D","E","F","G","H","I"};
    int pos=0;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=(EditText)findViewById(R.id.et1);
        tv=(TextView)findViewById(R.id.tv);
        b1=(Button) findViewById(R.id.b1);
        spn=(Spinner)findViewById(R.id.spn);
        ArrayAdapter aa=new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,names);
        spn.setAdapter(aa);
        spn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                pos=i;
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String s=et1.getText().toString().trim();
                long Val=Long.parseLong(s);
                if (pos==0)
                {
                    Val=Val*5;
                    tv.setText(""+Val);
                }
                else if (pos==1)
                {
                    Val=Val*10;
                    tv.setText(""+Val);
                }
                else if (pos==2)
                {
                    Val=Val*15;
                    tv.setText(""+Val);
                }
                else if (pos==3)
                {
                    Val=Val*20;
                    tv.setText(""+Val);
                }
                else if (pos==4)
                {
                    Val=Val*25;
                    tv.setText(""+Val);
                }
                else if (pos==5)
                {
                    Val=Val*30;
                    tv.setText(""+Val);;
                }
                else if (pos==6)
                {
                    Val=Val*35;
                    tv.setText(""+Val);
                }
                else if (pos==7)
                {
                    Val=Val*40;
                    tv.setText(""+Val);
                }
                else if (pos==8)
                {
                    Val=Val*45;
                    tv.setText(""+Val);
                }
            }
        });


    }
}
