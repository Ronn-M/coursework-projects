package com.company;

public class PlayersLinkedList {
    private PlayersNode head;


    public boolean Empty(){
        return head == null;
    }
    public void addToFront (Players_List Player){
        PlayersNode node = new PlayersNode(Player);
        node.setNext(head);
        head = node;

    }
    public PlayersNode removeFromFront(){
        if (Empty()){
            return null;
        }
        PlayersNode removedPlayer = head;
        head = head.getNext();
        return removedPlayer;
    }

    public void PrintLeaderboard(){
        System.out.println("The Top 10 LeaderBoard");
        PlayersNode current = head;
        while (current != null){
            System.out.print(current);
            System.out.println("");
            current = current.getNext();

        }

    }
}
