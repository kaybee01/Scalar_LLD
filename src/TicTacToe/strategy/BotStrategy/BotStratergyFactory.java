package TicTacToe.strategy.BotStrategy;

import TicTacToe.models.BotDifficulty;

public class BotStratergyFactory {

    public static BotStatergy getStratergyBasedOnLevel(BotDifficulty b){
        if (b.equals(BotDifficulty.Easy)){
            return  new EasyBotStratergy();
        }
        return null;
    }
}
