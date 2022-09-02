package com.mycom.word;

public class Word {
	//**데이터 클래스** _ 단어를 다루기 위한 변수들 생성 
	//private 는 내부에서만 접근 가능하기 때문에,
	//외부에서 접근이 가능하도록 getter 와 setter를 설정한다. 
	private int id ; 
	private int level ; 
	private String word ; 
	private String meaning ;
	
	//constructor ; 생성자 
	//기본형 생성자
	Word(){} ;
	Word(int id, int level, String word, String meaning){
		this.id = id ; 
		this.level = level ; 
		this.word = word ; 
		this.meaning = meaning ; 
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public String getMeaning() {
		return meaning;
	}
	public void setMeaning(String meaning) {
		this.meaning = meaning;
	} 
	
	
	
}
