/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modell;

import java.io.Serializable;


public class Automata implements Serializable {

    public Automata(String Azonosito, int Penz) {
        this.Azonosito = Azonosito;
        this.Penz = Penz;
    }

    public String getAzonosito() {
        return Azonosito;
    }

    public int getPenz() {
        return Penz;
    }

    public void setAzonosito(String Azonosito) {
        
        if (Azonosito.matches("[A-Za-z]{2}[0-9]{6}")) {
            this.Azonosito = Azonosito;
        } else {
            throw new IllegalArgumentException("Az ID érvénytelen formátumú.");
        }
    }

    public void setPenz(int Penz) {
        this.Penz = Penz;
    }

    @Override
    public String toString() {
        return "Automata{" + "Azonosito=" + Azonosito + ", Penz=" + Penz + '}';
    }
    private String Azonosito;
    private int Penz;
    
}
