package com.example.shiv.billit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView txt;
EditText edt;
Button btn;
String qu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt=findViewById(R.id.op);
        edt=findViewById(R.id.input);
        btn=findViewById(R.id.click);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                qu=edt.getText().toString();
                 int quant;
                     quant = Integer.parseInt(qu);
                    quant = quant * 10;
                    txt.setText(quant + "");



                }

        });
    }
}
