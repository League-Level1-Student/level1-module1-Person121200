package _07_duck;

public class Runner {
	public static void main(String[] args) {
		Duck daffy = new Duck("donuts",5);
		daffy.quack();
		daffy.waddle();
		GuineaPig Legend = new GuineaPig("Iceberg lettuce", 0);
		Legend.weak();
		Legend.bite();
	}
}
