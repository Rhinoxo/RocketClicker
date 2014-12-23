package com.rhinoxo.rocketclicker;

import com.badlogic.gdx.*;
import com.badlogic.gdx.graphics.*;
import com.badlogic.gdx.graphics.g2d.*;

public class MyGdxGame implements ApplicationListener
{
	Texture texture1;
	Texture texture2;
	SpriteBatch batch;

	@Override
	public void create()
	{
		texture1 = new Texture (Gdx.files.internal("rocket.jpg"));
		texture2 = new Texture(Gdx.files.internal("android.jpg"));
		batch = new SpriteBatch();
	}

	@Override
	public void render()
	{        
	    Gdx.gl.glClearColor(1, 1, 1, 1);
	    Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(texture1, Gdx.graphics.getWidth() / 4, 0, 
				   Gdx.graphics.getWidth() / 2, Gdx.graphics.getWidth() / 2);
		batch.draw(texture2, Gdx.graphics.getWidth() / 4, 0,
				Gdx.graphics.getWidth() / 2, Gdx.graphics.getWidth() / 2);
		batch.end();
	}

	@Override
	public void dispose()
	{
	}

	@Override
	public void resize(int width, int height)
	{
	}

	@Override
	public void pause()
	{
	}

	@Override
	public void resume()
	{
	}
}