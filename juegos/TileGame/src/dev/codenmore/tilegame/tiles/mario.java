package dev.codenmore.tilegame.tiles;
import dev.codenmore.tilegame.gfx.Assets;

public class mario extends Tile {

	public mario(int id){
		
		super(Assets.mario, id);
	}
	public boolean isSolid(){
		return true;
	}
}
