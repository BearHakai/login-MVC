package android.vinicius.loginmvc.datamodel;

import android.util.Log;

public class UsuarioDataModel {

    public static final String TABELA = "usuario";

    public static final String ID = "id";

    public static final String NOME = "nome";

    public static final String EMAIL = "email";

    public static final String SENHA = "senha";

    public static String querryCriarTabela = "";

    public static String criarTabela(){

        querryCriarTabela += "CREATE TABLE " + TABELA + " (";

        querryCriarTabela += ID + " int primary key autoincrement";

        querryCriarTabela += NOME + " text, ";

        querryCriarTabela += EMAIL + " text, ";

        querryCriarTabela += SENHA + " text";

        querryCriarTabela += ")";

        Log.i("tabela", "criarTabela: " + querryCriarTabela);
        return querryCriarTabela;
    }


}
