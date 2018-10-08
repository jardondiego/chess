package icc.practica.chess;

import icc.practica.chess.Position;
import java.util.LinkedList;

public class Queen extends Piece {
  public Queen (Position p, boolean color) {
    super(p, color); 
  }
  
  public Queen (int row, char column, boolean color) {
    super(row, column, color);
  }
  
  @Override
  public boolean isValid (Position p) {
    return true;
  }
  
  private boolean outOfBounds (int row, char column) {
    return (row < 1 || row > 8 || column < 'a' || column > 'h');
  }
  
  @Override
  public LinkedList<Position> possiblePlays () {
    LinkedList<Position> plays = new LinkedList<Position>();
    
    int dir[][] = {
        {1, 1},
        {1, -1}, 
        {-1, 1}, 
        {-1, -1}, 
        {1, 0},
        {-1, 0},
        {0, 1},
        {0, -1}
      };
    
    int currRow = this.position.getRow();
    char currCol = this.position.getColumn();
    
    for (int i = 0; i < dir.length; i++) {
      int counter = 1;
      
      while (
        !outOfBounds(
          currRow + (dir[i][0] * counter),
          (char)((int)currCol + (dir[i][1] * counter))
        )
       ) {
        plays.add(new Position(
          currRow + (dir[i][0] * counter),
          (char)((int)currCol + (dir[i][1]))
        ));
        counter++;
      }
    }
    
    return plays;
  }
  
  public String toString () {
    return (
      (color ? "White" : "Black") +
      " Queen at: " +
      this.position.toString()
    );
  }
}
