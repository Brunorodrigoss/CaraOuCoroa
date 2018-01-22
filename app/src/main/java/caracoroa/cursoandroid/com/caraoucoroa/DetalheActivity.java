package caracoroa.cursoandroid.com.caraoucoroa;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class DetalheActivity extends AppCompatActivity {
    private ImageView imagem;
    private ImageView botaoVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe);

        imagem =findViewById(R.id.moedaId);

        Bundle extra = getIntent().getExtras();

        if (extra != null){
            String opcaoEscolhida = extra.getString("opcao");

            Toast.makeText(this, "Valor retornado: "+opcaoEscolhida, Toast.LENGTH_SHORT).show();

            if (opcaoEscolhida.equals("cara")){
                imagem.setImageDrawable(ContextCompat
                        .getDrawable(DetalheActivity.this,
                                R.drawable.moeda_cara));
            } else {
                imagem.setImageDrawable((ContextCompat
                        .getDrawable(DetalheActivity.this,
                                R.drawable.moeda_coroa)));
            }
        }




        imagem = (ImageView) findViewById(R.id.moedaId);
        botaoVoltar = (ImageView) findViewById(R.id.botaoVoltarId);

        botaoVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent(DetalheActivity.this, MainActivity.class) );
            }
        });


    }
}
