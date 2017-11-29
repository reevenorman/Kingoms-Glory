/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kingdomsandglory;

import kingdomsandglory.model.Game;
import kingdomsandglory.model.Player;
import kingdomsandglory.view.StartProgramView;

/**
 *
 * @author piano
 */
public class kingdomsandglory {

    public static void main(String[] args) {
        try {
            StartProgramView startProgramView = new StartProgramView();
            startProgramView.display();
        } catch (Throwable te) {
            System.out.println(te.getMessage());
            te.printStackTrace();
            return;
        }
    }
    private static Player player = null;
    private static Game currentGame = null;

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        kingdomsandglory.player = player;
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        kingdomsandglory.currentGame = currentGame;
    }

}
