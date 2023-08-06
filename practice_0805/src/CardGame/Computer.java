package CardGame;

public class Computer {

    String[] cards;
    int[] cardIndexList;
    int index;

    Computer() {
        cards = new String[]{"거지", "시민", "귀족", "왕"};
        cardIndexList = new int[cards.length];
        for (int i = 0; i < cards.length; i++) {
            cardIndexList[i] = i;
        }
        index = 0;
    }
    
    String getComputerCard() {

    	// i가 0인 경우 배열의 4칸을 고려해서 랜덤한 인덱스를 선택해 반환하고
    	// i가 1이 되면 첫 칸은 제외하고 남은 3칸에서 랜덤한 인덱스를 선택해 반환하게
    	// 이때까지 썼던 (int)(Math.random()*4) 를 그대로 사용하게 되면
    	// i가 0~3까지 진행되는 동안 계속 4개의 숫자를 뽑게 되므로 중복이 발생
    	// 앞서 뽑은 숫자는 그대로 고정시키면 중복이 발생하지 않음
    	
        int randomIndex = index + (int) (Math.random() * (cardIndexList.length - index));
        int cardIndex = cardIndexList[randomIndex];
        
        cardIndexList[randomIndex] = cardIndexList[index];
        cardIndexList[index] = cardIndex;

        index++;
        return cards[cardIndex];
    }
}