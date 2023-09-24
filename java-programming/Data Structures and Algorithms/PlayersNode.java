package com.company;

public class PlayersNode {
    private Players_List Player;
    public PlayersNode next;
    int data;

    public PlayersNode() {
    }

    public Players_List getPlayer() {
        return Player;
    }

    public void setPlayer(Players_List player) {
        Player = player;
    }

    public PlayersNode getNext() {
        return next;
    }

    public void setNext(PlayersNode next) {
        this.next = next;
    }

    public PlayersNode (Players_List Player){
        this.Player = Player;


    }

    public String toString () {
        return Player.toString();
    }
}
