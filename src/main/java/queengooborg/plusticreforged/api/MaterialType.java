package queengooborg.plusticreforged.api;

import java.util.Objects;

public class MaterialType {
	public String[] fallbacks = {"metal"};

	public MaterialType() {
		this(new String[]{"metal"});
	}

	public MaterialType(String[] fallbacks) {
		this.fallbacks = Objects.requireNonNull(fallbacks);
	}

	public static MaterialType METAL = new MaterialType();
	public static MaterialType GEM = new MaterialType(new String[]{"gem"});
	public static MaterialType POWDER = new MaterialType(new String[]{"powder"});
	public static MaterialType STONE = new MaterialType(new String[]{"stone", "wood", "stick"});
	public static MaterialType WOOD = new MaterialType(new String[]{"wood", "stick"});
}
