abstract class Bike {
	abstract void speed();
}
abstract class Pulsar extends Bike {
	
	void color() {
		System.out.println("Red");
	}
}
class Honda extends Bike {
	@Override
	void speed() {
		System.out.println("50km/hr");
	}
	void color() {
		System.out.println("Black");
	}
}
class AbstractTest {
	public static void main(String args[]) {
	Honda hh = new Honda();hh.color();hh.speed();
	//Pulsar pu = new Pulsar(); pu.color(); pu.speed();
	}
}