package main;

import java.util.Set;

import tries.Trie;

public class TrieTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trie trie = new Trie();
        trie.insertWord("car");
        trie.insertWord("card");
        trie.insertWord("chip");
        trie.insertWord("trie");
        trie.insertWord("try");
        trie.printAllKeys();
        
        Set<Character> keys = trie.root.children.keySet();
        for (Character key: keys){
        	System.out.println(key);
//        	<!-- System.out.println(trie.root.children.get.(key)); -->
        }
	}

}
