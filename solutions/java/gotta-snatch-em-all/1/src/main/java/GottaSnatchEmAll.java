import java.util.List;
import java.util.Set;
import java.util.HashSet;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        return new HashSet<>(cards);
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        boolean iHaveSomethingTheyDont = myCollection.stream().anyMatch(card -> !theirCollection.contains(card));
        boolean theyHaveSomethingIDont = theirCollection.stream().anyMatch(card -> !myCollection.contains(card));
        return iHaveSomethingTheyDont && theyHaveSomethingIDont;
        
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        // If the list is empty, there are no common cards
        if (collections.isEmpty()) {
            return Set.of();
        }

        // Start with a copy of the first collection
        Set<String> common = new HashSet<>(collections.get(0));

        // Keep only the cards that appear in every other collection
        for (Set<String> collection : collections) {
            common.retainAll(collection);
        }
        return common;
    }

    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> all = new HashSet<>();

        // Add every card from each collection
        for (Set<String> collection : collections) {
            all.addAll(collection);
        }
        return all;
        
    }
        
}
