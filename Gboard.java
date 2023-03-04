package com.chess.ghraphics;
import java.awt.*;
import java.awt.Color;
import java.awt.event.*;
import java.awt.Graphics2D;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.plaf.DimensionUIResource;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.*;
import com.chess.engine.Board.*;

public class Gboard extends JPanel{
    final int width = 800;
    final int height = width;
    BufferedImage pieces = null;
    File chessimages = new File("icons/chess.png");
    static int px=0,py=0,colorx=255,colory=255,changedg=-1;
    piece[][] pieceAll = null;
    Gboard(){
        this.setPreferredSize(new DimensionUIResource(width, height));

        try{
            pieces = ImageIO.read(chessimages);
        }catch(IOException e) {
            e.printStackTrace();
        }
        
        BufferedImage buffered = (BufferedImage) pieces;
        //buffered = buffered.getSubimage(0, 0, 60, 60);
        pieces = buffered;
        this.setBackground(Color.BLACK);
    }

    public void paint(Graphics g){
        super.paint(g);
        Color black = new Color(125,148,93);
        Color white = new Color(238,238,213);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.RED);
        int order=1;
        for(int i=0; i<8;i++){
            for(int j=0;j<8;j++){
                if(order == 1){
                    g2d.setColor(white);
                    order=0;
                }else if(order == 0){
                    g2d.setColor(black);
                    order=1;
                }
                if(colorx == (j) && colory == (i) && changedg==2){
                    g2d.setColor(Color.GREEN);
                }
                g2d.fillRect(j*(width/8), i*(height/8), (width/8), (height/8));
            }
            if(order == 1){
                order = 0;
            }else{
                order = 1;
            }
        }
        if(pieceAll != null){
            for(int i=0;i<=7;i++){
                for(int j=0;j<=7;j++){
                    if(pieceAll[j][i].pieceName != "null"){
                        g.drawImage(pieces.getSubimage(pieceAll[j][i].x*320, pieceAll[j][i].y*320, 320, 320), (7-j)*100, (7-i)*100, 100,100,null);
                    }                 
                }
            }

        }
    }
    public void changed(piece[][] chpiece,int x,int y,int changed){
        changedg = changed;
        colorx = x/100;
        colory = y/100;
        pieceAll = chpiece;
        this.repaint();
    }
}
