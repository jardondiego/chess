package icc.practica.chess;

import icc.practica.chess.Knight;
import icc.practica.chess.Queen;
import java.util.LinkedList;


public class Main {

  public static void main(String[] args) {
    Queen q = new Queen(3, 'b', true);
    Knight k = new Knight(4, 'a', true);
    King kn = new King(5, 'f', true);
    
    LinkedList<Position> playsQueen = q.possiblePlays();
    LinkedList<Position> playsKing = kn.possiblePlays();
    LinkedList<Position> playsKnight = k.possiblePlays();
    
    System.out.println(k.toString());
    
    System.out.println("Possible plays for Knight: ");
    
    for (int i = 0; i < playsKnight.size(); i++)
      System.out.println(playsKnight.get(i).toString());
    
    System.out.println(kn.toString());
    
    System.out.println("Possible plays for King: ");
    
    for (int i = 0; i < playsKing.size(); i++)
      System.out.println(playsKing.get(i).toString());
    
    System.out.println(q.toString());
    
    System.out.println("Possible plays foe Queen: ");
    
    for (int i = 0; i < playsQueen.size(); i++)
      System.out.println(playsQueen.get(i).toString());
  }

}