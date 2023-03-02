package Mappabili;

import java.util.HashSet;

public class Vuoto implements Mappable{
  private HashSet<Giocatore> giocatori = new HashSet<>();

  public void addGiocatore(Giocatore giocatore){
    giocatori.add(giocatore);
  }
  public void removeGiocatore(Giocatore giocatore){
    giocatori.remove(giocatore);
  }
  @Override
  public String toString() {
    StringBuilder string = new StringBuilder();
    int i = 0;
    for (Giocatore giocatore : giocatori) {
      string.append(" ").append(giocatore.getNome().toUpperCase().charAt(0));
      i+=2;
    }
    string.append(" ".repeat(8 - i));
    return string.toString();
//      return "        ";
  }
}
