package Behavioral.State.PlayerState;

import Behavioral.State.Player;

public class IntermediateLevel extends PlayerState {

    public IntermediateLevel(Player player) {
        super(player);
        setToNextLevel(250);
    }

    @Override
    public void update() {
        if(getPlayer().getExperiencePoints() >= getToNextLevel()) {
            levelUp(new MasterLevel(getPlayer()));
            return;
        }
        super.update();

        System.out.println("1. Training");
        System.out.println("2. Meditation");
        getPlayer().setChoice(getScanner().nextLine());

    }

    @Override
    public String getLevelName() {
        return "Intermediate";
    }
}
