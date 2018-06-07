import static org.junit.Assert.assertEquals;

public class Tests {
	@org.junit.Test
	public void FlyWithWings() {
		FlyBehavior fb = new FlyWithWings();
		assertEquals("Fly away!", fb.fly());
	}

	@org.junit.Test
	public void FlyNoWay() {
		FlyBehavior fb = new FlyNoWay();
		assertEquals("No way", fb.fly());
	}

	@org.junit.Test
	public void Quack() {
		QuackBehavior qb = new Quack();
		assertEquals("Quack!", qb.quack());
	}

	@org.junit.Test
	public void Squeak() {
		QuackBehavior qb = new Squeak();
		assertEquals("Squeak", qb.quack());
	}

	@org.junit.Test
	public void MuteQuack() {
		QuackBehavior qb = new MuteQuack();
		assertEquals("...", qb.quack());
	}

	@org.junit.Test
	public void MallardQuack() {
		Duck m = new Mallard(new FlyWithWings(), new Quack());
		assertEquals("Quack!", m.performQuack());
	}

	@org.junit.Test
	public void MallardSwim() {
		Duck m = new Mallard(new FlyWithWings(), new Quack());
		assertEquals("Swimming!", m.swim());
	}

	@org.junit.Test
	public void MallardDisplay() {
		Duck m = new Mallard(new FlyWithWings(), new Quack());
		assertEquals("Mallard", m.display());
	}

	@org.junit.Test
	public void MallardFly() {
		Duck m = new Mallard(new FlyWithWings(), new Quack());
		assertEquals("Fly away!", m.performFly());
	}

	@org.junit.Test
	public void RedheadQuack() {
		Redhead r = new Redhead(new FlyWithWings(), new Quack());
		assertEquals("Quack!", r.performQuack() );
	}

	@org.junit.Test
	public void RedheadSwim() {
		Redhead r = new Redhead(new FlyWithWings(), new Quack());
		assertEquals("Swimming!", r.swim());
	}

	@org.junit.Test
	public void RedheadDisplay() {
		Redhead r = new Redhead(new FlyWithWings(), new Quack());
		assertEquals("Redhead", r.display());
	}

	@org.junit.Test
	public void RedheadFly() {
		Redhead r = new Redhead(new FlyWithWings(), new Quack());
		assertEquals("Fly away!", r.performFly());
	}

	@org.junit.Test
	public void RubberQuack() {
		Rubber m = new Rubber(new FlyNoWay(), new Squeak());
		assertEquals("Squeak", m.performQuack() );
	}

	@org.junit.Test
	public void RubberSwim() {
		Rubber m = new Rubber(new FlyNoWay(), new Squeak());
		assertEquals("Swimming!", m.swim());
	}

	@org.junit.Test
	public void RubberDisplay() {
		Rubber m = new Rubber(new FlyNoWay(), new Squeak());
		assertEquals("Rubber", m.display());
	}

	@org.junit.Test
	public void RubberFly() {
		Duck m = new Rubber(new FlyNoWay(), new Squeak());
		assertEquals("No way", m.performFly());
	}

	@org.junit.Test
	public void DecoyQuack() {
		Decoy m = new Decoy(new FlyNoWay(), new MuteQuack());
		assertEquals("...", m.performQuack() );
	}

	@org.junit.Test
	public void DecoySwim() {
		Decoy m = new Decoy(new FlyNoWay(), new MuteQuack());
		assertEquals("Swimming!", m.swim());
	}

	@org.junit.Test
	public void DecoyDisplay() {
		Decoy m = new Decoy(new FlyNoWay(), new MuteQuack());
		assertEquals("Decoy", m.display());
	}

	@org.junit.Test
	public void DecoyFly() {
		Duck m = new Decoy(new FlyNoWay(), new MuteQuack());
		assertEquals("No way", m.performFly());
	}
}
