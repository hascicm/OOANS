package builder;

import java.io.File;
import java.util.Date;
import java.util.List;

public class Series {
	private List<File> audio;
	private List<File> subtitle;
	private File video;
	private double price;
	private String title;
	private String category;
	private Date year;

	public List<File> getAudio() {
		return audio;
	}

	public void setAudio(List<File> audio) {
		this.audio = audio;
	}

	public List<File> getSubtitle() {
		return subtitle;
	}

	public void setSubtitle(List<File> subtitle) {
		this.subtitle = subtitle;
	}

	public File getVideo() {
		return video;
	}

	public void setVideo(File video) {
		this.video = video;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Date getYear() {
		return year;
	}

	public void setYear(Date year) {
		this.year = year;
	}

}
