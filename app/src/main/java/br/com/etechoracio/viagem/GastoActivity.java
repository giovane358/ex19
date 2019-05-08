package br.com.etechoracio.viagem;

import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Spinner;

import java.text.BreakIterator;

import br.com.etechoracio.viagem.utils.DateTimeUtils;

public class GastoActivity extends AppCompatActivity {
    private Spinner spnTipoGasto;

    private Button btnDataChegada;
    private Button btnDataSaida;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gasto);

        spnTipoGasto = (Spinner) findViewById(R.id.spnTipoGasto);
        spnTipoGasto.setAdapter(getAdapterTipoGasto());


    }

    private ArrayAdapter getAdapterTipoGasto() {
        return new ArrayAdapter<TipoGastoEnum>(this,
                R.layout.support_simple_spinner_dropdown_item,
                TipoGastoEnum.values());
    }
    private DatePickerDialog.OnDateSetListener onDateSetListener = new DatePickerDialog.OnDateSetListener() {


        @Override
        public void onDateSet(DatePicker datePicker, int ano, int mes, int dia) {

            btnDataChegada.setText(DateTimeUtils.formantDate(dia,mes + 1,ano));
        }
    };


}
