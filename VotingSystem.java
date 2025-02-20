import java.util.*;
public class VotingSystem{
 
  private Map<String, Integer> voteCountMap = new HashMap<>();
  private Map<String, Integer> orderedVoteMap = new LinkedHashMap<>();
  private Map<String, Integer> sortedVoteMap = new TreeMap<>();


  public void castVote(String candidate) {
    voteCountMap.put(candidate, voteCountMap.getOrDefault(candidate, 0)+ 1);
    orderedVoteMap.put(candidate, orderedVoteMap.getOrDefault(candidate, 0)+ 1);
    sortedVoteMap.put(candidate, sortedVoteMap.getOrDefault(candidate, 0)+1);
  }
  public void displayVotes() {
    System.out.println(voteCountMap);
    System.out.println(orderedVoteMap);
    System.out.println(sortedVoteMap);
  }


  public static void main(String[] args) {
    VotingSystem vs = new VotingSystem();
    vs.castVote("Aditya");
    vs.castVote("Yash");
    vs.castVote("Anirudh");
    vs.castVote("Adarsh");
    vs.castVote("Abhishek");
    vs.castVote("Aman");
    vs.displayVotes();
  }
}
