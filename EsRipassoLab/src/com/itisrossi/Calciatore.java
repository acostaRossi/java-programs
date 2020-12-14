package com.itisrossi;

public class Calciatore {

    private String cognome;

    private Squadra squadra;

    public Calciatore(String cognome) {
        this.cognome = cognome;
    }

    public Calciatore(String cognome, Squadra squadra) {
        this.cognome = cognome;
        this.squadra = squadra;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public Squadra getSquadra() {
        return squadra;
    }

    public void setSquadra(Squadra squadra) {
        this.squadra = squadra;
    }
}
