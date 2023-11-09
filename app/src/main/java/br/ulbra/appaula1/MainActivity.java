package br.ulbra.appaula1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edtv1, edtv2;

    Button btnSomar;

    Button btnSubtrair;

    Button btnMultiplicar;

    Button btnDividir;

    TextView txtResultado;
double v1, v2, soma, subtração, multiplicação, divisão;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtv1 = (EditText) findViewById(R.id.txt1);
        edtv2 = (EditText) findViewById(R.id.txt2);
        btnSomar = (Button)  findViewById(R.id.btnSomar);
        btnSubtrair = (Button) findViewById(R.id.btnSubtrair);
        btnMultiplicar = (Button) findViewById(R.id.btnMultiplicar);
        btnDividir = (Button) findViewById(R.id.btnDividir);
        txtResultado = (TextView) findViewById(R.id.textView6);
        btnSomar.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1 =  Double.parseDouble(edtv1.getText().toString());
                v2 =  Double.parseDouble(edtv2.getText().toString());
                soma = v1 + v2;
                txtResultado.setText("Resultado: "+soma);
            }
        });
        btnSubtrair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1 =  Double.parseDouble(edtv1.getText().toString());
                v2 =  Double.parseDouble(edtv2.getText().toString());
                subtração= v1 - v2;
                txtResultado.setText("Resultado: "+subtração);
            }
        });
        btnMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1 =  Double.parseDouble(edtv1.getText().toString());
                v2 =  Double.parseDouble(edtv2.getText().toString());
                multiplicação= v1 * v2;
                txtResultado.setText("Resultado: "+multiplicação);
            }
        });
        btnDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1 =  Double.parseDouble(edtv1.getText().toString());
                v2 =  Double.parseDouble(edtv2.getText().toString());
                divisão= v1 / v2;
                txtResultado.setText("Resultado: "+divisão);
            }
        });
        }
    }


