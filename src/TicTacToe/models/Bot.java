package TicTacToe.models;

import TicTacToe.strategy.BotStrategy.BotStatergy;
import TicTacToe.strategy.BotStrategy.BotStratergyFactory;

public class Bot extends  Player{
    BotDifficulty botDifficulty;

    BotStatergy statergy;

    public Bot(int id,String name , Symbol s ,BotDifficulty botDifficulty){
        super(id,name,PlayerType.Bot,s);
        this.botDifficulty=botDifficulty;
        this.statergy = BotStratergyFactory.getStratergyBasedOnLevel(botDifficulty);
    }

    public BotDifficulty getBotDifficulyu() {
        return botDifficulty;
    }

    public void setBotDifficulyu(BotDifficulty botDifficulyu) {
        this.botDifficulty = botDifficulyu;
    }

    public Move makeMove(Board b){
        Move m =statergy.makeMove(b);
        m.setPlayer(this);
        return  m;
    }
}
