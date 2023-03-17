package com.barbarita.calculadorita;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textViewResultado;
    float numero1 = 0.0f;
    float numero2 = 0.0f;
    String operador = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewResultado = findViewById(R.id.textViewResultado);
    }

    public void EscribirCero(View view) {
        if(textViewResultado.getText().toString().equals("0")){
            textViewResultado.setText("0");
        }else{
            textViewResultado.setText(textViewResultado.getText() + "0");
        }
    }

    public void escribirUno(View view) {
        if(textViewResultado.getText().toString().equals("0")){
            textViewResultado.setText("1");
        }else{
            textViewResultado.setText(textViewResultado.getText() + "1");
        }
    }

    public void escribirDos(View view) {
        if(textViewResultado.getText().toString().equals("0")){
            textViewResultado.setText("2");
        }else{
            textViewResultado.setText(textViewResultado.getText() + "2");
        }
    }

    public void escribirTres(View view) {
        if(textViewResultado.getText().toString().equals("0")){
            textViewResultado.setText("3");
        }else{
            textViewResultado.setText(textViewResultado.getText() + "3");
        }
    }

    public void escribirCuatro(View view) {
        if(textViewResultado.getText().toString().equals("0")){
            textViewResultado.setText("4");
        }else{
            textViewResultado.setText(textViewResultado.getText() + "4");
        }
    }

    public void escribirCinco(View view) {
        if(textViewResultado.getText().toString().equals("0")){
            textViewResultado.setText("5");
        }else{
            textViewResultado.setText(textViewResultado.getText() + "5");
        }
    }

    public void escribirSeis(View view) {
        if(textViewResultado.getText().toString().equals("0")){
            textViewResultado.setText("6");
        }else{
            textViewResultado.setText(textViewResultado.getText() + "6");
        }
    }

    public void escribirSiete(View view) {
        if(textViewResultado.getText().toString().equals("0")){
            textViewResultado.setText("7");
        }else{
            textViewResultado.setText(textViewResultado.getText() + "7");
        }
    }

    public void escribirOcho(View view) {
        if(textViewResultado.getText().toString().equals("0")){
            textViewResultado.setText("8");
        }else{
            textViewResultado.setText(textViewResultado.getText() + "8");
        }
    }

    public void escribirNueve(View view) {
        if(textViewResultado.getText().toString().equals("0")){
            textViewResultado.setText("9");
        }else{
            textViewResultado.setText(textViewResultado.getText() + "9");
        }
    }

    public void dividir(View view) {
        operador = "/";
    }

    public void multiplicar(View view) {
        operador = "*";
    }

    public void restar(View view) {
        operador = "-";
    }

    public void sumar(View view) {
        operador = "+";
        guardarNum1(view);
    }

    public void limpiar(View view) {
        textViewResultado.setText("0");
        numero1 = 0.0f;
        numero2 = 0.0f;
        operador = "";
    }

    public void borrar(View view) {
        String text = textViewResultado.getText().toString();
        textViewResultado.setText(text.substring(0, text.length() -1));
    }

    public void guardarNum1(View view){
        numero1 = Float.parseFloat(textViewResultado.getText().toString());

    }

    public void igual(View view) {

    }
}