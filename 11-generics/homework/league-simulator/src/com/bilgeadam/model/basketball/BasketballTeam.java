package com.bilgeadam.model.basketball;

import com.bilgeadam.model.Team;

import java.util.List;

public class BasketballTeam extends Team<BasketballPlayer> {
    @Override
    public int calculateMatchResult(List<BasketballPlayer> opponentTeam) {
        return 0;
    }

    @Override
    public int getPoint() {
        return 0;
    }

    @Override
    public void addPoint(int point) {

    }

    @Override
    public int compareTo(Team<BasketballPlayer> o) {
        return 0;
    }
}
