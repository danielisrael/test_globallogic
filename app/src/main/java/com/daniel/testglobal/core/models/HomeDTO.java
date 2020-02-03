package com.daniel.testglobal.core.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;

public class HomeDTO implements Parcelable {

    @Expose
    private String title;
    @Expose
    private String description;
    @Expose
    private String image;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.title);
        dest.writeString(this.description);
        dest.writeString(this.image);
    }

    public HomeDTO() {
    }

    private HomeDTO(Parcel in) {
        this.title = in.readString();
        this.description = in.readString();
        this.image = in.readString();
    }

    public static final Parcelable.Creator<HomeDTO> CREATOR = new Parcelable.Creator<HomeDTO>() {
        @Override
        public HomeDTO createFromParcel(Parcel source) {
            return new HomeDTO(source);
        }

        @Override
        public HomeDTO[] newArray(int size) {
            return new HomeDTO[size];
        }
    };
}
