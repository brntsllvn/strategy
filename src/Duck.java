public abstract class Duck {
	public String quack() {
		return "Quack!";
	}

	public String swim() {
		return "Swimming!";
	}

	public String fly() {
		return "Fly away!";
	}

	abstract public String display();

}

class Mallard extends Duck {
	@Override
	public String display() {
		return "Mallard";
	}
}

class Redhead extends Duck {
	@Override
	public String display() {
		return "Redhead";
	}
}

class Rubber extends Duck {
	@Override
	public String quack() {
		return "Squeak";
	}

	@Override
	public String display() {
		return "Rubber";
	}

	@Override
	public String fly() {
		return "No way";
	}
}

class Decoy extends Duck {
	@Override
	public String quack() {
		return "...";
	}

	@Override
	public String display() {
		return "Decoy";
	}

	@Override
	public String fly() {
		return "No way";
	}
}