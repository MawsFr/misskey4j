package misskey4j.entity;

import javax.annotation.Nullable;

public class Announcement {
    private String id;
    private String createdAt;
    private String updatedAt;
    private String text;
    private String title;
    private String imageUrl;
    @Nullable
    private Boolean isRead = false;

    // region
    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(final String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(final String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getText() {
        return text;
    }

    public void setText(final String text) {
        this.text = text;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(final String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Boolean getRead() {
        return isRead;
    }

    public void setRead(final Boolean read) {
        isRead = read;
    }

    // endregion
}
