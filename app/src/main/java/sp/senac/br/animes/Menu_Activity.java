package sp.senac.br.animes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Menu_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_layout);
    }

    public void abrirPersonagem(View view) {
        Intent intent = new Intent(Menu_Activity.this, Geass_Activity.class);
        startActivity(intent);
    }
}
