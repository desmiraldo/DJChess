package com.chess.main;
import com.chess.engine.Game.engine;
import com.chess.ghraphics.*;

public class Main{
    public static void main(String[] args){
        engine gameboard = new engine();
        gameboard.newgame();
        graph window = new graph(gameboard.pieceAll);
        window.changed();
        
    }
}
