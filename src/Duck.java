public abstract class Duck {
	FlyBehavior fb;
	QuackBehavior qb;

	public String performFly() {
		return fb.fly();
	}

	public String performQuack() {
		return qb.quack();
	}

	public String swim() {
		return "Swimming!";
	}
	public abstract String display();
}

interface FlyBehavior {
	String fly();
}
class FlyWithWings implements FlyBehavior {
	public String fly() {
		return "Fly away!";
	}
}
class FlyNoWay implements FlyBehavior {
	public String fly() {
		return "No way";
	}
}

interface QuackBehavior {
	String quack();
}
class Quack implements QuackBehavior {
	public String quack() {
		return "Quack!";
	}
}
class Squeak implements QuackBehavior {
	public String quack() {
		return "Squeak";
	}
}
class MuteQuack implements QuackBehavior {
	public String quack() {
		return "...";
	}
}

class Mallard extends Duck {
	public Mallard(FlyBehavior fb, QuackBehavior qb) {
		this.fb = fb;
		this.qb = qb;
	}

	@Override
	public String display() {
		return "Mallard";
	}
}

class Redhead extends Duck {
	public Redhead(FlyBehavior fb, QuackBehavior qb) {
		this.fb = fb;
		this.qb = qb;
	}

	@Override
	public String display() {
		return "Redhead";
	}
}

class Rubber extends Duck {
	public Rubber(FlyBehavior fb, QuackBehavior qb) {
		this.fb = fb;
		this.qb = qb;
	}

	@Override
	public String display() {
		return "Rubber";
	}
}

class Decoy extends Duck {
	public Decoy(FlyBehavior fb, QuackBehavior qb) {
		this.fb = fb;
		this.qb = qb;
	}

	@Override
	public String display() {
		return "Decoy";
	}
}