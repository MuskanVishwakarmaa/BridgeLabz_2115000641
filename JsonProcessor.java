package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;

import java.io.File;
import java.util.List;

public class JsonProcessor {
    public static void main(String[] args) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();

            // Read JSON file
            List<MatchData> matches = objectMapper.readValue(new File("ipl_matches.json"), new TypeReference<List<MatchData>>() {});

            // Apply censorship
            for (MatchData match : matches) {
                match.setTeam1(DataCensor.maskTeamName(match.getTeam1()));
                match.setTeam2(DataCensor.maskTeamName(match.getTeam2()));
                match.setPlayer_of_match(DataCensor.redactPlayer(match.getPlayer_of_match()));
            }

            // Write sanitized JSON to a new file
            objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File("ipl_matches_censored.json"), matches);

            System.out.println("Censored JSON file created successfully: ipl_matches_censored.json");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
