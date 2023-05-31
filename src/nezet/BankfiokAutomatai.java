/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nezet;

import modell.Automata;
import modell.Bankfiok;

/**
 *
 * @author Admin230
 */
public class BankfiokAutomatai {

    public static void main(String[] args) {

        Bankfiok bankfiok = new Bankfiok();

        telepites(bankfiok);
        automatak(bankfiok);
        jelentes(bankfiok);
        frissites(bankfiok);
    }

    private static void telepites(Bankfiok bankfiok) {
        bankfiok = new Bankfiok();
        bankfiok.telepitAutomata(new Automata("AA222222", 10000));
        bankfiok.getAutomatak();
    }

    private static void automatak(Bankfiok bankfiok) {
        bankfiok = new Bankfiok();
        bankfiok.getAutomatak();
    }

    private static void jelentes(Bankfiok bankfiok) {
        bankfiok = new Bankfiok();
        bankfiok.jelentes();
    }

    private static void frissites(Bankfiok bankfiok) {
        bankfiok = new Bankfiok();
        bankfiok.frissites();
    }

}
