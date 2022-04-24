package com.bilgeadam.model;

import java.util.Collections;
import java.util.List;

public abstract class League<E extends Team<R>,R extends Player> {

    private List<E> teams;

    public List<E> getTeams() {
        return teams;
    }

    public void simulateLeague(List<E> teams){
        this.teams = teams;
        for(int i = 0; i < this.teams.size() ; i++){
            for(int j = 0; j < this.teams.size(); j++){
                if( i != j){

                    int opponentTeamPoint = this.teams.get(i).calculateMatchResult(this.teams.get(j).getMembers());
                    this.teams.get(j).addPoint(opponentTeamPoint);
                }
            }
        }

        System.out.println("Sonuçlar: ");
        for (E team: this.teams){
            System.out.println(team.getName() + "---->" + team.getPoint());
        }

        Collections.sort(this.teams);
        System.out.println("Sıralama: ");

        for (E team: this.teams){
            System.out.println(team.getName() + "---->" + team.getPoint());
        }
    }
}
