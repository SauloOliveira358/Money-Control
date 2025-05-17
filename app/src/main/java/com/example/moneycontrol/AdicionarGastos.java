package com.example.moneycontrol;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
//biblioteca do firestone
import com.google.firebase.firestore.FirebaseFirestore;

public class AdicionarGastos extends AppCompatActivity {
    //Instanciando as variaveis da activit AdicionarGasto
private EditText valor_Gasto,data_Gasto;
private CheckBox lazer,stremin,alimentação,gasto_Fixo,excencial;
private Button salvar_Gasto,fechar_Gasto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adicionar_gastos);


    }

    FirebaseFirestore db = FirebaseFirestore.getInstance();
}