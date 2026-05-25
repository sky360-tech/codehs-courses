public class PlayerRunner {
    public static void main(String[] args) {
        Player player1 = new Player("Gamer123", 50000, 10);
        Player player2 = new Player("ShadowNinja", 75000, 12);
        Player player3 = new Player("PixelMaster", 90000, 10);

        player1.updateScore(120000);
        player1.levelUp();
        player2.levelUp();
        player2.updateScore(85000);

        System.out.println(player1);
        System.out.println(player2);
        System.out.println(player3);

        Player topPlayer = Player.findTopPlayer(player1, player2, player3);
        System.out.println("Top Player: " + topPlayer.getUsername() +
            " with Level " + topPlayer.getLevel() +
            " and High Score of " + topPlayer.getHighScore());

        System.out.println("Total Players: " + Player.getTotalPlayers());
        System.out.println("Total Level Ups: " + Player.getTotalLevelUps());
    }
}