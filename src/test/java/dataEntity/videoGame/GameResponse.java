package dataEntity.videoGame;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GameResponse{

	@JsonProperty("reviewScore")
	private int reviewScore;

	@JsonProperty("releaseDate")
	private String releaseDate;

	@JsonProperty("name")
	private String name;

	@JsonProperty("rating")
	private String rating;

	@JsonProperty("id")
	private int id;

	public GameResponse(int reviewScore, String releaseDate, String name, String rating, int id, String category) {
		this.reviewScore = reviewScore;
		this.releaseDate = releaseDate;
		this.name = name;
		this.rating = rating;
		this.id = id;
		this.category = category;
	}

	public GameResponse() {

	}

	@JsonProperty("category")
	private String category;

	public void setReviewScore(int reviewScore){
		this.reviewScore = reviewScore;
	}

	public int getReviewScore(){
		return reviewScore;
	}

	public void setReleaseDate(String releaseDate){
		this.releaseDate = releaseDate;
	}

	public String getReleaseDate(){
		return releaseDate;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setRating(String rating){
		this.rating = rating;
	}

	public String getRating(){
		return rating;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setCategory(String category){
		this.category = category;
	}

	public String getCategory(){
		return category;
	}

	@Override
	public String toString() {
		return "GameResponse{" +
				"reviewScore=" + reviewScore +
				", releaseDate='" + releaseDate + '\'' +
				", name='" + name + '\'' +
				", rating='" + rating + '\'' +
				", id=" + id +
				", category='" + category + '\'' +
				'}';
	}
}