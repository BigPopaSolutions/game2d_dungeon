package dev.codenmore.tilegame.states;

import java.awt.Graphics;

import dev.codenmore.tilegame.Handler;
import dev.codenmore.tilegame.worlds.World;

public class GameState extends State {
	
	private World world;
	private String RutaMapa;
	
	public GameState(Handler handler, String RutaMapa){
		super(handler);
		world = new World(handler, RutaMapa);
		handler.setWorld(world);
	}
	
	@Override
	public void tick() {
		world.tick();
	}

	@Override
	public void render(Graphics g) {
		world.render(g);
	}

	public String getRutaMapa() {
		return RutaMapa;
	}

	public void setRutaMapa(String rutaMapa) {
		RutaMapa = rutaMapa;
	}
}
