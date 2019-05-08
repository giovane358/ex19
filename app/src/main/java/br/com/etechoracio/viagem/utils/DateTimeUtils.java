package br.com.etechoracio.viagem.utils;

import java.util.Calendar;
import java.util.Date;

public class DateTimeUtils {

    public static final DateTimeUtils DATE_Format = new DateTimeUtils("dd/MM/yyyy");

    public DateTimeUtils(String d) {
    }

    public static String formantDate(int Dia, int Mes, int ano) {
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.set(ano, Mes, Dia);
            return DATE_Format.format(calendar.getTime() );
        } catch (Exception e) {
            return null;
        }

    }

    private String format(Date time) {
        return null;
    }
}
