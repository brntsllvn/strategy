public abstract class Duck {
	public String swim() {
		return "Swimming!";
	}
	public abstract String display();
}

interface Flyable {
	String fly();
}
interface Quackable {
	String quack();
}

class Mallard extends Duck implements Flyable, Quackable {
	@Override
	public String display() {
		return "Mallard";
	}

	@Override
	public String fly() {
		return "Fly away!";
	}

	public String quack() {
		return "Quack!";
	}
}

class Redhead extends Duck implements Flyable, Quackable {
	@Override
	public String display() {
		return "Redhead";
	}

	public String fly() {
		return "Fly away!";
	}

	public String quack() {
		return "Quack!";
	}
}

class Rubber extends Duck implements Quackable {
	public String quack() {
		return "Squeak";
	}

	@Override
	public String display() {
		return "Rubber";
	}
}

class Decoy extends Duck {
	@Override
	public String display() {
		return "Decoy";
	}
}