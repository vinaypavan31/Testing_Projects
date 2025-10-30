package InterfaceEx;

public class AustrailianTraffic implements ContinentalTraffic,SeaTraffic {
	
	public static void main(String[] args) {
		AustrailianTraffic at=new AustrailianTraffic();
		
		//at.ausStop();
		at.redStop();
		at.greenGo();
		at.orangeWait();
		//SeaTraffic ct=new AustrailianTraffic();
		at.seaStop();
		
		
	}
	
	@Override
	public void redStop() {
		System.out.println("Continental Stop");
		
	}

	@Override
	public void greenGo() {
		
		System.out.println("Continental Go");
	}

	@Override
	public void orangeWait() {
		
		System.out.println("Continental Wait");
	}
	
	public void ausStop() {
		System.out.println("Austrailian Stop");
	}

	@Override
	public void seaStop() {
		// TODO Auto-generated method stub
		System.out.println("Sea Stop");
		
	}

	@Override
	public void seaGo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void seaWait() {
		// TODO Auto-generated method stub
		
	}
	
}
