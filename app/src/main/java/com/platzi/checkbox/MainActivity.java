package com.platzi.checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText et1,et2;
    private CheckBox check1,check2;
    private TextView tv1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=(EditText)findViewById(R.id.txt_valor1);
        et2=(EditText)findViewById(R.id.txt_valor2);
        check1=(CheckBox)findViewById(R.id.check_suma);
        check2=(CheckBox)findViewById(R.id.check_resta);
        tv1=(TextView)findViewById(R.id.tv_respuesta);

    }

    public void Calcular(View view){
        String valor1=et1.getText().toString();
        String valor2=et2.getText().toString();

        int val1=Integer.parseInt(valor1);
        int val2=Integer.parseInt(valor2);

        String resultado="";
        if(check1.isChecked()==true){
            int suma=val1+val2;
            resultado="la suma es "+suma+" / ";
            if(check2.isChecked()==true){
                int resta=val1+val2;
                resultado=resultado+"la resta es "+resta;
            }
            tv1.setText(resultado);

        }


    }

}
