package com.chess.engine;
import com.chess.engine.Board.*;
import com.chess.engine.Game.engine;

public class GameEvents {
    static  int px=-1;
    static int py=-1;
    static int mx=-1;
    static int my=-1;
    static int check = 0;
    static public int setevent(int x,int y){
        int gx = 7-(x/100);
        int gy = 7-(y/100);
         if(check == 0){
            px = gx;
            py = gy;
            check=1;
            return 2;
        }else{
            mx=gx;
            my=gy;
            check = 0;
            return engine.move(px,py,mx,my);
        }
    }

}
        
      
    

