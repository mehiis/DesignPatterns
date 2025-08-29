package Behavioral.State.PlayerState;

import Behavioral.State.Player;

public class ExpertLevel extends PlayerState {

    public ExpertLevel(Player player) {
        super(player);
        setToNextLevel(1000);
    }

    @Override
    public void update() {
        getPlayer().playerWon();
    }

    @Override
    public String getLevelName() {
        return "Expert";
    }
}
