package com.bilgeadam;

import com.bilgeadam.model.League;
import com.bilgeadam.model.football.FootballLeague;
import com.bilgeadam.model.football.FootballPlayer;
import com.bilgeadam.model.football.FootballTeam;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        List<FootballTeam> footballTeams = new ArrayList<>();
        for (int i = 0 ; i < 30 ; i++){
            FootballTeam footballTeam = new FootballTeam();
            footballTeam.setName(random.nextInt(101) + "-" + i);
            for(int j = 0 ; j < 20 ; j++){
                FootballPlayer footballPlayer = new FootballPlayer(String.valueOf(i+j),String.valueOf(i+j), random.nextInt(101));
                footballTeam.addMember(footballPlayer);
            }
            footballTeams.add(footballTeam);
        }

        League<FootballTeam,FootballPlayer> footballLeague = new FootballLeague();

        footballLeague.simulateLeague(footballTeams);
    }
}
