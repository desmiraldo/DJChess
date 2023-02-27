package com.chess.ghraphics;
import java.awt.*;
import com.chess.ghraphics.Gboard;
import javax.swing.JFrame;

import com.chess.engine.GameEvents;
import com.chess.engine.Board.*;
import java.awt.event.*;
import com.chess.engine.GameEvents.*;

public class graph extends JFrame implements MouseListener{
    Gboard panel;
    public piece[][] gamePointer;
    public GameEvents gameEvents;
    public graph(piece[][] chpiece){
        panel = new Gboard();
        panel.addMouseListener(this);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.gamePointer = chpiece;
        this.gameEvents = new GameEvents();    
    }

    public void changed(){
        panel.changed(gamePointer,255,255,-1);
    }

    @Override
    public void mouseClicked(MouseEvent e){
        panel.changed(gamePointer,e.getX(),e.getY(),GameEvents.setevent(e.getX(),e.getY()));
    }
    @Override
    public void mousePressed(MouseEvent e){
        
    }
    @Override
    public void mouseReleased (MouseEvent e){
        
    }
    @Override
    public void mouseEntered(MouseEvent e){
        
    }
    @Override
    public void mouseExited(MouseEvent e){

    }
}