package TicTacToe.strategy.WinningStrategy;

import TicTacToe.models.Board;
import TicTacToe.models.Move;

public interface WinningStrategy {
    public  boolean checkWinner(Move m, Board b);

    public  void handleUndo(Move m ,Board b);
}
