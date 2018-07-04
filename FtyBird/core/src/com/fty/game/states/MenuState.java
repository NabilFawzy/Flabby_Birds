package com.fty.game.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.fty.game.Ftyflabby;

public class MenuState extends state {
    private Texture background;
    private Texture btnplay;
    public MenuState(GameStateManager gsm) {
        super(gsm);
        cam.setToOrtho(false, Ftyflabby.WIDTH/2,Ftyflabby.HEIGHT/2);//help in phone
        background=new Texture("bg.png");
        btnplay=new Texture("playbtn.png");
    }

    @Override
    public void handleInput() {
      if(Gdx.input.justTouched()){dispose();
          gsm.push(new PlayState(gsm));

      }
    }

    @Override
    public void update(float dt) {
    handleInput();
    }

    @Override
    public void reneder(SpriteBatch sb) {
        sb.setProjectionMatrix(cam.combined);
     sb.begin();
     sb.draw(background,0,0);
        sb.draw(btnplay,cam.position.x-btnplay.getWidth()/2,cam.position.y);
        sb.end();
    }

    @Override
    public void dispose() {
        background.dispose();
        btnplay.dispose();
    }
}
