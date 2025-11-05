package se.sprinto.hakan.adventuregame.model;

import org.junit.jupiter.api.Test;
import se.sprinto.hakan.adventuregame.view.FakeUI;

import static org.junit.jupiter.api.Assertions.assertTrue;

class TreasureRoomTest {
    @Test
    void playerCanOpenChestWhenHasKey() {
        FakeUI ui = new FakeUI();
        ui.addInput("ja");

        Player player = new Player.Builder()
                .name("Test Player")
                .health(100)
                .score(0)
                .strength(10)
                .build();
        player.setFoundKey(true);

        TreasureRoom room = new TreasureRoom();
        room.enterRoom(player, ui);

        assertTrue(player.hasOpenedChest(), "Spelaren borde ha öppnat kistan");
    }
}