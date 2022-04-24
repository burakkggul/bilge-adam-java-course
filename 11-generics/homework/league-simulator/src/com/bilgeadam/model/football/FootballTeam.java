package com.bilgeadam.model.football;

import com.bilgeadam.model.Team;

import java.util.List;

public class FootballTeam extends Team<FootballPlayer> {
    @Override
    public int calculateMatchResult(List<FootballPlayer> opponentTeam) {
        int opponentTeamPower = 0;
        for(FootballPlayer footballPlayer:opponentTeam){
            opponentTeamPower += footballPlayer.getPower();
        }
        int membersPower = 0;
        for (FootballPlayer footballPlayer : this.getMembers()){
            membersPower += footballPlayer.getPower();
        }

        if(membersPower > opponentTeamPower){
            System.out.println("Maçı kazandık.");
            this.setWon(this.getWon() + 1);
            return 0;
        } else if(membersPower == opponentTeamPower){
            System.out.println("Maç berabere bitti.");
            this.setTied(this.getTied() + 1);
            return 1;
        } else {
            System.out.println("Maç kaybedildi.");
            this.setLost(this.getLost() + 1);
            return 3;
        }
    }

    @Override
    public int getPoint() {
        return (this.getWon() * 3) + (this.getTied());
    }

    @Override
    public void addPoint(int point) {
        if(point == 3) this.setWon(this.getWon() + 1);
        if(point == 0) this.setLost(this.getLost() + 1);
        if(point == 1) this.setTied(this.getTied() + 1);
    }

    @Override
    public int compareTo(Team<FootballPlayer> opponentTeam) {
        if(this.getPoint() > opponentTeam.getPoint()){
            return -1;
        }
        if(opponentTeam.getPoint() > this.getPoint()){
            return 1;
        }
        return 0;
    }
}
