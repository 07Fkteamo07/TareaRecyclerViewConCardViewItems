package com.example.recyclerview_con_cardview_items.Models;

import android.os.Parcel;
import android.os.Parcelable;

public class Address implements Parcelable {
    private String address;
    private String city;
    private Coordinates coordinates;
    private String postalCode;
    private String state;

    protected Address(Parcel in) {
        address = in.readString();
        city = in.readString();
        coordinates = in.readParcelable(Coordinates.class.getClassLoader());
        postalCode = in.readString();
        state = in.readString();
    }

    public static final Creator<Address> CREATOR = new Creator<Address>() {
        @Override
        public Address createFromParcel(Parcel in) {
            return new Address(in);
        }

        @Override
        public Address[] newArray(int size) {
            return new Address[size];
        }
    };

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getState() {
        return state;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(address);
        dest.writeString(city);
        dest.writeParcelable(coordinates, flags);
        dest.writeString(postalCode);
        dest.writeString(state);
    }

    @Override
    public int describeContents() {
        return 0;
    }
}
