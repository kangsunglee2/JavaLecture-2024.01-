package ch06_class.sec99_MelonChart;

public class Melon {
	private int rank;
	private String title;
	private String artist;
	private String album;
	private int like;
	
	public Melon() { }
	public Melon(int rank, String title, String artist, String album, int like) {
		this.rank = rank;
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.like = like;
	}
	
	public int getLike() {
		return like;
	}
	
	public void charge() {
		this.like += like;
	}
	@Override
	public String toString() {
		return "Melon [rank=" + rank + ", title=" + title + ", artist=" + artist + ", album=" + album + ", like=" + like
				+ "]";
	}
	
	
	
	
}
