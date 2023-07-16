package com.example.recyclerview_con_cardview_items.Models;

import android.os.Parcel;
import android.os.Parcelable;

public class User implements Parcelable {
    private int id;
    private String firstName;
    private String lastName;
    private String maidenName;
    private int age;
    private String gender;
    private String email;
    private String phone;
    private String username;
    private String password;
    private String birthDate;
    private String image;
    private String bloodGroup;
    private int height;
    private double weight;
    private String eyeColor;
    private Hair hair;
    private String domain;
    private String ip;
    private Address address;
    private String macAddress;
    private String university;
    private Bank bank;
    private Company company;
    private String ein;
    private String ssn;
    private String userAgent;

    public User() {
        // Constructor vacío necesario para Parcelable
    }

    protected User(Parcel in) {
        id = in.readInt();
        firstName = in.readString();
        lastName = in.readString();
        maidenName = in.readString();
        age = in.readInt();
        gender = in.readString();
        email = in.readString();
        phone = in.readString();
        username = in.readString();
        password = in.readString();
        birthDate = in.readString();
        image = in.readString();
        bloodGroup = in.readString();
        height = in.readInt();
        weight = in.readDouble();
        eyeColor = in.readString();
        hair = in.readParcelable(Hair.class.getClassLoader());
        domain = in.readString();
        ip = in.readString();
        address = in.readParcelable(Address.class.getClassLoader());
        macAddress = in.readString();
        university = in.readString();
        bank = in.readParcelable(Bank.class.getClassLoader());
        company = in.readParcelable(Company.class.getClassLoader());
        ein = in.readString();
        ssn = in.readString();
        userAgent = in.readString();
    }

    public static final Creator<User> CREATOR = new Creator<User>() {
        @Override
        public User createFromParcel(Parcel in) {
            return new User(in);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMaidenName() {
        return maidenName;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getImage() {
        return image;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public int getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public Hair getHair() {
        return hair;
    }

    public String getDomain() {
        return domain;
    }

    public String getIp() {
        return ip;
    }

    public Address getAddress() {
        return address;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public String getUniversity() {
        return university;
    }

    public Bank getBank() {
        return bank;
    }

    public Company getCompany() {
        return company;
    }

    public String getEin() {
        return ein;
    }

    public String getSsn() {
        return ssn;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMaidenName(String maidenName) {
        this.maidenName = maidenName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public void setHair(Hair hair) {
        this.hair = hair;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void setEin(String ein) {
        this.ein = ein;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    // Implementación de Parcelable
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(id);
        dest.writeString(firstName);
        dest.writeString(lastName);
        dest.writeString(maidenName);
        dest.writeInt(age);
        dest.writeString(gender);
        dest.writeString(email);
        dest.writeString(phone);
        dest.writeString(username);
        dest.writeString(password);
        dest.writeString(birthDate);
        dest.writeString(image);
        dest.writeString(bloodGroup);
        dest.writeInt(height);
        dest.writeDouble(weight);
        dest.writeString(eyeColor);
        dest.writeParcelable(hair, flags);
        dest.writeString(domain);
        dest.writeString(ip);
        dest.writeParcelable(address, flags);
        dest.writeString(macAddress);
        dest.writeString(university);
        dest.writeParcelable(bank, flags);
        dest.writeParcelable(company, flags);
        dest.writeString(ein);
        dest.writeString(ssn);
        dest.writeString(userAgent);
    }
}
