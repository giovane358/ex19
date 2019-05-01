package br.com.etechoracio.boaviagem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editUsuario;
    private EditText editSenha;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.editUsuario = findViewById(R.id.editUsuario);
        this.editSenha =  findViewById(R.id.editSenha);
    }

    public void btnEntrar(View view){
        String usuario = editUsuario.getText().toString();
        String senha   = editSenha.getText().toString();

        if(usuario.equals("admin") && (senha.equals("admin")))
        {
                    Toast msg = Toast.makeText(this,"Login efetuado com sucesso.",Toast.LENGTH_SHORT);
                    msg.show();
        }
        else
        {
            Toast msg = Toast.makeText(this,"Login ou senha incorreta.",Toast.LENGTH_SHORT);
            msg.show();
        }

    }
}
