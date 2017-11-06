package matheuspimentel.androidstudio.com.gasolinaoualcool;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText precoAlcool;
    private EditText precoGasolina;
    private Button verificar;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        precoAlcool = findViewById(R.id.precoAlcool);
        precoGasolina = findViewById(R.id.precoGasolina);
        verificar = findViewById(R.id.verificar);
        resultado = findViewById(R.id.resultado);

        verificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String textoPrecoAlcool = precoAlcool.getText().toString();
                String textoPrecoGasolina = precoGasolina.getText().toString();

                double valorAlcool = Double.parseDouble(textoPrecoAlcool);
                double valorGasolina = Double.parseDouble(textoPrecoGasolina);

                double resultadoValor = valorAlcool/valorGasolina;

                if (resultadoValor >= 0.7) {
                    resultado.setText("Compensa usar Galosina");
                } else {
                    resultado.setText("Compensa usar Alcool");
                }
            }
        });
    }
}
