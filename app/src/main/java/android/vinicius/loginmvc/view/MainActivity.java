package android.vinicius.loginmvc.view;

import android.os.Bundle;
import android.view.View;
import android.vinicius.loginmvc.R;
import android.vinicius.loginmvc.controller.UsuarioController;
import android.vinicius.loginmvc.datamodel.UsuarioDataModel;
import android.vinicius.loginmvc.model.Usuario;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText email, senha;

    Button entrar, cadastrar;
    Usuario usuario;
    UsuarioController controller;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        initComponents();

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        entrar.setOnClickListener(view ->  {
                if (validaCampos()) {
                    usuario = new Usuario();

                    String user = usuario.getEmail().toString();
                    String pass = usuario.getSenha().toString();

                    usuario.setEmail(user);
                    usuario.setSenha(pass);

                    controller = new UsuarioController(this);
                    boolean isCheckUser = controller.checkUser(user);
                    boolean isCheckPass = controller.checkUserPassword(user, pass);

                    if(isCheckUser && isCheckPass) {
                        // PowerPoint Slide 92, precisa corrigir o resto para ver o erro.
                        Toast.makeText(this, "Login Realizado com Sucesso");
                    }
                }
        });
    }
    private boolean validaCampos() {
        boolean retorno = false;
        if(email.getText().toString().isEmpty() ||
        senha.getText().toString().isEmpty()) {
            retorno = false;
        }
        else {
            retorno = true;
        }

        return retorno;
    }

    private void initComponents() {
        email = findViewById(R.id.edt_email);
        senha = findViewById(R.id.edt_senha);
        entrar = findViewById(R.id.btn_entrar);
        cadastrar = findViewById(R.id.btn_cadastrar);
    }
}