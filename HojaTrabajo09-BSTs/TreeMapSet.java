/*
UVG
Algoritmos y Estructuras de Datos - 2015
Hoja de trabajo 9
Autor: Diego Rosales

Descripción: WordSet con R-B-Tree.
*/
import java.util.TreeMap;

public class TreeMapSet implements WordSet{
	private TreeMap<String,Word> base;
	
	public TreeMapSet(){
		base=new TreeMap();
	}
	
	public void add(Word wordObject){
		base.put(wordObject.getWord(),wordObject);
	}
	
	public Word get(Word word){
		if(base.containsKey(word.getWord())){
			return base.get(word.getWord());
		}
		else{
			return null;
		}
	}
	
}