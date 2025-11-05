package se.sprinto.hakan.adventuregame.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PlayerAttackTest {
    @Test
    void attackShouldReduceEnemyHealth() {
        Player player = new Player.Builder()
                .name("Test Player")
                .health(100)
                .score(0)
                .strength(20)
                .build();

        AbstractCharacter enemy = new AbstractCharacter("Goblin", 50, 0, 5) {
            @Override
            public void attack(AbstractCharacter target) {

            }
        };

        player.attack(enemy);

        assertEquals(30, enemy.getHealth(),
                "Fiendens hälsa borde ha minskat med spelarens styrka");
    }
}
