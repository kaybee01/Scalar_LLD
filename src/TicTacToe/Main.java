package TicTacToe;

import TicTacToe.Controller.GameController;
import TicTacToe.Exception.InvalidBotCount;
import TicTacToe.strategy.WinningStrategy.ColWinningStrategy;
import TicTacToe.strategy.WinningStrategy.DiagonalWinningStrategy;
import TicTacToe.strategy.WinningStrategy.RowWinningStrategy;
import TicTacToe.strategy.WinningStrategy.WinningStrategy;
import TicTacToe.models.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InvalidBotCount {
        GameController gc = new GameController();
        Scanner sc =new Scanner(System.in);

        try {
            int dimension =3;
            List<Player> p =new ArrayList<>();
            p.add(new Player(1 ,"Kabir", PlayerType.Human,new Symbol('X')));
            p.add(new Bot(1 ,"Bot", new Symbol('O'), BotDifficulty.Easy));

            List<WinningStrategy> ws =new ArrayList<>();
            ws.add(new ColWinningStrategy());
            ws.add(new RowWinningStrategy());
            ws.add(new DiagonalWinningStrategy());

            Game g = gc.StartGame(dimension ,p ,ws);
            gc.displayBoard(g);

            while (g.getGameState().equals(GameState.Inprogress)) {
                gc.makeMove(g);
                System.out.println("Want to undo 1/2");
                int undoAnswer = sc.nextInt();
                if(undoAnswer== 1){
                    System.out.println("Undoing..!");
                    gc.undo(g);
                }
                gc.displayBoard(g);
            }

            if (g.getGameState().equals(GameState.Draw)) {
                System.out.println("Game draw!!!");
            } else if (g.getGameState().equals(GameState.Success)) {
                System.out.println("Game Winner" + g.getWinner().getName());
            }

        }catch (Exception e){
            throw e;
        }

      //  Game g = gc.StartGame(3, new ArrayList<>(), new ArrayList<>());
    }
}
