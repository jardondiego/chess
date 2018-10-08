package icc.practica.chess;

public class Position {
  private int row;
  private char column;
  
  public Position (int row, char column) {
    if (row < 1 || row > 8)
      throw new IllegalArgumentException("Invalid row!");
    
    if (column < 'a' || column > 'h')
      throw new IllegalArgumentException("Invalid column!");
      
    this.row = row;
    this.column = column;
  }
  
  public char getColumn () {
    return this.column;
  }
  
  public void setColumn (char column) {
     if (column < 'a' || column > 'h')
      throw new IllegalArgumentException("Invalid column!");
      
     this.column = column;
  }
  
  public int getRow () {
    return this.row;
  }
  
  public void setRow (int row) {
    if (row < 1 || row > 8)
      throw new IllegalArgumentException("Invalid row!");
      
    this.row = row;
  }
  
  public String toString () {
    return (
      "[" +
      this.row +
      ", " + 
      this.column +
      "]"
    );
  }
}
