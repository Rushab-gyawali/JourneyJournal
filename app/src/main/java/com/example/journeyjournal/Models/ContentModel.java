package com.example.journeyjournal.Models;

public class ContentModel {
    String weather,content,color;
    int ImageId;

    public ContentModel(String weather, String content, String color, int imageId) {
        this.weather = weather;
        this.content = content;
        this.color = color;
        ImageId = imageId;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getImageId() {
        return ImageId;
    }

    public void setImageId(int imageId) {
        ImageId = imageId;
    }
}
