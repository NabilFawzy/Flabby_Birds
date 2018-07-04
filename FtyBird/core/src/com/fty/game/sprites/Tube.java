package com.fty.game.sprites;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

import java.util.Random;

public class Tube {
    public static final int TUBE_WIDTH=50;
    private static final int FLACTIATION=120;
    private static final int TUBE_GAP=100;
    private static final int LOWEST_OPENING=130;
    private Texture topTube,bottomTube;
    private Vector2 posTopTube,posBotTube;
    private Rectangle boundsTop,boundsBot;
    private Random random;
    public Tube(float x){
        topTube=new Texture("toptube.png");
        bottomTube=new Texture("bottomtube.png");
        random=new Random();
        posTopTube=new Vector2(x,random.nextInt(FLACTIATION)+TUBE_GAP+LOWEST_OPENING);
        posBotTube=new Vector2(x,posTopTube.y-TUBE_GAP-bottomTube.getHeight());

        boundsTop=new Rectangle(posTopTube.x,posTopTube.y,topTube.getWidth(),topTube.getHeight());
        boundsBot=new Rectangle(posBotTube.x,posBotTube.y,bottomTube.getWidth(),bottomTube.getHeight());
    }

    public Texture getTopTube() {
        return topTube;
    }

    public Texture getBottomTube() {
        return bottomTube;
    }

    public Vector2 getPosTopTube() {
        return posTopTube;
    }

    public Vector2 getPosBotTube() {
        return posBotTube;
    }
    public void reposition(float x){
        posTopTube.set(x,random.nextInt(FLACTIATION)+TUBE_GAP+LOWEST_OPENING);
        posBotTube.set(x,posTopTube.y-TUBE_GAP-bottomTube.getHeight());
        boundsTop.setPosition(posTopTube.x,posTopTube.y);
        boundsBot.setPosition(posBotTube.x,posBotTube.y);
    }
    public Boolean collides(Rectangle player){
        if(player.overlaps(boundsTop)||player.overlaps(boundsBot)){
            return true;
        }
        return false;
    }
    public void dispose(){
        topTube.dispose();
        bottomTube.dispose();
    }
}
