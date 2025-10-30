package abstractionclass;

public class ChildEmirates extends ParentAirCraft {

	public static void main(String[] args) {
		ChildEmirates c=new ChildEmirates();
		c.engine();
		c.safetyGuidelines();
		c.bodyColor();
		
		
	}

	@Override
	public void bodyColor() {
		System.out.println("red color on the body");
		
	}

}
