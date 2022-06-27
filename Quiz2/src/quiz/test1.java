package quiz;

public class test1 {
	private String name;

	public test1(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name == null) {
			name = name.toUpperCase();
		}
		this.name = name;
	}

	@Override
	public String toString() {
		return "test1 [name=" + name + "]";
	}
	
	
}
