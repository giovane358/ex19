package br.com.etechoracio.viagem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editLogin;
    private EditText editSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.editLogin = findViewById(R.id.editLogin);
        this.editSenha = findViewById(R.id.editSenha);
    }

    public void onEntrar(View view) {
        String texto = this.editLogin.getText().toString();
        String senha = this.editSenha.getText().toString();


        if (texto.equals("admin") && senha.equals("admin")) {
            Toast obj2 = Toast.makeText(this, "Login e senha corretos", Toast.LENGTH_SHORT);
            obj2.show();

            Intent menu1 = new Intent(this, MenuActivity.class);
            startActivity(menu1);


        } else {
            Toast obj = Toast.makeText(this, "Login e senha incorretos", Toast.LENGTH_SHORT);
            obj.show();
        }
    }

}
