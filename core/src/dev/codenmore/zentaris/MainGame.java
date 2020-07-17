package dev.codenmore.zentaris;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;

public class MainGame extends ApplicationAdapter {
	SpriteBatch batch;
	TextureAtlas atlas;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		atlas = new TextureAtlas("textures.atlas");
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		batch.begin();
		batch.draw(atlas.findRegions("player/attack").get(1), 0, 0);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		atlas.dispose();
	}

}
