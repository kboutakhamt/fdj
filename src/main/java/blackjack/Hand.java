package blackjack;

public class Hand implements IHand {

	private int points;
	private boolean isBusted;
	private int compteur;

	public Hand(ICard firstCard, ICard secondCard) {
		this.points = firstCard.getPoints() + secondCard.getPoints();
		this.compteur = firstCard.getCompteur() + secondCard.getCompteur();
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public boolean isBusted() {
		return isBusted;
	}

	public void setBusted(boolean isBusted) {
		this.isBusted = isBusted;
	}

	public int getCompteur() {
		return compteur;
	}

	public void setCompteur(int compteur) {
		this.compteur = compteur;
	}

	public void addCard(ICard card) {
		this.points = this.getPoints() + card.getPoints();
	}

	public boolean isBlackJack() {
		boolean isBlackJack = false;
		if (21 == this.getPoints() && 2 <= this.getCompteur()) {
			isBlackJack = true;
		} else if (21 < this.getPoints()) {
			this.setBusted(true);
		}
		return isBlackJack;
	}

}
