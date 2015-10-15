/*
UVG
Algoritmos y Estructuras de Datos - 2015
Hoja de trabajo 9
Autor: Diego Rosales

Descripción: WordSet con SplayTree.
*/

import structure5.SplayTree;

class SplayTreeSet implements WordSet{
	private SplayTree<Word> base;
	
	public SplayTreeSet(){
		base = new SplayTree();
	}
	
	public Word get(Word word){
		if(base.contains(word)){
			return base.get(word);
		}
		else{
			return null;
		}
	}
	
	public void add(Word wordObject){
		base.add(wordObject);
	}
	
}