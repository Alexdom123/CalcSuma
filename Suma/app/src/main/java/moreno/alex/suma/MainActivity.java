package moreno.alex.suma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText editTextValor1, editTextValor2;
    Button botonSumar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextValor1 = findViewById(R.id.etValor1);
        editTextValor2 = findViewById(R.id.etValor2);
        botonSumar = findViewById(R.id.btnSumar);

        botonSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer numero1 = Integer.parseInt((editTextValor1.getText().toString()));
                Integer numero2 = Integer.parseInt((editTextValor2.getText().toString()));

                if (Integer.toString(numero1).isEmpty()){
                    mensajote("Ingresa el primer valor");

                }else if (Integer.toString(numero2).isEmpty()){
                    mensajote("Ingresa el segundo valor");
                }else{
                    int result;
                    result = numero1 + numero2;

                    mensajote("El resultado ez: " + result);
                }
            }
        });
    }
    public void mensajote(String mensaje){
        Toast.makeText(this, mensaje, Toast.LENGTH_LONG).show();
    }
}
