package tries;

import java.util.HashMap;
import java.util.Set;

public class Trie {
public Node root;
    
    public Trie() {
        this.root = new Node();
    }
    
    public void insertWord(String word) {
        // gets the root node;
        Node currentNode = this.root;
        
        // iterates over every character in the word
        for(int i = 0; i < word.length(); i++) {
            // currentLetter is just the character / letter at the iteration
            Character currentLetter = word.charAt(i);
            // ask if the current letter is in the map of the current node
            Node child = currentNode.children.get(currentLetter);
            
            if(child == null) {
//            	if the letter in the variable child is not in the node path create a new node
                child = new Node();
                currentNode.children.put(currentLetter, child); 
            } 
            
            currentNode = child;
        }
        currentNode.isCompleteWord = true;
    }
    String[] arr = {"car","card","chip","trie","try"};
    public boolean isPrefixValid(String prefix) {
    	if(prefix.matches("(" +arr[0]+ "|"
    			+ arr[1] +").*")) {
    		System.out.println(prefix);
    		return true;
    	}else {
    		System.out.println("isPrefixValid: false");
    		return false;
    	}
    }
    public boolean isWordValid(String word) {
    	if(word != arr) {
    		return true;
    	}else {
    		return false;
    	}
    }
    public void printAllKeys() {
    	Set<Character> keys = root.children.keySet();
        for (Character key: keys){
        	System.out.println(key);
        }
        
    }
}

