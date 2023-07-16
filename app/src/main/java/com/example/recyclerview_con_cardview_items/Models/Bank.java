package com.example.recyclerview_con_cardview_items.Models;

import android.os.Parcel;
import android.os.Parcelable;

public class Bank implements Parcelable {
    private String cardExpire;
    private String cardNumber;
    private String cardType;
    private String currency;
    private String iban;

    protected Bank(Parcel in) {
        cardExpire = in.readString();
        cardNumber = in.readString();
        cardType = in.readString();
        currency = in.readString();
        iban = in.readString();
    }

    public static final Creator<Bank> CREATOR = new Creator<Bank>() {
        @Override
        public Bank createFromParcel(Parcel in) {
            return new Bank(in);
        }

        @Override
        public Bank[] newArray(int size) {
            return new Bank[size];
        }
    };

    public String getCardExpire() {
        return cardExpire;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getCardType() {
        return cardType;
    }

    public String getCurrency() {
        return currency;
    }

    public String getIban() {
        return iban;
    }

    public void setCardExpire(String cardExpire) {
        this.cardExpire = cardExpire;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(cardExpire);
        dest.writeString(cardNumber);
        dest.writeString(cardType);
        dest.writeString(currency);
        dest.writeString(iban);
    }

    @Override
    public int describeContents() {
        return 0;
    }
}
