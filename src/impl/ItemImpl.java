package impl;

import service.ItemType;

public class ItemImpl {
	private int id;
	private ItemType type;
	private int x;
	private int y;
	public static int cptId = 0;

	public ItemImpl(ItemType t, int i, int j) {
		id = cptId++;
		type = t;
		x = i;
		y = j;
	}

	public int getId() {
		return id;
	}

	public ItemType getType() {
		return type;
	}

	public int getWdt() {
		return x;
	}

	public int getHgt() {
		return y;
	}
}
