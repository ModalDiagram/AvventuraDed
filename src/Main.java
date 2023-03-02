import Mappabili.Giocatore;

public class Main {
  public static void main(String[] args) {
    Avventura avventuraProva = new Avventura();
    Giocatore gandalf = new Giocatore("gandalf");
    avventuraProva.inizia(gandalf, new Giocatore("bu"));
    System.out.println(avventuraProva);
    avventuraProva.muovi(gandalf);
    System.out.println(avventuraProva);
  }
}