package com.chess.engine;
import com.chess.engine.Board.*;
public class Game{
    static public class engine{
        static String turn = "white";
        static int W = 7;
        static int H = 7;
        static public piece[][] pieceAll =  new piece[8][8];
        public void newgame(){
            for(int i=0;i<=7;i++){
                for(int j=0;j<=7;j++){
                    pieceAll[i][j] = new piece();
                    if(j==1){
                        pieceAll[i][j].pieceName = "pawn";
                        pieceAll[i][j].dead = "0";
                        pieceAll[i][j].position = "white";
                        pieceAll[i][j].x = 5;
                        pieceAll[i][j].y = 1;
                    }
                    if(j==6){
                        pieceAll[i][j].pieceName = "pawn";
                        pieceAll[i][j].dead = "0";
                        pieceAll[i][j].position = "black";
                        pieceAll[i][j].x = 5;
                        pieceAll[i][j].y = 0;
                    }
                    
                }
            }
            pieceAll[0][0].pieceName = "rook";
            pieceAll[0][0].dead = "0";
            pieceAll[0][0].position = "white";
            pieceAll[0][0].x = 2;
            pieceAll[0][0].y = 1;

            pieceAll[1][0].pieceName = "knhight";
            pieceAll[1][0].dead = "0";
            pieceAll[1][0].position = "white";
            pieceAll[1][0].x = 3;
            pieceAll[1][0].y = 1;


            pieceAll[2][0].pieceName = "bishop";
            pieceAll[2][0].dead = "0";
            pieceAll[2][0].position = "white";
            pieceAll[2][0].x = 4;
            pieceAll[2][0].y = 1;


            pieceAll[3][0].pieceName = "king";
            pieceAll[3][0].dead = "0";
            pieceAll[3][0].position = "white";
            pieceAll[3][0].x = 1;
            pieceAll[3][0].y = 1;


            pieceAll[4][0].pieceName = "queen";
            pieceAll[4][0].dead = "0";
            pieceAll[4][0].position = "white";
            pieceAll[4][0].x = 0;
            pieceAll[4][0].y = 1;


            pieceAll[5][0].pieceName = "bishop";
            pieceAll[5][0].dead = "0";
            pieceAll[5][0].position = "white";
            pieceAll[5][0].x = 4;
            pieceAll[5][0].y = 1;


            pieceAll[6][0].pieceName = "knhight";
            pieceAll[6][0].dead = "0";
            pieceAll[6][0].position = "white";
            pieceAll[6][0].x = 3;
            pieceAll[6][0].y = 1;


            pieceAll[7][0].pieceName = "rook";
            pieceAll[7][0].dead = "0";
            pieceAll[7][0].position = "white";
            pieceAll[7][0].x = 2;
            pieceAll[7][0].y = 1;


            pieceAll[0][7].pieceName = "rook";
            pieceAll[0][7].dead = "0";
            pieceAll[0][7].position = "black";
            pieceAll[0][7].x = 2;
            pieceAll[0][7].y = 0;


            pieceAll[1][7].pieceName = "knhight";
            pieceAll[1][7].dead = "0";
            pieceAll[1][7].position = "black";
            pieceAll[1][7].x = 3;
            pieceAll[1][7].y = 0;

            pieceAll[2][7].pieceName = "bishop";
            pieceAll[2][7].dead = "0";
            pieceAll[2][7].position = "black";
            pieceAll[2][7].x = 4;
            pieceAll[2][7].y = 0;

            pieceAll[3][7].pieceName = "king";
            pieceAll[3][7].dead = "0";
            pieceAll[3][7].position = "black";
            pieceAll[3][7].x = 1;
            pieceAll[3][7].y = 0;

            pieceAll[4][7].pieceName = "queen";
            pieceAll[4][7].dead = "0";
            pieceAll[4][7].position = "black";
            pieceAll[4][7].x = 0;
            pieceAll[4][7].y = 0;

            pieceAll[5][7].pieceName = "bishop";
            pieceAll[5][7].dead = "0";
            pieceAll[5][7].position = "black";
            pieceAll[5][7].x = 4;
            pieceAll[5][7].y = 0;

            pieceAll[6][7].pieceName = "knhight";
            pieceAll[6][7].dead = "0";
            pieceAll[6][7].position = "black";
            pieceAll[6][7].x = 3;
            pieceAll[6][7].y = 0;

            pieceAll[7][7].pieceName = "rook";
            pieceAll[7][7].dead = "0";
            pieceAll[7][7].position = "black";
            pieceAll[7][7].x = 2;
            pieceAll[7][7].y = 0;




        }
        static public int move(int givenx,int giveny,int movex,int movey){
                piece pieceslected = pieceAll[givenx][giveny];
                piece piecemove = pieceAll[movex][movey];
                if(pieceslected.position == "white" && turn=="white"){
                    if(pieceslected.pieceName == "pawn"){
                        if(piecemove.pieceName == "null"  && movey == (giveny + 1) && (movex == givenx)){
                            pieceslected.pieceName = "null";
                            pieceslected.position = "null"; 
                            pieceAll[movex][movey].pieceName = "pawn";
                            pieceAll[movex][movey].dead = "0";
                            pieceAll[movex][movey].position = "white";
                            pieceAll[movex][movey].x = 5;
                            pieceAll[movex][movey].y = 1;
                        }else if(piecemove.pieceName == "null" && giveny == (1) && movey == (giveny+2) && (movex == givenx)){
                            pieceslected.pieceName = "null";
                            pieceslected.position = "null";                            
                            pieceAll[movex][movey].pieceName = "pawn";
                            pieceAll[movex][movey].dead = "0";
                            pieceAll[movex][movey].position = "white";
                            pieceAll[movex][movey].x = 5;
                            pieceAll[movex][movey].y = 1;

                        }else if(piecemove.pieceName != "null" && piecemove.position == "black" && movey == giveny+1 && (movex == givenx+1 || movex == givenx - 1)){
                            pieceslected.pieceName = "null";
                            pieceslected.position = "null";
                            pieceAll[movex][movey].pieceName = "pawn";
                            pieceAll[movex][movey].dead = "0";
                            pieceAll[movex][movey].position = "white";
                            pieceAll[movex][movey].x = 5;
                            pieceAll[movex][movey].y = 1;
                        }else{
                            return -1;
                        }
                    }else if(pieceslected.pieceName == "rook"){
                        if(givenx == movex){
                            int k = 1;
                            if(movey > giveny){
                                k = 1;
                                for(int i = giveny+k; i < movey;i=i+k){
                                    if(pieceAll[movex][i].pieceName == "null"){
                                        System.out.println("hello123");
                                    }else{
                                        return -1;
                                    }
                                }
                                if(pieceAll[movex][movey].pieceName == "null" || pieceAll[movex][movey].position=="black"){

                                }else{
                                    return -1;
                                }
                                System.out.println("hello");
                            }else if(movey < giveny){
                                k = -1;
                                for(int i = giveny+k; i > movey;i=i+k){
                                    if(pieceAll[movex][i].pieceName == "null"){
                                        System.out.println("hello123");
                                    }else{
                                        return -1;
                                    }
                                }
                                if(pieceAll[movex][movey].pieceName == "null" || pieceAll[movex][movey].position=="black"){

                                }else{
                                    return -1;
                                }
                                System.out.println("hello");
                            }else{
                                return -1;
                            }

                            
                            pieceAll[movex][movey].pieceName = "rook";
                            pieceAll[movex][movey].dead = "0";
                            pieceAll[movex][movey].position = "white";
                            pieceAll[movex][movey].x = 2;
                            pieceAll[movex][movey].y = 1;
                            pieceslected.pieceName = "null";
                            pieceslected.position = "null";

                        }else if(giveny == movey){
                            int k = 1;
                            if(movex > givenx){
                                k = 1;
                                for(int i = givenx+k; i < movex;i=i+k){
                                    if(pieceAll[i][movey].pieceName == "null"){
                                        System.out.println("hello123");
                                    }else{
                                        return -1;
                                    }
                                }
                                if(pieceAll[movex][movey].pieceName == "null" || pieceAll[movex][movey].position=="black"){

                                }else{
                                    return -1;
                                }
                                System.out.println("hello");
                            }else if(movex < givenx){
                                k = -1;
                                if(movex < givenx){
                                    k = -1;
                                    for(int i = givenx+k; i > movex;i=i+k){
                                        if(pieceAll[i][movey].pieceName == "null"){
                                            System.out.println("hello123");
                                        }else{
                                            return -1;
                                        }
                                    }
                                    if(pieceAll[movex][movey].pieceName == "null" || pieceAll[movex][movey].position=="black"){
    
                                    }else{
                                        return -1;
                                    }
                                    System.out.println("hello");
                                }
                            }else{
                                return -1;
                            }

                            
                            pieceAll[movex][movey].pieceName = "rook";
                            pieceAll[movex][movey].dead = "0";
                            pieceAll[movex][movey].position = "white";
                            pieceAll[movex][movey].x = 2;
                            pieceAll[movex][movey].y = 1;
                            pieceslected.pieceName = "null";
                            pieceslected.position = "null";

                        }

                    }else if(pieceslected.pieceName == "bishop"){
                        int kx,ky=1;
                        if(movex < givenx && movey < giveny){
                            kx=-1;
                            ky=-1;
                           int j = givenx+kx;
                            int i = giveny+ky;
                            if(givenx - movex != giveny - movey){
                                System.out.println((givenx - movex)+" hello "+(movey - movex));
                                return -1;
                            }
                            while(j > movex){
                                if(pieceAll[j][i].pieceName=="null"){

                                }else{
                                    return -1;
                                }
                                j=j+kx;
                                i=i+ky;
                            }

                            System.out.println(i+" "+j);
                            if(pieceAll[j][i].pieceName == "null" || pieceAll[j][i].position == "black"){

                            }else{
                                return -1;
                            }
                            pieceslected.pieceName = "null";
                            pieceslected.position = "null";
                            pieceAll[movex][movey].pieceName = "bishop";
                            pieceAll[movex][movey].dead = "0";
                            pieceAll[movex][movey].position = "white";
                            pieceAll[movex][movey].x = 4;
                            pieceAll[movex][movey].y = 1;

                        }else if(movex > givenx && movey < giveny){
                            kx=1;
                            ky=-1;
                            int j = givenx+kx;
                            int i = giveny+ky;
                            if(movex - givenx != giveny - movey){
                                System.out.println((givenx - movex)+" hello "+(movey - movex));
                                return -1;
                            }
                            while(j < movex){
                                if(pieceAll[j][i].pieceName=="null"){

                                }else{
                                    return -1;
                                }
                                j=j+kx;
                                i=i+ky;
                            }

                            System.out.println(i+" "+j);
                            if(pieceAll[j][i].pieceName == "null" || pieceAll[j][i].position == "black"){

                            }else{
                                return -1;
                            }
                            pieceslected.pieceName = "null";
                            pieceslected.position = "null";
                            pieceAll[movex][movey].pieceName = "bishop";
                            pieceAll[movex][movey].dead = "0";
                            pieceAll[movex][movey].position = "white";
                            pieceAll[movex][movey].x = 4;
                            pieceAll[movex][movey].y = 1;
                            
                        }else if(movex < givenx && movey > giveny){
                            kx=-1;
                            ky=1;
                            int j = givenx+kx;
                            int i = giveny+ky;
                            if((givenx - movex) != (movey - giveny)){
                                System.out.println((givenx - movex)+" "+(movey - movex));
                                return -1;
                            }
                            while(j > movex){
                                if(pieceAll[j][i].pieceName=="null"){

                                }else{
                                    return -1;
                                }
                                j=j+kx;
                                i=i+ky;
                            }

                            
                            if(pieceAll[j][i].pieceName == "null" || pieceAll[j][i].position == "black"){

                            }else{
                                return -1;
                            }
                            pieceslected.pieceName = "null";
                            pieceslected.position = "null";
                            pieceAll[movex][movey].pieceName = "bishop";
                            pieceAll[movex][movey].dead = "0";
                            pieceAll[movex][movey].position = "white";
                            pieceAll[movex][movey].x = 4;
                            pieceAll[movex][movey].y = 1;
                            
                        }else if(movex > givenx && movey > giveny){
                            kx=1;
                            ky=1;
                            int j = givenx+kx;
                            int i = giveny+ky;
                            if(movex - givenx != movey - giveny){
                                System.out.println((givenx - movex)+" hello "+(movey - movex));
                                return -1;
                            }
                            while(j < movex){
                                if(pieceAll[j][i].pieceName=="null"){

                                }else{
                                    return -1;
                                }
                                j=j+kx;
                                i=i+ky;
                            }

                            System.out.println(i+" "+j);
                            if(pieceAll[j][i].pieceName == "null" || pieceAll[j][i].position == "black"){

                            }else{
                                return -1;
                            }
                            pieceslected.pieceName = "null";
                            pieceslected.position = "null";
                            pieceAll[movex][movey].pieceName = "bishop";
                            pieceAll[movex][movey].dead = "0";
                            pieceAll[movex][movey].position = "white";
                            pieceAll[movex][movey].x = 4;
                            pieceAll[movex][movey].y = 1;
                        }

                    }else if(pieceslected.pieceName == "knhight"){
                        if(((Math.abs(movex - givenx)== 1 && Math.abs(movey - giveny)==2) || (Math.abs(movex - givenx)== 2 && Math.abs(movey - giveny)==1)) && piecemove.position!="white"){
                            pieceslected.pieceName = "null";
                            pieceslected.position = "null";
                            pieceAll[movex][movey].pieceName = "knhight";
                            pieceAll[movex][movey].dead = "0";
                            pieceAll[movex][movey].position = "white";
                            pieceAll[movex][movey].x = 3;
                            pieceAll[movex][movey].y = 1;
                        }else{
                            System.out.println("hello");
                        }

                    }else if(pieceslected.pieceName == "queen"){
                        if(givenx == movex){
                            int k = 1;
                            if(movey > giveny){
                                k = 1;
                                for(int i = giveny+k; i < movey;i=i+k){
                                    if(pieceAll[movex][i].pieceName == "null"){
                                        System.out.println("hello123");
                                    }else{
                                        return -1;
                                    }
                                }
                                if(pieceAll[movex][movey].pieceName == "null" || pieceAll[movex][movey].position=="black"){

                                }else{
                                    return -1;
                                }
                                System.out.println("hello");
                            }else if(movey < giveny){
                                k = -1;
                                for(int i = giveny+k; i > movey;i=i+k){
                                    if(pieceAll[movex][i].pieceName == "null"){
                                        System.out.println("hello123");
                                    }else{
                                        return -1;
                                    }
                                }
                                if(pieceAll[movex][movey].pieceName == "null" || pieceAll[movex][movey].position=="black"){

                                }else{
                                    return -1;
                                }
                            }else{
                                return -1;
                            }

                            
                            pieceAll[movex][movey].pieceName = "queen";
                            pieceAll[movex][movey].dead = "0";
                            pieceAll[movex][movey].position = "white";
                            pieceAll[movex][movey].x = 0;
                            pieceAll[movex][movey].y = 1;
                            pieceslected.pieceName = "null";
                            pieceslected.position = "null";

                        }else if(giveny == movey){
                            int k = 1;
                            if(movex > givenx){
                                k = 1;
                                for(int i = givenx+k; i < movex;i=i+k){
                                    if(pieceAll[i][movey].pieceName == "null"){
                                    }else{
                                        return -1;
                                    }
                                }
                                if(pieceAll[movex][movey].pieceName == "null" || pieceAll[movex][movey].position=="black"){

                                }else{
                                    return -1;
                                }
                                System.out.println("hello");
                            }else if(movex < givenx){
                                k = -1;
                                if(movex < givenx){
                                    k = -1;
                                    for(int i = givenx+k; i > movex;i=i+k){
                                        if(pieceAll[i][movey].pieceName == "null"){
                                        }else{
                                            return -1;
                                        }
                                    }
                                    if(pieceAll[movex][movey].pieceName == "null" || pieceAll[movex][movey].position=="black"){
    
                                    }else{
                                        return -1;
                                    }

                                }
                            }else{
                                return -1;
                            }

                            
                            pieceAll[movex][movey].pieceName = "queen";
                            pieceAll[movex][movey].dead = "0";
                            pieceAll[movex][movey].position = "white";
                            pieceAll[movex][movey].x = 0;
                            pieceAll[movex][movey].y = 1;
                            pieceslected.pieceName = "null";
                            pieceslected.position = "null";

                        }else if(movex != givenx && movey != giveny){
                            int kx,ky=1;
                            if(movex < givenx && movey < giveny){
                                kx=-1;
                                ky=-1;
                               int j = givenx+kx;
                                int i = giveny+ky;
                                if(givenx - movex != giveny - movey){
                                    System.out.println((givenx - movex)+" hello "+(movey - movex));
                                    return -1;
                                }
                                while(j > movex){
                                    if(pieceAll[j][i].pieceName=="null"){
    
                                    }else{
                                        return -1;
                                    }
                                    j=j+kx;
                                    i=i+ky;
                                }
    
                                System.out.println(i+" "+j);
                                if(pieceAll[j][i].pieceName == "null" || pieceAll[j][i].position == "black"){
    
                                }else{
                                    return -1;
                                }
                                pieceslected.pieceName = "null";
                                pieceslected.position = "null";
                                pieceAll[movex][movey].pieceName = "queen";
                                pieceAll[movex][movey].dead = "0";
                                pieceAll[movex][movey].position = "white";
                                pieceAll[movex][movey].x = 0;
                                pieceAll[movex][movey].y = 1;
    
                            }else if(movex > givenx && movey < giveny){
                                kx=1;
                                ky=-1;
                                int j = givenx+kx;
                                int i = giveny+ky;
                                if(movex - givenx != giveny - movey){
                                    System.out.println((givenx - movex)+" hello "+(movey - movex));
                                    return -1;
                                }
                                while(j < movex){
                                    if(pieceAll[j][i].pieceName=="null"){
    
                                    }else{
                                        return -1;
                                    }
                                    j=j+kx;
                                    i=i+ky;
                                }
    
                                if(pieceAll[j][i].pieceName == "null" || pieceAll[j][i].position == "black"){
    
                                }else{
                                    return -1;
                                }
                                pieceslected.pieceName = "null";
                                pieceslected.position = "null";
                                pieceAll[movex][movey].pieceName = "queen";
                                pieceAll[movex][movey].dead = "0";
                                pieceAll[movex][movey].position = "white";
                                pieceAll[movex][movey].x = 0;
                                pieceAll[movex][movey].y = 1;
                                
                            }else if(movex < givenx && movey > giveny){
                                kx=-1;
                                ky=1;
                                int j = givenx+kx;
                                int i = giveny+ky;
                                if((givenx - movex) != (movey - giveny)){
                                    return -1;
                                }
                                while(j > movex){
                                    if(pieceAll[j][i].pieceName=="null"){
    
                                    }else{
                                        return -1;
                                    }
                                    j=j+kx;
                                    i=i+ky;
                                }
    
                                
                                if(pieceAll[j][i].pieceName == "null" || pieceAll[j][i].position == "black"){
    
                                }else{
                                    return -1;
                                }
                                pieceslected.pieceName = "null";
                                pieceslected.position = "null";
                                pieceAll[movex][movey].pieceName = "queen";
                                pieceAll[movex][movey].dead = "0";
                                pieceAll[movex][movey].position = "white";
                                pieceAll[movex][movey].x = 0;
                                pieceAll[movex][movey].y = 1;
                                
                            }else if(movex > givenx && movey > giveny){
                                kx=1;
                                ky=1;
                                int j = givenx+kx;
                                int i = giveny+ky;
                                if(movex - givenx != movey - giveny){
                                    System.out.println((givenx - movex)+" hello "+(movey - movex));
                                    return -1;
                                }
                                while(j < movex){
                                    if(pieceAll[j][i].pieceName=="null"){
    
                                    }else{
                                        return -1;
                                    }
                                    j=j+kx;
                                    i=i+ky;
                                }
    
                                System.out.println(i+" "+j);
                                if(pieceAll[j][i].pieceName == "null" || pieceAll[j][i].position == "black"){
    
                                }else{
                                    return -1;
                                }
                                pieceslected.pieceName = "null";
                                pieceslected.position = "null";
                                pieceAll[movex][movey].pieceName = "queen";
                                pieceAll[movex][movey].dead = "0";
                                pieceAll[movex][movey].position = "white";
                                pieceAll[movex][movey].x = 0;
                                pieceAll[movex][movey].y = 1;
                            }

                        }

                    }else if(pieceslected.pieceName == "king"){
                        if(((Math.abs(givenx - movex)==1 && (Math.abs(giveny - movey)==1 || Math.abs(giveny - movey)==0)) || (Math.abs(giveny - movey)==1 && (Math.abs(givenx - movex)==1 || Math.abs(givenx - movex)==0))) && piecemove.position!="white"){
                            pieceslected.pieceName = "null";
                            pieceslected.position = "null";
                            pieceAll[movex][movey].pieceName = "king";
                            pieceAll[movex][movey].dead = "0";
                            pieceAll[movex][movey].position = "white";
                            pieceAll[movex][movey].x = 1;
                            pieceAll[movex][movey].y = 1;
                        }

                    }
                    turn = "black";
                }else if(pieceslected.position == "black" && turn == "black"){
                    if(pieceslected.pieceName == "pawn"){
                        if(piecemove.pieceName == "null"  && movey == (giveny - 1) && (movex == givenx)){
                            pieceslected.pieceName = "null";
                            pieceslected.position = "null"; 
                            pieceAll[movex][movey].pieceName = "pawn";
                            pieceAll[movex][movey].dead = "0";
                            pieceAll[movex][movey].position = "black";
                            pieceAll[movex][movey].x = 5;
                            pieceAll[movex][movey].y = 0;
                        }else if(piecemove.pieceName == "null" && giveny == (6) && movey == (giveny-2) && (movex == givenx)){
                            pieceslected.pieceName = "null";
                            pieceslected.position = "null";                            
                            pieceAll[movex][movey].pieceName = "pawn";
                            pieceAll[movex][movey].dead = "0";
                            pieceAll[movex][movey].position = "black";
                            pieceAll[movex][movey].x = 5;
                            pieceAll[movex][movey].y = 0;

                        }else if(piecemove.position != "null" && piecemove.position == "white" && movey == giveny-1 && (movex == givenx+1 || movex == givenx - 1)){
                            pieceslected.pieceName = "null";
                            pieceslected.position = "null";
                            pieceAll[movex][movey].pieceName = "pawn";
                            pieceAll[movex][movey].dead = "0";
                            pieceAll[movex][movey].position = "black";
                            pieceAll[movex][movey].x = 5;
                            pieceAll[movex][movey].y = 0;
                        }else{
                            return -1;
                        }
                    }else if(pieceslected.pieceName == "rook"){
                        if(givenx == movex){
                            int k = 1;
                            if(movey > giveny){
                                k = 1;
                                for(int i = giveny+k; i < movey;i=i+k){
                                    if(pieceAll[movex][i].pieceName == "null"){
                                        System.out.println("hello123");
                                    }else{
                                        return -1;
                                    }
                                }
                                if(pieceAll[movex][movey].pieceName == "null" || pieceAll[movex][movey].position=="white"){

                                }else{
                                    return -1;
                                }
                                System.out.println("hello");
                            }else if(movey < giveny){
                                k = -1;
                                for(int i = giveny+k; i > movey;i=i+k){
                                    if(pieceAll[movex][i].pieceName == "null"){
                                        System.out.println("hello123");
                                    }else{
                                        return -1;
                                    }
                                }
                                if(pieceAll[movex][movey].pieceName == "null" || pieceAll[movex][movey].position=="white"){

                                }else{
                                    return -1;
                                }
                                System.out.println("hello");
                            }else{
                                return -1;
                            }

                            
                            pieceAll[movex][movey].pieceName = "rook";
                            pieceAll[movex][movey].dead = "0";
                            pieceAll[movex][movey].position = "white";
                            pieceAll[movex][movey].x = 2;
                            pieceAll[movex][movey].y = 0;
                            pieceslected.pieceName = "null";
                            pieceslected.position = "null";

                        }else if(giveny == movey){
                            int k = 1;
                            if(movex > givenx){
                                k = 1;
                                for(int i = givenx+k; i < movex;i=i+k){
                                    if(pieceAll[i][movey].pieceName == "null"){
                                        System.out.println("hello123");
                                    }else{
                                        return -1;
                                    }
                                }
                                if(pieceAll[movex][movey].pieceName == "null" || pieceAll[movex][movey].position=="white"){

                                }else{
                                    return -1;
                                }
                                System.out.println("hello");
                            }else if(movex < givenx){
                                k = -1;
                                if(movex < givenx){
                                    k = -1;
                                    for(int i = givenx+k; i > movex;i=i+k){
                                        if(pieceAll[i][movey].pieceName == "null"){
                                            System.out.println("hello123");
                                        }else{
                                            return -1;
                                        }
                                    }
                                    if(pieceAll[movex][movey].pieceName == "null" || pieceAll[movex][movey].position=="white"){
    
                                    }else{
                                        return -1;
                                    }
                                }
                            }else{
                                return -1;
                            }

                            
                            pieceAll[movex][movey].pieceName = "rook";
                            pieceAll[movex][movey].dead = "0";
                            pieceAll[movex][movey].position = "black";
                            pieceAll[movex][movey].x = 2;
                            pieceAll[movex][movey].y = 0;
                            pieceslected.pieceName = "null";
                            pieceslected.position = "null";

                        }

                    }else if(pieceslected.pieceName == "bishop"){
                        int kx,ky=1;
                        if(movex < givenx && movey < giveny){
                            kx=-1;
                            ky=-1;
                           int j = givenx+kx;
                            int i = giveny+ky;
                            if(givenx - movex != giveny - movey){
                                System.out.println((givenx - movex)+" hello "+(movey - movex));
                                return -1;
                            }
                            while(j > movex){
                                if(pieceAll[j][i].pieceName=="null"){

                                }else{
                                    return -1;
                                }
                                j=j+kx;
                                i=i+ky;
                            }

                            System.out.println(i+" "+j);
                            if(pieceAll[j][i].pieceName == "null" || pieceAll[j][i].position == "white"){

                            }else{
                                return -1;
                            }
                            pieceslected.pieceName = "null";
                            pieceslected.position = "null";
                            pieceAll[movex][movey].pieceName = "bishop";
                            pieceAll[movex][movey].dead = "0";
                            pieceAll[movex][movey].position = "white";
                            pieceAll[movex][movey].x = 4;
                            pieceAll[movex][movey].y = 0;

                        }else if(movex > givenx && movey < giveny){
                            kx=1;
                            ky=-1;
                            int j = givenx+kx;
                            int i = giveny+ky;
                            if(movex - givenx != giveny - movey){
                                System.out.println((givenx - movex)+" hello "+(movey - movex));
                                return -1;
                            }
                            while(j < movex){
                                if(pieceAll[j][i].pieceName=="null"){

                                }else{
                                    return -1;
                                }
                                j=j+kx;
                                i=i+ky;
                            }

                            System.out.println(i+" "+j);
                            if(pieceAll[j][i].pieceName == "null" || pieceAll[j][i].position == "white"){

                            }else{
                                return -1;
                            }
                            pieceslected.pieceName = "null";
                            pieceslected.position = "null";
                            pieceAll[movex][movey].pieceName = "bishop";
                            pieceAll[movex][movey].dead = "0";
                            pieceAll[movex][movey].position = "black";
                            pieceAll[movex][movey].x = 4;
                            pieceAll[movex][movey].y = 0;
                            
                        }else if(movex < givenx && movey > giveny){
                            kx=-1;
                            ky=1;
                            int j = givenx+kx;
                            int i = giveny+ky;
                            if((givenx - movex) != (movey - giveny)){
                                System.out.println((givenx - movex)+" "+(movey - movex));
                                return -1;
                            }
                            while(j > movex){
                                if(pieceAll[j][i].pieceName=="null"){

                                }else{
                                    return -1;
                                }
                                j=j+kx;
                                i=i+ky;
                            }

                            
                            if(pieceAll[j][i].pieceName == "null" || pieceAll[j][i].position == "white"){

                            }else{
                                return -1;
                            }
                            pieceslected.pieceName = "null";
                            pieceslected.position = "null";
                            pieceAll[movex][movey].pieceName = "bishop";
                            pieceAll[movex][movey].dead = "0";
                            pieceAll[movex][movey].position = "black";
                            pieceAll[movex][movey].x = 4;
                            pieceAll[movex][movey].y = 0;
                            
                        }else if(movex > givenx && movey > giveny){
                            kx=1;
                            ky=1;
                            int j = givenx+kx;
                            int i = giveny+ky;
                            if(movex - givenx != movey - giveny){
                                System.out.println((givenx - movex)+" hello "+(movey - movex));
                                return -1;
                            }
                            while(j < movex){
                                if(pieceAll[j][i].pieceName=="null"){

                                }else{
                                    return -1;
                                }
                                j=j+kx;
                                i=i+ky;
                            }

                            System.out.println(i+" "+j);
                            if(pieceAll[j][i].pieceName == "null" || pieceAll[j][i].position == "white"){

                            }else{
                                return -1;
                            }
                            pieceslected.pieceName = "null";
                            pieceslected.position = "null";
                            pieceAll[movex][movey].pieceName = "bishop";
                            pieceAll[movex][movey].dead = "0";
                            pieceAll[movex][movey].position = "black";
                            pieceAll[movex][movey].x = 4;
                            pieceAll[movex][movey].y = 0;
                        }

                    }else if(pieceslected.pieceName == "knhight"){
                        if(((Math.abs(movex - givenx)== 1 && Math.abs(movey - giveny)==2) || (Math.abs(movex - givenx)== 2 && Math.abs(movey - giveny)==1)) && piecemove.position!="black"){
                            pieceslected.pieceName = "null";
                            pieceslected.position = "null";
                            pieceAll[movex][movey].pieceName = "knhight";
                            pieceAll[movex][movey].dead = "0";
                            pieceAll[movex][movey].position = "black";
                            pieceAll[movex][movey].x = 3;
                            pieceAll[movex][movey].y = 0;
                        }else{
                            System.out.println("hello");
                        }

                    }else if(pieceslected.pieceName == "queen"){
                        if(givenx == movex){
                            int k = 1;
                            if(movey > giveny){
                                k = 1;
                                for(int i = giveny+k; i < movey;i=i+k){
                                    if(pieceAll[movex][i].pieceName == "null"){
                                        System.out.println("hello123");
                                    }else{
                                        return -1;
                                    }
                                }
                                if(pieceAll[movex][movey].pieceName == "null" || pieceAll[movex][movey].position=="white"){

                                }else{
                                    return -1;
                                }
                                System.out.println("hello");
                            }else if(movey < giveny){
                                k = -1;
                                for(int i = giveny+k; i > movey;i=i+k){
                                    if(pieceAll[movex][i].pieceName == "null"){
                                        System.out.println("hello123");
                                    }else{
                                        return -1;
                                    }
                                }
                                if(pieceAll[movex][movey].pieceName == "null" || pieceAll[movex][movey].position=="white"){

                                }else{
                                    return -1;
                                }
                                System.out.println("hello");
                            }else{
                                return -1;
                            }

                            
                            pieceAll[movex][movey].pieceName = "queen";
                            pieceAll[movex][movey].dead = "0";
                            pieceAll[movex][movey].position = "black";
                            pieceAll[movex][movey].x = 0;
                            pieceAll[movex][movey].y = 0;
                            pieceslected.pieceName = "null";
                            pieceslected.position = "null";

                        }else if(giveny == movey){
                            int k = 1;
                            if(movex > givenx){
                                k = 1;
                                for(int i = givenx+k; i < movex;i=i+k){
                                    if(pieceAll[i][movey].pieceName == "null"){
                                        System.out.println("hello123");
                                    }else{
                                        return -1;
                                    }
                                }
                                if(pieceAll[movex][movey].pieceName == "null" || pieceAll[movex][movey].position=="white"){

                                }else{
                                    return -1;
                                }
                                System.out.println("hello");
                            }else if(movex < givenx){
                                k = -1;
                                if(movex < givenx){
                                    k = -1;
                                    for(int i = givenx+k; i > movex;i=i+k){
                                        if(pieceAll[i][movey].pieceName == "null"){
                                            System.out.println("hello123");
                                        }else{
                                            return -1;
                                        }
                                    }
                                    if(pieceAll[movex][movey].pieceName == "null" || pieceAll[movex][movey].position=="white"){
    
                                    }else{
                                        return -1;
                                    }
                                    System.out.println("hello");
                                }
                            }else{
                                return -1;
                            }

                            
                            pieceAll[movex][movey].pieceName = "queen";
                            pieceAll[movex][movey].dead = "0";
                            pieceAll[movex][movey].position = "black";
                            pieceAll[movex][movey].x = 0;
                            pieceAll[movex][movey].y = 0;
                            pieceslected.pieceName = "null";
                            pieceslected.position = "null";

                        }else if(movex != givenx && movey != giveny){
                            int kx,ky=1;
                            if(movex < givenx && movey < giveny){
                                kx=-1;
                                ky=-1;
                               int j = givenx+kx;
                                int i = giveny+ky;
                                if(givenx - movex != giveny - movey){
                                    System.out.println((givenx - movex)+" hello "+(movey - movex));
                                    return -1;
                                }
                                while(j > movex){
                                    if(pieceAll[j][i].pieceName=="null"){
    
                                    }else{
                                        return -1;
                                    }
                                    j=j+kx;
                                    i=i+ky;
                                }
    
                                System.out.println(i+" "+j);
                                if(pieceAll[j][i].pieceName == "null" || pieceAll[j][i].position == "white"){
    
                                }else{
                                    return -1;
                                }
                                pieceslected.pieceName = "null";
                                pieceslected.position = "null";
                                pieceAll[movex][movey].pieceName = "queen";
                                pieceAll[movex][movey].dead = "0";
                                pieceAll[movex][movey].position = "black";
                                pieceAll[movex][movey].x = 0;
                                pieceAll[movex][movey].y = 0;
    
                            }else if(movex > givenx && movey < giveny){
                                kx=1;
                                ky=-1;
                                int j = givenx+kx;
                                int i = giveny+ky;
                                if(movex - givenx != giveny - movey){
                                    return -1;
                                }
                                while(j < movex){
                                    if(pieceAll[j][i].pieceName=="null"){
    
                                    }else{
                                        return -1;
                                    }
                                    j=j+kx;
                                    i=i+ky;
                                }
    

                                if(pieceAll[j][i].pieceName == "null" || pieceAll[j][i].position == "white"){
    
                                }else{
                                    return -1;
                                }
                                pieceslected.pieceName = "null";
                                pieceslected.position = "null";
                                pieceAll[movex][movey].pieceName = "queen";
                                pieceAll[movex][movey].dead = "0";
                                pieceAll[movex][movey].position = "black";
                                pieceAll[movex][movey].x = 0;
                                pieceAll[movex][movey].y = 0;
                                
                            }else if(movex < givenx && movey > giveny){
                                kx=-1;
                                ky=1;
                                int j = givenx+kx;
                                int i = giveny+ky;
                                if((givenx - movex) != (movey - giveny)){
                                    System.out.println((givenx - movex)+" "+(movey - movex));
                                    return -1;
                                }
                                while(j > movex){
                                    if(pieceAll[j][i].pieceName=="null"){
    
                                    }else{
                                        return -1;
                                    }
                                    j=j+kx;
                                    i=i+ky;
                                }
    
                                
                                if(pieceAll[j][i].pieceName == "null" || pieceAll[j][i].position == "white"){
    
                                }else{
                                    return -1;
                                }
                                pieceslected.pieceName = "null";
                                pieceslected.position = "null";
                                pieceAll[movex][movey].pieceName = "queen";
                                pieceAll[movex][movey].dead = "0";
                                pieceAll[movex][movey].position = "black";
                                pieceAll[movex][movey].x = 0;
                                pieceAll[movex][movey].y = 0;
                                
                            }else if(movex > givenx && movey > giveny){
                                kx=1;
                                ky=1;
                                int j = givenx+kx;
                                int i = giveny+ky;
                                if(movex - givenx != movey - giveny){
                                    return -1;
                                }
                                while(j < movex){
                                    if(pieceAll[j][i].pieceName=="null"){
    
                                    }else{
                                        return -1;
                                    }
                                    j=j+kx;
                                    i=i+ky;
                                }
    
                                System.out.println(i+" "+j);
                                if(pieceAll[j][i].pieceName == "null" || pieceAll[j][i].position == "white"){
    
                                }else{
                                    return -1;
                                }
                                pieceslected.pieceName = "null";
                                pieceslected.position = "null";
                                pieceAll[movex][movey].pieceName = "queen";
                                pieceAll[movex][movey].dead = "0";
                                pieceAll[movex][movey].position = "black";
                                pieceAll[movex][movey].x = 0;
                                pieceAll[movex][movey].y = 0;
                            }

                        }

                    }else if(pieceslected.pieceName == "king"){
                        if(((Math.abs(givenx - movex)==1 && (Math.abs(giveny - movey)==1 || Math.abs(giveny - movey)==0)) || (Math.abs(giveny - movey)==1 && (Math.abs(givenx - movex)==1 || Math.abs(givenx - movex)==0))) && piecemove.position!="black"){
                            pieceslected.pieceName = "null";
                            pieceslected.position = "null";
                            pieceAll[movex][movey].pieceName = "king";
                            pieceAll[movex][movey].dead = "0";
                            pieceAll[movex][movey].position = "black";
                            pieceAll[movex][movey].x = 1;
                            pieceAll[movex][movey].y = 0;
                        }

                    }
                    turn = "white";
                }
                return 0;
            }
    }
}