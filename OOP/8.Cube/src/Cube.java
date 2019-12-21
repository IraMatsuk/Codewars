class Test {
	public static void FixedTest()
	{
		Cube c = new Cube();
		System.out.println(c.GetSide());
		c.SetSide(5);
		System.out.println(c.GetSide());
	}
}

public class Cube {
	public static void main(String[] args) {
		Test.FixedTest();
	}
	public int GetSide() {
		return this.Side;
	}
	
	public void SetSide(int num) {
		this.Side = num;
	}
	
	private int Side = 0;
}
