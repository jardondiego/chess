package icc.practica.chess;

import java.util.LinkedList;

public class King extends Piece {
  public King (Position p, boolean color) {
    super(p, color); 
  }
  
  public King (int row, char column, boolean color) {
    super(row, column, color);
  }
  
  private boolean outOfBounds (int row, char column) {
    return (row < 1 || row > 8 || column < 'a' || column > 'h');
  }
  
  @Override
  public String toString () {
    return (
      (color ? "White" : "Black") +
      " King at: " + this.position.toString()
    );
  }
  
  @Override
  public boolean isValid (Position p) {
    return true;
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
    
    for (int i = 0; i < dir.length; i++) {
    
      int currRow = this.position.getRow();
      char currCol = this.position.getColumn();
      
      if (
        !outOfBounds(currRow + dir[i][0],
        (char)((int)currCol + dir[i][1]))
      )
        plays.add(
          new Position(
            currRow + dir[i][0],
            (char)((int)currCol + dir[i][1])
          )
        );
    }
    
    return plays;
  }
}
