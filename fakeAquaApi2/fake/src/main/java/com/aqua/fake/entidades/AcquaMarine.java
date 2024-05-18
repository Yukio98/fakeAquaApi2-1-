package com.aqua.fake.entidades;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "acquamarine")
public class AcquaMarine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String chave;
    private Date dataHora;
    private Float temperatura;
    private Float oxigenio;
    private float saturacao;

    public AcquaMarine() {

    }

    public AcquaMarine(Long id, String chave, Date dataHora, Float temperatura, Float oxigenio, float saturacao) {

        this.id = id;
        this.chave = chave;
        this.dataHora = dataHora;
        this.temperatura = temperatura;
        this.oxigenio = oxigenio;
        this.saturacao = saturacao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getChave() {
        return chave;
    }

    public void setChave(String chave) {
        this.chave = chave;
    }

    public Date getDataHora() {
        return dataHora;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    public Float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Float temperatura) {
        this.temperatura = temperatura;
    }

    public Float getOxigenio() {
        return oxigenio;
    }

    public void setOxigenio(Float oxigenio) {
        this.oxigenio = oxigenio;
    }

    public float getSaturacao() {
        return saturacao;
    }

    public void setSaturacao(float saturacao) {
        this.saturacao = saturacao;
    }

}
