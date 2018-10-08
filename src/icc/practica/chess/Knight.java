package icc.practica.chess;

import icc.practica.chess.Position;
import java.util.LinkedList;


public class Knight extends Piece {

  public Knight (Position p, boolean color) {
    super(p, color); 
  }
  
  public Knight (int row, char column, boolean color) {
    super(row, column, color);
  }
  
  @Override
  public boolean isValid (Position p) {
    
    LinkedList<Position> validPlays = possiblePlays();

    Position plays[] = validPlays.toArray(new Position[validPlays.size()]);
    
    for (int i = 0; i < plays.length; i++) {
      if (plays[i].toString().equals(p.toString()))
        return true;
    }
    
    return false;
  }
  
  private boolean outOfBounds (int row, char column) {
    return (row < 1 || row > 8 || column < 'a' || column > 'h');
  }
  
  @Override
  public String toString () {
    return (
      (color ? "White" : "Black") + 
      " Knight at: " + 
      this.position.toString()
    );
  }
  
  @Override
  public LinkedList<Position> possiblePlays () {
    LinkedList<Position> plays = new LinkedList<Position>();
    
    int diffs[][] = {
      {-2, 1},
      {2, 1},
      {-2, -1},
      {2, -1},
      {1, -2},
      {1, 2},
      {-1, 2},
      {-1, -2}
    };
    
    int currRow = this.position.getRow();
    char currCol = this.position.getColumn();
    
    for (int i = 0; i < diffs.length; i++)
      if (
        !outOfBounds(
          currRow + diffs[i][0],
          (char)((int)currCol + diffs[i][1]))
      ) plays.add(
        new Position(
          currRow + diffs[i][0],
          (char)((int)currCol + diffs[i][1]))
      );
    
    return plays;
  }
}
