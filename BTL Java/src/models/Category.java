package models;

import java.util.List;

public class Category {
    private int categoryId;
    private String categoryName;
    private List<Audio> audioOfCategory;

    public Category(int categoryId, String categoryName, List<Audio> audioOfCategory) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.audioOfCategory = audioOfCategory;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public List<Audio> getAudioOfCategory() {
        return audioOfCategory;
    }

    public void setAudioOfCategory(List<Audio> audioOfCategory) {
        this.audioOfCategory = audioOfCategory;
    }
}
