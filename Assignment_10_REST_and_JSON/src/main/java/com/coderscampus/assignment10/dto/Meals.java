package com.coderscampus.assignment10.dto;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Meals {

	@JsonProperty("id")
	private Long id;
	@JsonProperty("title")
	private String title;
	@JsonProperty("imageType")
	private String imageType;
	@JsonProperty("readyInMinutes")
	private Double readyInMinutes;
	@JsonProperty("servings")
	private Integer servings;
	@JsonProperty("sourceUrl")
	private String sourceUrl;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getImageType() {
		return imageType;
	}

	public void setImageType(String imageType) {
		this.imageType = imageType;
	}

	public Double getReadyInMinutes() {
		return readyInMinutes;
	}

	public void setReadyInMinutes(Double readyInMinutes) {
		this.readyInMinutes = readyInMinutes;
	}

	public Integer getServings() {
		return servings;
	}

	public void setServings(Integer servings) {
		this.servings = servings;
	}

	public String getSourceUrl() {
		return sourceUrl;
	}

	public void setSourceUrl(String sourceUrl) {
		this.sourceUrl = sourceUrl;
	}

	@Override
	public String toString() {
		return "Meals [id=" + id + ", title=" + title + ", imageType=" + imageType + ", readyInMinutes="
				+ readyInMinutes + ", servings=" + servings + ", sourceUrl=" + sourceUrl + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Meals other = (Meals) obj;
		return Objects.equals(id, other.id);
	}

}
