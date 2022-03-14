package blackjack;

public interface IHand {
	int getPoints();

	void setPoints(int addCard);

	void addCard(ICard thirdCard);

	boolean isBlackJack();

	boolean isBusted();

}
