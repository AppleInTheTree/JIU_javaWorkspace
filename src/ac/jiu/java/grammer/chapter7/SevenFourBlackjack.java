package ac.jiu.java.grammer.chapter7;

public class SevenFourBlackjack {

    // 카드를 만들고 번호를 만들고 카드를 섞는다
    public static void main(String[] args) {

        int[] deck = new int[52];

        String[] properties = {"Spade", "Heart", "Diamond", "Club"};
        String[] cardClasses= {"Ace", "1", "2", "3", "4", "5", "6", "7", "8", "9", "Jack", "Queen", "King"};

        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }

        // 13씩 Spades, Hearts, Diamonds, Clubs
        // 0 Ace 10 Jack 11 Queen 12 King

        // Shuffling the cards
        for (int i = 0; i < deck.length; i++) {
            int random = (int) (Math.random() * (deck.length - 1));
            int temp = deck[i];
            deck[i] = deck[random];
            deck[random] = temp;
        }

        for (int i = 0; i < 4; i++) {

            String property = properties[deck[i] / 13];
            String cardClass = cardClasses[deck[i] % 13];
            System.out.println("Card number " + deck[i] + " : " + cardClass + " of " + property);
        }


    }
}
