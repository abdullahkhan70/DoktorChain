package com.example.abdullahkhan.doktorchain;

public class cardItemString {

    private int background_images;
    private int inner_images;

    private String inner_description;
    private String inner_content;

    public cardItemString(int background_images, int inner_images, String inner_description, String inner_content) {
        this.background_images = background_images;
        this.inner_images = inner_images;
        this.inner_description = inner_description;
        this.inner_content = inner_content;
    }

    public int getBackground_images() {
        return background_images;
    }

    public void setBackground_images(int background_images) {
        this.background_images = background_images;
    }

    public int getInner_images() {
        return inner_images;
    }

    public void setInner_images(int inner_images) {
        this.inner_images = inner_images;
    }

    public String getInner_description() {
        return inner_description;
    }

    public void setInner_description(String inner_description) {
        this.inner_description = inner_description;
    }

    public String getInner_content() {
        return inner_content;
    }

    public void setInner_content(String inner_content) {
        this.inner_content = inner_content;
    }
}
