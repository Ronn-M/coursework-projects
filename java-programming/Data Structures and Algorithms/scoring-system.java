package com.company;


import java.util.List;

public class Main {

    public static void main(String[] args)
    {

        Players_List JohnXF         = new Players_List("1",    "JohnXF",       "121231");
        Players_List Ronnay         = new Players_List("2",    "Ronnay",       "101031");
        Players_List CreateIt22     = new Players_List("3",    "CreateIt22",   "091231");
        Players_List sets5rt        = new Players_List("4",    "sets5rt",      "081231");
        Players_List Aery22         = new Players_List("5",    "Aery22",       "061231");
        Players_List RExW           = new Players_List("6",    "RExW",         "051231");
        Players_List Started123     = new Players_List("7",    "Started123",   "041231");
        Players_List CHECLo         = new Players_List("8",    "CHECLo",       "021231");
        Players_List Challanger14   = new Players_List("9",    "Challanger14", "011231");
        Players_List Maxi82         = new Players_List("10",   "Maxi82",       "000231");
        Players_List Sezcon         = new Players_List("1",   "Sezcon",       "111231");
        Players_List XT54           = new Players_List("2",    "XT54",         "101032");

        PlayersLinkedList Leaderboard = new PlayersLinkedList();

        Leaderboard.addToFront(Maxi82);
        Leaderboard.addToFront(Challanger14);
        Leaderboard.addToFront(CHECLo);
        Leaderboard.addToFront(Started123);
        Leaderboard.addToFront(RExW);
        Leaderboard.addToFront(Aery22);
        Leaderboard.addToFront(sets5rt);
        Leaderboard.addToFront(CreateIt22);
        Leaderboard.addToFront(Ronnay);
        Leaderboard.addToFront(JohnXF);

        Leaderboard.PrintLeaderboard();

        Leaderboard = new PlayersLinkedList();


        Leaderboard.addToFront(Challanger14);
        Leaderboard.addToFront(CHECLo);
        Leaderboard.addToFront(Started123);
        Leaderboard.addToFront(RExW);
        Leaderboard.addToFront(Aery22);
        Leaderboard.addToFront(sets5rt);
        Leaderboard.addToFront(CreateIt22);
        Leaderboard.addToFront(Ronnay);
        Leaderboard.addToFront(JohnXF);
        Leaderboard.addToFront(Sezcon);
        
        Leaderboard.PrintLeaderboard();



    }
}
