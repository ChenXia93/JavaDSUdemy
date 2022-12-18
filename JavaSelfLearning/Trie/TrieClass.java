package JavaSelfLearning.Trie;

public class TrieClass {
    private TrieNode root;

    public TrieClass(){
        root = new TrieNode();
        System.out.println("Trie has created");
    }

    public void insert(String word){
        TrieNode current = root;
        for(int i = 0; i < word.length(); i++){
            char ch = word.charAt(i);
            TrieNode node = current.children.get(ch);
            //after getting the value
            if(node == null){
                node = new TrieNode();
                current.children.put(ch, node);
            }
            current = node;
        }
        current.endOfString = true;
        System.out.println("Inserted");
    }

    public boolean searchTrie(String word){
        TrieNode currentNode = root;
        for(int i = 0; i < word.length() ; i++){
            char ch = word.charAt(i);
            //if we have a value, this means that there exist a value
            TrieNode node = currentNode.children.get(ch);
            if(node == null){
                System.out.println("Word " + word + " dos not exist in Trie");
                return false;
            }
            //continue with the next node
            currentNode = node;
        }
        if(currentNode.endOfString){
            System.out.println("Word Exist in Trie");
            return true;
        }else{
            System.out.println("Word " + word + " dos not exist in Trie but it is a prefix of the string");
            return false;
        }
    }
    //Delete Helper
    private boolean delete(TrieNode parentNode, String word, int index){
        char ch = word.charAt(index);
        TrieNode currentNode = parentNode.children.get(ch);
        boolean canThisBeDeleted;
        System.out.println("size " + currentNode.children.size());
        if(currentNode.children.size() > 1){
            delete(currentNode, word,index+ 1);
            return false;
        }
        if(index == word.length() -1){
            if(currentNode.children.size() >= 1){
                currentNode.endOfString = false;
                return false;
            }else{
                parentNode.children.remove(ch);
                return true;
            }
        }
        if(currentNode.endOfString){
            delete(currentNode, word, index + 1);
            return false;
        }
        canThisBeDeleted = delete(currentNode, word , index + 1);
        if(canThisBeDeleted){
            parentNode.children.remove(ch);
            return true;
        }else{
            return false;
        }
    }
    public void delete(String word) {
        if (searchTrie(word)) {
            delete(root, word, 0 );
        }
    }


}
