package com.javacambodia.retrofit2.wp;

import com.google.gson.annotations.SerializedName;
import com.javacambodia.retrofit2.wp.Rendered;

public class BasicPostVO {

    @SerializedName("title")
    private Rendered title = new Rendered();
    @SerializedName("excerpt")
    private Rendered description = new Rendered();

    public BasicPostVO(String title, String description) {
        this.title.setRendered(title);
        this.description.setRendered(description);
    }

    public String getTitle() {
        return title.getRendered();
    }

    public void setTitle(String title) {
        this.title.setRendered(title);
    }

    public String getDescription() {
        return description.getRendered();
    }

    public void setDescription(String description) {
        this.description.setRendered(description);
    }
}
