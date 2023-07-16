package com.example.recyclerview_con_cardview_items.Models;

import android.os.Parcel;
import android.os.Parcelable;

public class Company implements Parcelable {
    private Address address;
    private String department;
    private String name;
    private String title;

    protected Company(Parcel in) {
        address = in.readParcelable(Address.class.getClassLoader());
        department = in.readString();
        name = in.readString();
        title = in.readString();
    }

    public static final Creator<Company> CREATOR = new Creator<Company>() {
        @Override
        public Company createFromParcel(Parcel in) {
            return new Company(in);
        }

        @Override
        public Company[] newArray(int size) {
            return new Company[size];
        }
    };

    public Address getAddress() {
        return address;
    }

    public String getDepartment() {
        return department;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(address, flags);
        dest.writeString(department);
        dest.writeString(name);
        dest.writeString(title);
    }

    @Override
    public int describeContents() {
        return 0;
    }
}
