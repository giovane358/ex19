package br.com.etechoracio.viagem;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;

import java.text.BreakIterator;
import java.util.Calendar;

import br.com.etechoracio.viagem.utils.DateTimeUtils;

public class ViagemActivity extends AppCompatActivity {

    private Button btnDataChegada;
    private Button btnDataSaida;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viagem);
    }

    public Dialog onCreateDialog(int id) {
        Calendar calendario = Calendar.getInstance();
        int ano = calendario.get(Calendar.YEAR);
        int mes = calendario.get(Calendar.MONTH);
        int dia = calendario.get(Calendar.DAY_OF_MONTH);

        switch (id) {
            case R.id.btnDataChegada:
                return new DatePickerDialog(this, dataChegadaListener, ano, mes, dia);
            case R.id.btnDataSaida:
                return new DatePickerDialog(this, dataSaidaListener, ano, mes, dia);
        }
        return null;


    }

    private DatePickerDialog.OnDateSetListener dataChegadaListener = new DatePickerDialog.OnDateSetListener() {

        @Override
        public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {

        }

        public void OnDateSet(DatePicker datePicker, int ano, int mes, int dia) {
            btnDataChegada.setText(DateTimeUtils.formantDate(dia, mes + 1, ano));
        }
    };

    private DatePickerDialog.OnDateSetListener dataSaidaListener = new DatePickerDialog.OnDateSetListener() {

        @Override
        public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {

        }

        public void OnDateSet(DatePicker view, int ano, int mes, int dia) {
            String data = String.valueOf(dia) + " /" + String.valueOf(mes + 1) + " /" + String.valueOf(ano);
           btnDataSaida.setText(data);
        }
    };

    public void onClick(View v) {
        showDialog(v.getId());
    }


    private DatePickerDialog.OnDateSetListener onDateSetListener = new DatePickerDialog.OnDateSetListener() {
        private BreakIterator btnDataChegada;

        @Override
        public void onDateSet(DatePicker datePicker, int ano, int mes, int dia) {
            btnDataChegada.setText(DateTimeUtils.formantDate(dia, mes + 1, ano));
        }
    };
}
