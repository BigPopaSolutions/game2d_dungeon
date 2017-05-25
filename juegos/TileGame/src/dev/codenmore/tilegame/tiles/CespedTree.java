package dev.codenmore.tilegame.tiles;

import dev.codenmore.tilegame.gfx.Assets;

public class CespedTree extends Tile{

	public CespedTree(int id) {
		super(Assets.cespedtree, id);
	}
	public boolean isSolid(){
		return true;
	}
}
