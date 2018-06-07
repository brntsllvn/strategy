import static org.junit.Assert.assertEquals;

public class Tests {
	@org.junit.Test
	public void MallardQuack() {
		Duck m = new Mallard();
		assertEquals("Quack!", m.quack() );
	}

	@org.junit.Test
	public void MallardSwim() {
		Duck m = new Mallard();
		assertEquals("Swimming!", m.swim());
	}

	@org.junit.Test
	public void MallardDisplay() {
		Duck m = new Mallard();
		assertEquals("Mallard", m.display());
	}

	@org.junit.Test
	public void MallardFly() {
		Duck m = new Mallard();
		assertEquals("Fly away!", m.fly());
	}

	@org.junit.Test
	public void RedheadQuack() {
		Duck r = new Redhead();
		assertEquals("Quack!", r.quack() );
	}

	@org.junit.Test
	public void RedheadSwim() {
		Duck r = new Redhead();
		assertEquals("Swimming!", r.swim());
	}

	@org.junit.Test
	public void RedheadDisplay() {
		Duck r = new Redhead();
		assertEquals("Redhead", r.display());
	}

	@org.junit.Test
	public void RedheadFly() {
		Duck r = new Redhead();
		assertEquals("Fly away!", r.fly());
	}

	@org.junit.Test
	public void RubberQuack() {
		Duck m = new Rubber();
		assertEquals("Squeak", m.quack() );
	}

	@org.junit.Test
	public void RubberSwim() {
		Duck m = new Rubber();
		assertEquals("Swimming!", m.swim());
	}

	@org.junit.Test
	public void RubberDisplay() {
		Duck m = new Rubber();
		assertEquals("Rubber", m.display());
	}

	@org.junit.Test
	public void RubberFly() {
		Duck m = new Rubber();
		assertEquals("No way", m.fly());
	}

	@org.junit.Test
	public void DecoyQuack() {
		Duck m = new Decoy();
		assertEquals("...", m.quack() );
	}

	@org.junit.Test
	public void DecoySwim() {
		Duck m = new Decoy();
		assertEquals("Swimming!", m.swim());
	}

	@org.junit.Test
	public void DecoyDisplay() {
		Duck m = new Decoy();
		assertEquals("Decoy", m.display());
	}

	@org.junit.Test
	public void DecoyFly() {
		Duck m = new Decoy();
		assertEquals("No way", m.fly());
	}
}
