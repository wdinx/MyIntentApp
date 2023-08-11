package com.example.myintentapp

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Person(
    val name: String?,
    val age: Int?,
    val email: String?,
    val city: String?
) : Parcelable
    // {
//    constructor(parcel: Parcel): this(
//        parcel.readString(),
//        parcel.readValue(Int::class.java.classLoader) as? Int,
//        parcel.readString(),
//        parcel.readString()){
//
//    }
//
//    override fun writeToParcel(p0: Parcel, p1: Int) {
//        p0.writeString(name)
//        p0.writeValue(age)
//        p0.writeString(email)
//        p0.writeString(city)
//    }
//
//    override fun describeContents(): Int {
//        return 0
//    }
//
//    companion object CREATOR: Parcelable.Creator<Person>{
//        override fun createFromParcel(p0: Parcel): Person {
//            return Person(p0)
//        }
//
//        override fun newArray(p0: Int): Array<Person?> {
//            return arrayOfNulls(p0)
//        }
//    }
//
//
//}
