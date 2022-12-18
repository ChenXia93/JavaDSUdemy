package JavaSelfLearning.Trie;
import java.util.HashMap;
import java.util.Map;
public class TrieNode {
    Map<Character, TrieNode> children;
    boolean endOfString;

    public TrieNode(){
        //o(1) only initializing the trieNode
        this.children = new HashMap<>();
        endOfString = false;
    }
    //insert TrieNode
}
