package Behavioral.State.PlayerState;

import Behavioral.State.Player;

public class MasterLevel extends PlayerState {

    public MasterLevel(Player player) {
        super(player);
        setToNextLevel(1000);
    }

    @Override
    public void update() {
        if(getPlayer().getExperiencePoints() >= getToNextLevel()) {
            levelUp(new ExpertLevel(getPlayer()));
            return;
        }
        super.update();

        System.out.println("1. Training");
        System.out.println("2. Meditation");
        System.out.println("3. Fight");
        getPlayer().setChoice(getScanner().nextLine());

    }

    @Override
    public String getLevelName() {
        return "Master";
    }
}
