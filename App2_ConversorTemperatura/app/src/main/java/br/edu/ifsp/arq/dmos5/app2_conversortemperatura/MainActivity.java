package br.edu.ifsp.arq.dmos5.app2_conversortemperatura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import br.edu.ifsp.arq.dmos5.app2_conversortemperatura.R;
import br.edu.ifsp.arq.dmos5.app2_conversortemperatura.conversor.CelsiusStrategy;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private CelsiusStrategy celsiusStrategy = CelsiusStrategy.getInstance();

    private EditText valueEditText;
    private Button converterCelsiusButton;
    private TextView valorConvertido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valueEditText = findViewById(R.id.edittext_value);
        valorConvertido = findViewById(R.id.valor_convertido);

        converterCelsiusButton = findViewById(R.id.button_converter_celsius);
        converterCelsiusButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view == converterCelsiusButton){
            getValorCelsius();
        }
    }

    private double getValue(){
        double value = 0;
        String valueString;

        valueString = valueEditText.getText().toString();

        try {
            value = Double.valueOf(valueString);
        }catch (NumberFormatException e){
            Toast.makeText(this, "Valor digitado é inválido", Toast.LENGTH_SHORT).show();
        }

        return value;
    }

    private void getValorCelsius() {
        double value = celsiusStrategy.getConversion(getValue());

        valorConvertido.setText(String.format("%.2f °", value));
    }
}