/*
 * Practice
 * Reviewing Maps and Compound Data Structures
 * A user can input a number 1-3 to view high frequency Latin vocabulary by word type.
 * Rebecca Riffle
 * 10/2/2024
 */

 import java.util.*;

public class Practice {
    public static void main(String[] args) {
        // Most common Latin words, according to: 
        // https://dcc.dickinson.edu/latin-core-list1?field_search_lemma_value=&field_part_of_speech_value=All&field_semantic_group_value=All&order=field_frequency_rank&sort=asc

        // Create a list of all conjunctions in top 20 Latin vocab words
        List<String> latinConjunctions = new ArrayList<>();
        latinConjunctions.add("et");
        latinConjunctions.add("-que");
        latinConjunctions.add("non");
        latinConjunctions.add("nec");
        latinConjunctions.add("sed");

        // Create a list of all pronouns in top 20 Latin vocab words
        List<String> latinPronouns = new ArrayList<>();
        latinPronouns.add("qui");
        latinPronouns.add("his");
        latinPronouns.add("ille");
        latinPronouns.add("tu");
        latinPronouns.add("ego");
        latinPronouns.add("is");
        latinPronouns.add("ea");
        latinPronouns.add("id");

        // Create a list of all prepositions in top 20 Latin vocab words
        List<String> latinPrepositions = new ArrayList<>();
        latinPrepositions.add("in");
        latinPrepositions.add("cum");
        latinPrepositions.add("ad");
        

        // Store top 20 Latin vocab words in a map, where the key is the word type
        Map<String, List<String>> highFrequencyLatin = new HashMap<>();
        highFrequencyLatin.put("Conjunctions", latinConjunctions);
        highFrequencyLatin.put("Pronouns", latinPronouns);
        highFrequencyLatin.put("Prepositions",latinPrepositions);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to view one of the following:");
        System.out.println("1 - high frequency Latin conjunctions");
        System.out.println("2 - high frequency Latin pronouns");
        System.out.println("3 - high frequency Latin prepositions");
        System.out.println();

        int response = input.nextInt();

        if (response == 1) {
            System.out.println();
            System.out.println("The most common Latin conjuntions are:");
            for (String word : highFrequencyLatin.get("Conjunctions")) {
                System.out.println(word);
            }
        } else if (response == 2) {
            System.out.println();
            System.out.println("The most common Latin pronouns are:");
            for (String word : highFrequencyLatin.get("Pronouns")) {
                System.out.println(word);
            }
        } else if (response == 3) {
            System.out.println();
            System.out.println("The most common Latin prepositions are:");
            for (String word : highFrequencyLatin.get("Prepositions")) {
                System.out.println(word);
            }
        }
    }
}