import static org.junit.Assert.assertEquals;

public class Tests {
	@org.junit.Test
	public void MallardQuack() {
		Mallard m = new Mallard();
		assertEquals("Quack!", m.quack() );
	}

	@org.junit.Test
	public void MallardSwim() {
		Mallard m = new Mallard();
		assertEquals("Swimming!", m.swim());
	}

	@org.junit.Test
	public void MallardDisplay() {
		Mallard m = new Mallard();
		assertEquals("Mallard", m.display());
	}

	@org.junit.Test
	public void MallardFly() {
		Mallard m = new Mallard();
		assertEquals("Fly away!", m.fly());
	}

	@org.junit.Test
	public void RedheadQuack() {
		Redhead r = new Redhead();
		assertEquals("Quack!", r.quack() );
	}

	@org.junit.Test
	public void RedheadSwim() {
		Redhead r = new Redhead();
		assertEquals("Swimming!", r.swim());
	}

	@org.junit.Test
	public void RedheadDisplay() {
		Redhead r = new Redhead();
		assertEquals("Redhead", r.display());
	}

	@org.junit.Test
	public void RedheadFly() {
		Redhead r = new Redhead();
		assertEquals("Fly away!", r.fly());
	}

	@org.junit.Test
	public void RubberQuack() {
		Rubber m = new Rubber();
		assertEquals("Squeak", m.quack() );
	}

	@org.junit.Test
	public void RubberSwim() {
		Rubber m = new Rubber();
		assertEquals("Swimming!", m.swim());
	}

	@org.junit.Test
	public void RubberDisplay() {
		Rubber m = new Rubber();
		assertEquals("Rubber", m.display());
	}

//	@org.junit.Test
//	public void RubberFly() {
//		Duck m = new Rubber();
//		assertEquals("No way", m.fly());
//	}

//	@org.junit.Test
//	public void DecoyQuack() {
//		Decoy m = new Decoy();
//		assertEquals("...", m.quack() );
//	}

	@org.junit.Test
	public void DecoySwim() {
		Decoy m = new Decoy();
		assertEquals("Swimming!", m.swim());
	}

	@org.junit.Test
	public void DecoyDisplay() {
		Decoy m = new Decoy();
		assertEquals("Decoy", m.display());
	}

//	@org.junit.Test
//	public void DecoyFly() {
//		Duck m = new Decoy();
//		assertEquals("No way", m.fly());
//	}
}
