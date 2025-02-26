package org.example;

import org.apache.commons.csv.*;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CsvProcessor {
    public static void main(String[] args) {
        String inputFile = "ipl_matches.csv";
        String outputFile = "ipl_matches_censored.csv";

        try (
                Reader reader = Files.newBufferedReader(Paths.get(inputFile));
                CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT.withFirstRecordAsHeader());
                BufferedWriter writer = Files.newBufferedWriter(Paths.get(outputFile));
                CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT.withHeader(csvParser.getHeaderNames().toArray(new String[0])))
        ) {
            for (CSVRecord record : csvParser) {
                String matchId = record.get("match_id");
                String team1 = DataCensor.maskTeamName(record.get("team1"));
                String team2 = DataCensor.maskTeamName(record.get("team2"));
                String score1 = record.get("score_team1");
                String score2 = record.get("score_team2");
                String winner = DataCensor.maskTeamName(record.get("winner"));
                String player = DataCensor.redactPlayer(record.get("player_of_match"));

                csvPrinter.printRecord(matchId, team1, team2, score1, score2, winner, player);
            }
            csvPrinter.flush();
            System.out.println("Censored CSV file created successfully: " + outputFile);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
