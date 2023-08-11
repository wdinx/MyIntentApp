package com.example.myintentapp

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.annotation.RequiresApi

class MoveActivityWithObject : AppCompatActivity() {
    companion object{
        const val EXTRA_PERSON = "extra_person"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_with_object)

        val tvObject: TextView= findViewById(R.id.tv_move_data_with_object)

        val person = if (Build.VERSION.SDK_INT >=33){
            intent.getParcelableExtra<Person>(EXTRA_PERSON, Person::class.java)
        } else {
            @Suppress("DEPRACATION")
            intent.getParcelableExtra<Person>(EXTRA_PERSON)
        }

        if(person != null){
            val text = "Name: ${person.name.toString()}. \nEmail: ${person.email.toString()}, \nAge: ${person.age}, \nLocation: ${person.city}"
            tvObject.text = text
        }
    }
}