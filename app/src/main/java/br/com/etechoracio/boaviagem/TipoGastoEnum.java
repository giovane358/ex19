package br.com.etechoracio.boaviagem;

import android.widget.ArrayAdapter;

public enum TipoGastoEnum
{
ALIMENTACAO("Alimentação"),
COMBUSTIVEL("Combustivel"),
TRANSPORTE("Transporte"),
HOSPÈDAGEM("Hospedagem"),
OUTROS("Outros");

    TipoGastoEnum(String descricao) {
        this.descricao = descricao;
    }

    private String descricao;

    public String toString(){
        return descricao;

    }




}
