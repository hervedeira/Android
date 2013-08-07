package br.com.entelgy.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AtividadePrincipal extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atividade_principal);
        
        final Button btnVai = (Button) findViewById(R.id.btnVai);
        btnVai.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
               TextView tvMensagem = (TextView)findViewById(R.id.txtMensagem);
               tvMensagem.setText("Joilson truta zica");
                
            }
        });
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.atividade_principal, menu);
        return true;
    }
    
}
