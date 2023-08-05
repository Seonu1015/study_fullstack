package CardGame;

public class Computer {

    String[] cards;
    int[] cardIndexList;
    int currentIndex;

    Computer() {
        cards = new String[]{"거지", "시민", "귀족", "왕"};
        cardIndexList = new int[cards.length];
        for (int i = 0; i < cards.length; i++) {
            cardIndexList[i] = i;
        }
        currentIndex = 0;
    }
    
    String getComputerCard() {
        if (currentIndex >= cardIndexList.length) {
            return null;
        }

        int randomIndex = currentIndex + (int) (Math.random() * (cardIndexList.length - currentIndex));
        int cardIndex = cardIndexList[randomIndex];
        // Swap the selected index with the current index
        int temp = cardIndexList[currentIndex];
        cardIndexList[currentIndex] = cardIndex;
        cardIndexList[randomIndex] = temp;

        currentIndex++;
        return cards[cardIndex];
    }
}