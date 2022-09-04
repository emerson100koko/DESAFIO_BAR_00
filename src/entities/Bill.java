package entities;

public class Bill {

	public static double couvert = 4.0;

	public char gender;
	public int beer;
	public int barbecue;
	public int softDrink;

	public double cover() {
		return couvert;
	}

	public double ticket() {
		if (this.gender == 'M') {
			return 10.00;
		} else {
			return 8.00;
		}
	}

	public double feeding() {
		double beer = this.beer * 5.0;
		double softDrink = this.softDrink * 3.0;
		double barbecue = this.barbecue * 7.0;
		return beer + softDrink + barbecue;
	}

	public double total() {
		if (feeding() > 30.0) {
			return feeding() + ticket();
		}
		else {
			return feeding() + cover() + ticket();
		}
	}
}
