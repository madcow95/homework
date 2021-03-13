package com.callor.score.vo;

public class ScoreVO {
	
	private int kor;
	private int eng;
	private int math;
	private int music;
	private int history;
	
	private int sum;
	private float avg;
	
	public ScoreVO(int kor, int eng, int math, int music, int history, int sum, float avg) {
		super();
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.music = music;
		this.history = history;
		this.sum = sum;
		this.avg = avg;
	}
	public ScoreVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getMusic() {
		return music;
	}
	public void setMusic(int music) {
		this.music = music;
	}
	public int getHistory() {
		return history;
	}
	public void setHistory(int history) {
		this.history = history;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public float getAvg() {
		return avg;
	}
	public void setAvg(float avg) {
		this.avg = avg;
	}
	@Override
	public String toString() {
		return "ScoreVO [kor=" + kor + ", eng=" + eng + ", math=" + math + ", music=" + music + ", history=" + history
				+ ", sum=" + sum + ", avg=" + avg + "]";
	}
	
	

}
