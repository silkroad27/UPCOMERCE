package com.usuario.v1.Entities;



import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Documento")
    public class Documento {


        @Id
        @GeneratedValue(strategy =  GenerationType.IDENTITY)
        private int id_Documento;

        private int id_Usuario;

        private int id_Transaccion;

        @Column(name = "Fecha_Documento",nullable = false)
        private LocalDate fechaDocumento;
        @Column(name = "Tipo_Documento",nullable = false,length = 40)
        private String tipoDocumento;


    public Documento() {
    }

    public Documento(int id_Documento, int id_Usuario, int id_Transaccion, LocalDate fechaDocumento, String tipoDocumento) {
        this.id_Documento = id_Documento;
        this.id_Usuario = id_Usuario;
        this.id_Transaccion = id_Transaccion;
        this.fechaDocumento = fechaDocumento;
        this.tipoDocumento = tipoDocumento;
    }

    public int getId_Documento() {
        return id_Documento;
    }

    public void setId_Documento(int id_Documento) {
        this.id_Documento = id_Documento;
    }

    public int getId_Usuario() {
        return id_Usuario;
    }

    public void setId_Usuario(int id_Usuario) {
        this.id_Usuario = id_Usuario;
    }

    public int getId_Transaccion() {
        return id_Transaccion;
    }

    public void setId_Transaccion(int id_Transaccion) {
        this.id_Transaccion = id_Transaccion;
    }

    public LocalDate getFechaDocumento() {
        return fechaDocumento;
    }

    public void setFechaDocumento(LocalDate fechaDocumento) {
        this.fechaDocumento = fechaDocumento;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }
}