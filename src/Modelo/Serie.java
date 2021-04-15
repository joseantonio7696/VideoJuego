package Modelo;

public class Serie {
	
	private String title;
	private int seasons;
	private boolean returned;
	private String genre;
	private String creator;

	public Serie() {
		// TODO Auto-generated constructor stub
		this.title=null;
		this.seasons=3;
		this.returned=false;
		this.genre=null;
		this.creator=null;
	}

	
	
	public Serie(String title, String creator) {
		super();
		setTitle(title);
		setCreator(creator);
		setSeasonNum(3);
		this.returned=false;
		setGenre(null);
	}



	public Serie(String title, int seasonNum, String genre, String creator) {
		super();
		setTitle(title);
		setSeasonNum(seasonNum);
		setGenre(genre);
		setCreator(creator);
		this.returned=false;
	}



	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getSeasonNum() {
		return seasons;
	}

	public void setSeasonNum(int seasonNum) {
		this.seasons = seasonNum;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	@Override
	public String toString() {
		return "Title: "+title+", Seasons: "+seasons+", Returned: "+returned+", Genre: "+genre+", Creator: "+creator;
	}

	
}