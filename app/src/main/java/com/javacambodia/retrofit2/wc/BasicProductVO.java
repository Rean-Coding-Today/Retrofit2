package com.javacambodia.retrofit2.wc;

import com.google.gson.annotations.SerializedName;
import com.javacambodia.retrofit2.wp.Rendered;

public class BasicProductVO {
    @SerializedName("title")
    private Rendered title = new Rendered();
    @SerializedName("excerpt")
    private Rendered description = new Rendered();

    public BasicProductVO(String title, String description) {
        this.title.setRendered(title);
        this.description.setRendered(description);
    }

    public Rendered getTitle() {
        return title;
    }

    public void setTitle(Rendered title) {
        this.title = title;
    }

    public Rendered getDescription() {
        return description;
    }

    public void setDescription(Rendered description) {
        this.description = description;
    }
}
