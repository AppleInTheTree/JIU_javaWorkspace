package ac.jiu.java.grammer.chapter7;

public class BlackjackPractice {

    // 13까지 스페이드, 25까지 하트, 38까지 다이아, 51까지 클로버
    // 카드를 셔플하고 4장으로 위에서부터 뽑는다


    public static void main(String[] args) {

        int[] deck = new int[52];
        String[] properties = {"Spades", "Hearts", "Diamonds", "Clovers"};
        String[] ranks = {"Ace", "1", "2", "3", "4", "5", "6", "7", "8", "9", "Jack", "Queen", "King"};
        //Shuffle cards
        int [] shuffleDeck = shuffle(deck);

        // Display random shuffle cards
        for (int i = 0; i < 4; i++) {
            int randomNum = (int) (Math.random() * (shuffleDeck.length -1));
            System.out.println("Card number " + randomNum + " : " + ranks[randomNum % 13] + " of " + properties[randomNum / 13]);
        }




    }

    public static int[] shuffle(int[] deck) {
        for (int i = 0; i < deck.length; i++) {
            int randomNum = (int) (Math.random() * (deck.length -1));
            int temp = deck[i];
            deck[i] = deck[randomNum];
            deck[randomNum] = temp;
        }
        return deck;
    }
}
