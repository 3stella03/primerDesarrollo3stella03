package cl.twk.miprimerdesarrollo.model;

public class Ave {
	
	private String uid;
	private Name name;
	private Images images;
	private Links links;
	private int sort;
	
	public String getUid() {
		return uid;
	}
	
	public void setUid(String uid) {
		this.uid = uid;
	}
	
	public Name getName() {
		return name;
	}
	
	public void setName(Name name) {
		this.name = name;
	}
	
	public Images getImages() {
		return images;
	}
	
	public void setImages(Images images) {
		this.images = images;
	}
	
	public Links getLinks() {
		return links;
	}
	
	public void setLinks(Links links) {
		this.links = links;
	}
	
	public int getSort() {
		return sort;
	}
	
	public void setSort(int sort) {
		this.sort = sort;
	}

}
