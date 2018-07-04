package com.fty.game.states;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.Stack;
public class GameStateManager {
    private Stack<state> states;

    public GameStateManager(){
        states=new Stack<state>();
    }
    public void push(state mstate){
        states.push(mstate);
    }
    public void pop(){
        states.pop().dispose();
    }
   public void set(state mstate){
        pop();
        push(mstate);
   }
   public void update(float dt){

        states.peek().update(dt);
   }
   public void render(SpriteBatch sb){

        states.peek().reneder(sb);
   }




}
