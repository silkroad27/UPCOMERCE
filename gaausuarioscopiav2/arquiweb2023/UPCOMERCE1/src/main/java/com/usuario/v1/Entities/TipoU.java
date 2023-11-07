package com.usuario.v1.Entities;

import javax.persistence.*;

@Entity
@Table(name = "tu")
public class TipoU {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int idTipoU;

    @Column(name="usuarioadquirir", nullable = false,length =40)
    private String usuarioadquirir;

    @Column(name="usuario_intercambio", nullable = false,length =40)
    private String usuario_intercambio;

    public TipoU() {
    }

    public TipoU(int idTipoU, String usuarioadquirir, String usuario_intercambio) {
        this.idTipoU = idTipoU;
        this.usuarioadquirir = usuarioadquirir;
        this.usuario_intercambio = usuario_intercambio;
    }

    public int getIdTipoU() {
        return idTipoU;
    }

    public void setIdTipoU(int idTipoU) {
        this.idTipoU = idTipoU;
    }

    public String getUsuarioadquirir() {
        return usuarioadquirir;
    }

    public void setUsuarioadquirir(String usuarioadquirir) {
        this.usuarioadquirir = usuarioadquirir;
    }

    public String getUsuario_intercambio() {
        return usuario_intercambio;
    }

    public void setUsuario_intercambio(String usuario_intercambio) {
        this.usuario_intercambio = usuario_intercambio;
    }
}
