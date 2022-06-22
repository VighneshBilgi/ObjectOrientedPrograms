package com.bridgelabz.oops;

public class DeckOfCards {
    public static void main(String[] args) {
        String suit[] = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String rank[] = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        int suitShuffle = 0;
        int rankShuffle = 0;

        String player[][] = new String[4][9];


        for(int i =0; i<4; i++){

            for(int j=0; j<9; j++){

                start:
                for (String[] cards: player) {
                    for (String card: cards) {

                        suitShuffle = (int)(Math.random() *4);
                        rankShuffle = (int)(Math.random() *13);

                        if(card == rank[rankShuffle].concat(" of "+suit[suitShuffle])){
                            break start;
                        }else{
                            player[i][j] = rank[rankShuffle].concat(" of "+suit[suitShuffle]);
                        }

                    }
                }

            }
        }

        for(int i =0; i<4; i++) {

            System.out.println("Player "+(i+1)+"'s cards are :");

            for (int j = 0; j < 9; j++) {
                System.out.println(player[i][j]);
            }

        }

    }
}
