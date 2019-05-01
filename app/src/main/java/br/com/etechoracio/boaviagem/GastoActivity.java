package br.com.etechoracio.boaviagem;

import android.app.DatePickerDialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.Calendar;

public class GastoActivity extends AppCompatActivity {

    private Spinner spnTipoGasto;
    private Button btnData;

    private ArrayAdapter getAdapterTipoGasto() {
        return new ArrayAdapter<TipoGastoEnum>(this, R.layout.support_simple_spinner_dropdown_item, TipoGastoEnum.values());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_novo_gasto);

        spnTipoGasto = findViewById(R.id.spnTipoGasto);
        spnTipoGasto.setAdapter(getAdapterTipoGasto());

        btnData = findViewById(R.id.btnData);
    }

    private DatePickerDialog.OnDateSetListener dAteSetListener = new DatePickerDialog.OnDateSetListener() {
        public void onDateSet(DatePicker VIew, int year, int month, int day) {
            String data =  String.valueOf(day) + "/" + String.valueOf(month + 1) + "/" + String.valueOf(year);
            btnData.setText(DateTimeUtils.formatDate(dia,mes,ano));
            {
                dataS
            }
            btnData.setText(DateTimeUtils.formatDate(dia,mes,ano));

        }
    };
}