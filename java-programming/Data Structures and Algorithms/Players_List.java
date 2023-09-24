package com.company;

import java.util.Objects;

public class Players_List
{
    private int id;
    private String PlayerUsername;
    private long TopScore;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlayerUsername() {
        return PlayerUsername;
    }

    public void setPlayerUsername(String playerUsername) {
        PlayerUsername = playerUsername;
    }

    public long getTopScore() {
        return TopScore;
    }

    public void setTopScore(long topScore) {
        TopScore = topScore;
    }

    public Players_List(String id, String playerUsername, String topScore) {
        this.id = Integer.parseInt(id);
        PlayerUsername = playerUsername;
        TopScore = Long.parseLong(topScore);

    }

    @Override
    public String toString() {
        return "Position " + id +
                ". Player - " + PlayerUsername + "\n" +
                "            TopScore - " + TopScore;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Players_List that = (Players_List) o;
        return id == that.id &&
                TopScore == that.TopScore &&
                Objects.equals(PlayerUsername, that.PlayerUsername);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, PlayerUsername, TopScore);
    }
}
