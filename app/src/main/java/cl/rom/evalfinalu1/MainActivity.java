package cl.rom.evalfinalu1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText Nombre,Apellido;
    private Button Enviar;
    private View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Nombre =(EditText)findViewById(R.id.txNombre);
        //Apellido =(EditText)findViewById(R.id.txApellido);

        final Button Enviar =(Button) findViewById(R.id.btEnviar);
        Enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText Nombre=(EditText) findViewById(R.id.txNombre);
                String sNombre=Nombre.getText().toString();
                EditText Apellido=(EditText) findViewById(R.id.txApellido);
                String sApellido=Apellido.getText().toString();

                Toast toast1=
                        Toast.makeText(getApplicationContext(),"Su Nombre es: "+sNombre+" "+sApellido, Toast.LENGTH_SHORT);
                toast1.show();
            }

        });

    }

}