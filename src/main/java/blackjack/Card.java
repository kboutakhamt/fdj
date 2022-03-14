package blackjack;

public class Card implements ICard {
	String value;
	int compteur;

	public Card(String value) {
		int i = 0;
		this.value = value;

		if (value.equals("1")) {
			this.value = "11";
		}

		else if (value.equals("10")) {
			this.compteur = i + 1;
		}

		else if (value.equals("A")) {
			this.value = "11";
			this.compteur = i + 1;
		}

		else if (value.equals("J")) {
			this.value = "10";
			this.compteur = i + 1;
		}

		else if (value.equals("Q")) {
			this.value = "10";
			this.compteur = i + 1;
		}

		else if (value.equals("K")) {
			this.value = "10";
			this.compteur = i + 1;
		}

		else if (value.equals("R")) {
			this.value = "10";
		}
	}

	public int getCompteur() {
		return compteur;
	}

	public int getPoints() {
		return Integer.valueOf(this.value);
	}
}
