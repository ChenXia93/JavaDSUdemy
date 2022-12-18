package JavaSelfLearning.Trie;

public class TrieMain {
    public static void main(String [] args){
        TrieClass trieClass =  new TrieClass();
        trieClass.insert("API");
        trieClass.insert("APIS");
        trieClass.searchTrie("APSI");
        trieClass.delete("APIS");
        trieClass.searchTrie("APIS");

    }
}
