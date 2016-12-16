package fcu.iecs.oop.pokemon;

public abstract class Pokemon{

	public final String name;
	private final PokemonType type;
	public int cp;
	
	public Pokemon(String name, PokemonType type, int cp) {
		this.name = name;
		this.type = type;
		this.cp = cp;
	}
	
	public abstract void attack();

	public int getCp() {
		return cp;
	}

	public void setCp(int cp) {
		this.cp = cp;
	}

	public String getName() {
		return name;
	}

	public PokemonType getType() {
		return type;
	}
}
