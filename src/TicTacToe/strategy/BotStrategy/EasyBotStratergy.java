package TicTacToe.strategy.BotStrategy;

import TicTacToe.models.Board;
import TicTacToe.models.Cell;
import TicTacToe.models.CellState;
import TicTacToe.models.Move;

import java.util.List;

public class EasyBotStratergy implements  BotStatergy{
    @Override
    public Move makeMove(Board b) {
        for(List<Cell> row : b.getBoard()){
            for(Cell cell : row){
                if (cell.getCellState().equals(CellState.Empty)){
                    return  new Move(cell ,null);
                }
            }
        }

        return null;
    }
}
