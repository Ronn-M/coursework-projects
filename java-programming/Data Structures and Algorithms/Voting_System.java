package com.company;
import java.util.*;
import java.util.Map;
import java.util.List;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Collections;

public class Election_Voting_System {
    public static void removeDuplicateUsingElements(long[] Vote) {

        //Sort an unsorted array
        Arrays.sort(Vote);

        long Length = Vote.length;
        long Sto = 0;

        //Traverse an array
        for (long index = 0; index < Length - 1; index++) {

            //if value present at i and i+1 index is not equal
            if (Vote[Math.toIntExact(index)] != Vote[Math.toIntExact(index + 1)]) {
                Vote[Math.toIntExact(Sto++)] = Vote[Math.toIntExact(index)];
            }
        }

        Vote[Math.toIntExact(Sto++)] = Vote[Math.toIntExact(Length - 1)];

    }

    private static void Sortswap(long[] arrayDesc) {
        long TempArray = arrayDesc.length;
        long TempStore = 0;

        for (long Counter = 0; Counter < (TempArray - 1); Counter++) {
            for (long IndexCounter = 0; IndexCounter < TempArray - Counter - 1; IndexCounter++) {
                if (arrayDesc[Math.toIntExact(IndexCounter)] < arrayDesc[Math.toIntExact(IndexCounter + 1)]) {
                    TempStore = arrayDesc[Math.toIntExact(IndexCounter)];
                    arrayDesc[Math.toIntExact(IndexCounter)] = arrayDesc[Math.toIntExact(IndexCounter + 1)];
                    arrayDesc[Math.toIntExact(IndexCounter + 1)] = TempStore;
                }
            }
        }
    }

    private static void ISort(long Vote[]) {
        long n = Vote.length;
        for (long i = 1; i < n; ++i) {
            long key = Vote[Math.toIntExact(i)];
            long j = i - 1;

            while (j >= 0 && Vote[Math.toIntExact(j)] > key) {
                Vote[Math.toIntExact(j + 1)] = Vote[Math.toIntExact(j)];
                j = j - 1;
            }
            Vote[Math.toIntExact(j + 1)] = key;
        }
    }

    public static List<Integer> sortbyfreq(List<Integer> list) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < list.size(); i++) {
            map.put(list.get(i), map.getOrDefault(list.get(i), 0) + 1);
        }

        Collections.sort(list, (n1, n2) -> {
            int freq1 = map.get(n1);
            int freq2 = map.get(n2);

            if (freq1 != freq2) {
                return freq2 - freq1;
            }

            return n2 - n1;
        });

        return list;
    }

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        Scanner console = new Scanner(System.in);

        Election_Voting_System ISort = new Election_Voting_System();


        System.out.print("Enter Number of Candidates to Participate in Election: ");

        long Candidate = Input.nextLong();
        long SCount, Count, Counter;

        System.out.print("Enter Number of registered voters to Poll: ");

        long Voter = Input.nextLong();
        long[] Votes = new long[Math.toIntExact(Voter)];
        String[] S = new String[(int) Candidate];

        for (long CandidateNameCounter = 0; Candidate > CandidateNameCounter; CandidateNameCounter++) {
            System.out.print("Input Candidate Name " + ":");

            S[Math.toIntExact(CandidateNameCounter)] = console.nextLine();

        }

        System.out.println();
        System.out.println("The Candidates are: " + Arrays.toString(S));
        System.out.println();


        long[] Vote = new long[Math.toIntExact(Voter)];


        System.out.println();

        for (long VoteCount = 0; VoteCount <= Voter; VoteCount++) {

            if (VoteCount == Voter) {

                System.out.println("Voting Polls Closed");

            } else {
                for (long VotingIndexCount = 0; VotingIndexCount < Candidate; VotingIndexCount++) {
                    System.out.print(S[Math.toIntExact(VotingIndexCount)] + "[" + VotingIndexCount + "] ");
                }
                System.out.println();
                System.out.print("Input your Candidate Index digit to vote, (example: 1): ");

                Vote[Math.toIntExact(VoteCount)] = Input.nextLong();
                Votes[Math.toIntExact(VoteCount)] = -1;

            }
        }

        System.out.println();

        for (Count = 0; Count < Voter; Count++) {
            Counter = 1;
            for (SCount = Count + 1; SCount < Voter; SCount++) {
                if (Vote[Math.toIntExact(Count)] == Vote[Math.toIntExact(SCount)]) {
                    Counter++;
                    Votes[Math.toIntExact(SCount)] = 0;
                }
            }

            if (Votes[Math.toIntExact(Count)] != 0) {
                Votes[Math.toIntExact(Count)] = Counter;
            }
        }
        ISort(Vote);
        Sortswap(Votes);

        List<long[]> list = Arrays.asList(Vote);
        removeDuplicateUsingElements(Vote);


        for (Count = 0; Count < Voter; Count++) {
            if (Votes[Math.toIntExact(Count)] != 0) {
                for (long VotingIndexCount = 0; VotingIndexCount < Candidate; VotingIndexCount++) {
                    System.out.print(S[Math.toIntExact(VotingIndexCount)] + "[" + VotingIndexCount + "] ");
                }

                System.out.println("    (" + Vote[Math.toIntExact(Math.toIntExact(Count))]
                        + ")" + " has: " + Votes[Math.toIntExact(Count)] + " Votes");
            }
        }
        System.out.println();

        System.out.println(Arrays.toString(Vote));
        System.out.println(Arrays.toString(Votes));

    }
}

