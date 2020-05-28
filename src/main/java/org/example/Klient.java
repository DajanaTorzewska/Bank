package org.example;

import java.nio.charset.Charset;
import java.util.Random;

public class Klient {
    private String imie;
    private String nazwisko;
    private String dataUrodzenia;
    private float zarobek;
    private String login;
    private String haslo;
    private String nrKonta;
    private float saldo;

    public Klient(String imie, String nazwisko, String dataUrodzenia) {
        byte[] tablica = new byte[8];
        new Random().nextBytes(tablica);
        haslo = new String(tablica, Charset.forName("UTF-8"));
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
        Random rand = new Random();
        login = nazwisko.substring(0, 3) + imie.substring(0, 3) + rand.nextInt(10) + rand.nextInt(10) + rand.nextInt(10);
        saldo = 0;
        zarobek = 0;
    }

    public String getImie(String imie) {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setDataUrodzenia(String dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;
    }

    public void setZarobek(float zarobek) {
        this.zarobek = zarobek;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setHaslo(String haslo) {
        this.haslo = haslo;
    }

    public void setNrKonta(String nrKonta) {
        this.nrKonta = nrKonta;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getNazwisko() {
        return nazwisko;

    }

    public float getSaldo() {
        return saldo;
    }

    public float getZarobek() {
        return zarobek;

    }

    public String getDataUrodzenia() {
        return dataUrodzenia;
    }

    public String getHaslo() {
        return haslo;
    }

    public String getLogin() {
        return login;
    }

    public String getNrKonta() {
        return nrKonta;
    }

    public String getImie() {
        return imie;
    }
}
