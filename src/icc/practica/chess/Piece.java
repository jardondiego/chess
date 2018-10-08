package icc.practica.chess;

import java.util.LinkedList;

public abstract class Piece {
  protected Position position;
  protected boolean color;
  
  public Piece (Position position, boolean color) {
    this.position = position;
    this.color = color;
  }
  
  public Piece (int row, char column, boolean color) {
    this.position = new Position(row, column);
    this.color = color;
  }
  
  public Position getPosition () {
    return this.position;
  }
  
  public void setPosition (Position position) {
    this.position = position;
  }
  
  public boolean getColor () {
    return this.color;
  }
  
  public abstract boolean isValid (Position position);
  public abstract LinkedList<Position> possiblePlays ();
  public abstract String toString();
  
}