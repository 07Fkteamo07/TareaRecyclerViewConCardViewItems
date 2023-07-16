package com.example.recyclerview_con_cardview_items.Models;

import android.os.Parcel;
import android.os.Parcelable;

public class Hair implements Parcelable {
    private String color;
    private String type;

    protected Hair(Parcel in) {
        color = in.readString();
        type = in.readString();
    }

    public static final Creator<Hair> CREATOR = new Creator<Hair>() {
        @Override
        public Hair createFromParcel(Parcel in) {
            return new Hair(in);
        }

        @Override
        public Hair[] newArray(int size) {
            return new Hair[size];
        }
    };

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(color);
        dest.writeString(type);
    }

    @Override
    public int describeContents() {
        return 0;
    }
}
