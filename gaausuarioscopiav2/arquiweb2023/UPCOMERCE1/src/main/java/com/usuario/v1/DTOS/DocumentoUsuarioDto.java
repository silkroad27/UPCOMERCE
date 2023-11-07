package com.usuario.v1.DTOS;

public class DocumentoUsuarioDto {

    private String nameUsuario;
    private int quantityDocuments;

    public int getQuantityDocuments() {
        return quantityDocuments;
    }

    public void setQuantityDocuments(int quantityDocuments) {
        this.quantityDocuments = quantityDocuments;
    }

    public String getNameUsuario() {
        return nameUsuario;
    }

    public void setNameUsuario(String nameUsuario) {
        this.nameUsuario = nameUsuario;
    }


}
