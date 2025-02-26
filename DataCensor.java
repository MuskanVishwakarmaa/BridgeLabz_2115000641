package org.example;

public class DataCensor {
    public static String maskTeamName(String teamName) {
        if (teamName == null || teamName.isEmpty()) return teamName;
        String[] words = teamName.split(" ");
        if (words.length > 1) {
            return words[0] + " ***"; // Keep first word, mask the rest
        }
        return teamName;
    }

    public static String redactPlayer(String player) {
        return "REDACTED"; // Always replace with "REDACTED"
    }
}
