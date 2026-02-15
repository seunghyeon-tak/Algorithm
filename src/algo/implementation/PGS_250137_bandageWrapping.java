package algo.implementation;

public class PGS_250137_bandageWrapping {
    public static void main(String[] args) {
        System.out.println(solution(
                new int[]{1, 1, 1},
                5,
                new int[][]{{1, 2}, {3, 2}}));
    }

    static int solution(int[] bandage, int health, int[][] attacks) {
        int time = 1;
        int totalTime = attacks[attacks.length - 1][0];
        int maxHealth = health;
        int attackCount = 0;
        int continuous = 0;

        int t = bandage[0];
        int healPerSec = bandage[1];
        int bonusHeal = bandage[2];

        while (time <= totalTime) {
            if (attackCount <= attacks.length && attacks[attackCount][0] == time) {
                health -= attacks[attackCount][1];
                continuous = 0;
                attackCount++;

                if (health <= 0) return -1;

            } else {
                health += healPerSec;
                continuous++;
                if (continuous == t) {
                    health += bonusHeal;
                    continuous = 0;
                }

                if (maxHealth < health) {
                    health = maxHealth;
                }
            }
            time++;
        }

        return health;
    }
}
