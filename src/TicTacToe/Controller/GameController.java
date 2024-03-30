package TicTacToe.Controller;

import TicTacToe.Exception.InvalidBotCount;
import TicTacToe.strategy.WinningStrategy.WinningStrategy;
import TicTacToe.models.Game;
import TicTacToe.models.GameState;
import TicTacToe.models.Player;

import java.util.List;

public class GameController {
    //public Game game;
    public  Game StartGame(int dimensions, List<Player> p , List<WinningStrategy> winningStrategies) throws InvalidBotCount {
        Game game =  Game.getInstanceBuilder()
                .setDimension(dimensions)
                .setPlayers(p)
                .setWinningStratergies(winningStrategies)
                .build();
        return  game;
    }

    public void displayBoard(Game game){
        game.getBoard().printBoard();
    }

    public  void makeMove(Game game){
        game.makeMove();
    }
    public GameState checkState(Game g){
        return null;
    }

    public  Player getWinner(Game g){
        return  g.getWinner();
    }

    public void undo(Game g){
        g.undo();
    }
}
