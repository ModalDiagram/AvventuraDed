import Mappabili.*;

import java.util.ArrayList;

public class Mappa {
  ArrayList<ArrayList<Mappable>> mappa = new ArrayList<ArrayList<Mappable>>();

  public void setMappa(){
    mappa.add(new ArrayList<>());
    mappa.add(new ArrayList<>());
    mappa.add(new ArrayList<>());
    mappa.get(0).add(new Tesoro()); mappa.get(0).add(new Muro()); mappa.get(0).add(new Mostro());
    mappa.get(1).add(new Vuoto()); mappa.get(1).add(new Mostro()); mappa.get(1).add(new Vuoto());
    mappa.get(2).add(new Vuoto()); mappa.get(2).add(new Muro()); mappa.get(2).add(new Tesoro());
  }

  public void addGiocatore(Posizione posizione, Giocatore giocatore){
    ArrayList<Mappable> colonna = mappa.get(posizione.getX());
    if(colonna.get(posizione.getY()) instanceof Vuoto){
      ((Vuoto) colonna.get(posizione.getY())).addGiocatore(giocatore);
    }
    else System.out.println("Attenzione posto occupato");
  }

  public Mappable getPosizione(Posizione posizione){
    return mappa.get(posizione.getX()).get(posizione.getY());
  }

  @Override
  public String toString() {
    // Tutti gli elementi hanno una lunghezza di 8 caratteri così i | sono allineati
    StringBuilder string = new StringBuilder();
    for (ArrayList<Mappable> riga : mappa) {
      for (Mappable elemento : riga) {
        string.append(elemento);
        string.append("|");
      }
      string.append("\n");
    }
    return string.toString();
  }
}
