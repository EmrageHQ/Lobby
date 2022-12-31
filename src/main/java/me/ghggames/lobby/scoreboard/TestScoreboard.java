package me.ghggames.lobby.scoreboard;
import org.bukkit.entity.Player;

public class TestScoreboard extends ScoreboardBuilder {

    public TestScoreboard(Player player) {
        super(player, " §6§lLobby ");
    }


    public void createScoreboard() {
        setScore("§8", 7);
        setScore("§7Dein Rang§8:", 6);
        if (this.player.isOp()) {
            setScore("§cOperator", 5);
        } else {
            setScore("§7Spieler", 5);
        }
        setScore("§1", 4);
        setScore("§9Website§8 :", 3);
        setScore("§5/website", 2);
        setScore("§7", 1);
        setScore("§7Code by GamerPvG", 0);
    }

    @Override
    public void update() {

    }


}
