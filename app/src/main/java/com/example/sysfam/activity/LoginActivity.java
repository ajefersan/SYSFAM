package com.example.sysfam.activity;

import androidx.appcompat.app.AppCompatActivity;
import com.example.sysfam.R;
import com.example.sysfam.helper.Permissao;

import android.Manifest;
import android.os.Bundle;

public class LoginActivity extends AppCompatActivity {

    private String[] permissoesNecessarias = new String[]{
            Manifest.permission.INTERNET
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Permissao.validaPermissoes(1,this,permissoesNecessarias);

    }
}