package se.sprinto.hakan.adventuregame.model;

import org.junit.jupiter.api.Test;
import se.sprinto.hakan.adventuregame.view.FakeUI;

import static org.junit.jupiter.api.Assertions.assertTrue;

class DungeonRoomTest {

    @Test
    void playerDefeatsEnemyWhenChoosingAttack() {
        FakeUI ui = new FakeUI();
        ui.addInput("a");

        Player player = new Player.Builder()
                .name("Test Player")
                .health(100)
                .score(0)
                .strength(20)
                .build();

        DungeonRoom room = new DungeonRoom();
        room.enterRoom(player, ui);

        assertTrue(player.hasDefeatedEnemy(), "Spelaren borde ha besegrat fienden");
    }
}