package Behavioral.State.PlayerState;

import Behavioral.State.Player;

public class NoviceLevel extends PlayerState {

    public NoviceLevel(Player player) {
        super(player);
        setToNextLevel(100);
    }

    @Override
    public void update() {
        if(getPlayer().getExperiencePoints() >= getToNextLevel()) {
            levelUp(new IntermediateLevel(getPlayer()));
            return;
        }

        super.update();

        System.out.println("1. Training");
        getPlayer().setChoice(getScanner().nextLine());
    }

    @Override
    public String getLevelName() {
        return "Novice";
    }
}
