/*
UVG
Algoritmos y Estructuras de Datos - 2015
Hoja de trabajo 9
Autor: Diego Rosales

Descripción: WordSet con R-B-Tree.
*/

import structure5.RedBlackSearchTree;
import structure5.RedBlackTree;

public class RedBlackTreeSet implements WordSet{
	private RedBlackSearchTree<Word> base;
	
	public RedBlackTreeSet(){
		base=new RedBlackSearchTree();
	}
	
	public void add(Word wordObject){
		base.add(wordObject);
	}
	
	public Word get(Word word){
		if(base.contains(word)){
			Word palabra = base.remove(word);
			Word copy = new Word(palabra.getWord(),palabra.getType());
			base.add(palabra);
			return copy;
		}
		else{
			return null;
		}
	}
	
}