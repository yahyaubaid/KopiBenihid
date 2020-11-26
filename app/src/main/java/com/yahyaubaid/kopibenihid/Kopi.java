package com.yahyaubaid.kopibenihid;

import android.os.Parcel;
import android.os.Parcelable;

public class Kopi implements Parcelable{
    private String name;
    private String detail;
    private String harga;
    private int photo;

    public Kopi() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeString(detail);
        parcel.writeInt(photo);
        parcel.writeString(harga);
    }

    protected Kopi(Parcel in) {
        name = in.readString();
        detail = in.readString();
        photo = in.readInt();
        harga = in.readString();
    }

    public static final Parcelable.Creator<Kopi> CREATOR = new Parcelable.Creator<Kopi>() {
        @Override
        public Kopi createFromParcel(Parcel in) {
            return new Kopi(in);
        }

        @Override
        public Kopi[] newArray(int size) {
            return new Kopi[size];
        }
    };
}
