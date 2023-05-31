/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modell;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin230
 */
public class Bankfiok{

    
    private List<Automata> AutomataLista;
    
    public Bankfiok(){
    AutomataLista = new ArrayList<>();
    
    AutomataLista.add(new Automata("AA000001", 1000));
    AutomataLista.add(new Automata("AA000002", 2000));
    AutomataLista.add(new Automata("AA000003", 3000));
    AutomataLista.add(new Automata("AA000004", 4000));
}
    
    public void telepitAutomata(Automata automataPeldany){
        AutomataLista.add(automataPeldany);
    }
    public void leszerelAutomata(Automata automataPeldany){
        AutomataLista.remove(automataPeldany);
    }
    
        public void jelentes() {
        String folder = "jelentesek";
        File directory = new File(folder);
        if (!directory.exists()) {
            directory.mkdirs(); 
        }

        String file = folder + "/automatak.ser";
        try ( ObjectOutputStream mentes = new ObjectOutputStream(new FileOutputStream(file))) {
            mentes.writeObject(AutomataLista);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
       public void frissites() {
        String folder = "jelentesek";
        File directory = new File(folder);
        if (!directory.exists()) {
            directory.mkdirs(); 
        }

        String file = folder + "/automatak.ser";
        try ( ObjectInputStream beolvas = new ObjectInputStream(new FileInputStream(file))) {
            AutomataLista = (List<Automata>) beolvas.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
       
       public List<Automata> getAutomatak(){
           return AutomataLista;
       }
       
        public void setAutomatak(List<Automata> AutomataLista) {
        this.AutomataLista = AutomataLista;
    }
        
            public Automata getAutomataByID(String Azonosito) {
    for (Automata automata : AutomataLista) {
        if (automata.getAzonosito().equals(Azonosito)) {
            return automata;
        }
    }
    return null;
}
}
