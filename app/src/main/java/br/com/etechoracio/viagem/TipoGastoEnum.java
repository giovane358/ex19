package br.com.etechoracio.viagem;

public enum TipoGastoEnum {
    ALIMENTACAO("Alimentação"),
    COMBUSTIVEL("Combustivel"),
    TRANSPORTE("Transporte"),
    HOSPEDAGEM("Hospedagem"),
    OUTROS("Outros");


    private String descricao;

    TipoGastoEnum(String descricao) {
        this.descricao = descricao;

    }

    public String toString() {
        return descricao;
    }


}
