package com.example.sysfam;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.ktx.Firebase;

public class MainActivity extends AppCompatActivity {

    private DatabaseReference referencia = FirebaseDatabase.getInstance().getReference();
    private FirebaseAuth usuario = FirebaseAuth.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*Deslogar usuario*/
        usuario.signOut();

        /*Logar usuario
        usuario.signInWithEmailAndPassword(
                "glaubersds@outlook.com","SIforever")
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            Log.i("signIn","Sucesso ao logar");
                        }else {
                            Log.i("signIn","Erro ao logar");
                        }
                    }
                });*/

        /*Verifica usuario logado*/
        if(usuario.getCurrentUser() != null){
            Log.i("CurrentUser","Usuario logado!");
        }else {
            Log.i("CurrentUser", "Usuario deslogado!");
        }

        /*Cadastro do usuario
        usuario.createUserWithEmailAndPassword(
                "glaubersds@outlook.com","SIforever")
                .addOnCompleteListener(MainActivity.this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){

                            Log.i("CreatUser","Sucesso ao cadastrar usuario");
                        }else {
                            Log.i("CreatUser","Erro ao cadastrar usuario");

                        }
                    }
                });*/

         /*
        DatabaseReference usuarios = referencia.child("usuarios").child("001");
        DatabaseReference produtos = referencia.child("produtos");

        usuarios.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {

                Log.i("FIREBASE",snapshot.getValue().toString());

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        Usuario usuario = new Usuario();
        usuario.setNome("Laile");
        usuario.setSobrenome("Catureba");
        usuario.setIdade(28);

        usuarios.child("002").setValue(usuario);

        Produto produto = new Produto();
        produto.setNome("Amoxilina");
        produto.setDescricao("remédio contra inflamação na garganta");
        produto.setValor(24.50);

        produtos.child("001").setValue(produto);

         */

    }
}