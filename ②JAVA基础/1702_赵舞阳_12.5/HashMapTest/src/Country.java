public class Country {
	String name;
	int people;

	public Country(String name, int people) {
		this.name = name;
		this.people = people;
	}

	@Override
	public String toString() {
		return "Country [name=" + name + ", people=" + people + "]";
	}
}
