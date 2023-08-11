package com.example.myintentapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var btnMoveActivity: Button
    private lateinit var btnMoveActivityWithData: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnMoveActivity = findViewById(R.id.btn_move_activity)
        btnMoveActivityWithData = findViewById(R.id.btn_move_activity_with_data)
        var btnMoveActivityWithObject: Button = findViewById(R.id.btn_move_activity_with_object)

        btnMoveActivityWithData.setOnClickListener(this@MainActivity)
        btnMoveActivity.setOnClickListener(this@MainActivity)
        btnMoveActivityWithObject.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        when(p0?.id){
            R.id.btn_move_activity -> {
                val moveIntent = Intent(this@MainActivity, MoveActivity::class.java)
                startActivity(moveIntent)
            }

            R.id.btn_move_activity_with_data ->{
                val moveActivityWithData = Intent(this@MainActivity, MoveActivityWithData::class.java)
                moveActivityWithData.putExtra(MoveActivityWithData.EXTRA_NAME, "Wahyuddin")
                moveActivityWithData.putExtra(MoveActivityWithData.EXTRA_AGE, 20)

                startActivity(moveActivityWithData)
            }

            R.id.btn_move_activity_with_object -> {
                val person = Person(
                    "Wahyu",
                    20,
                    "wahyuudin2811@gmail.com",
                    "Makassar"
                )

                val moveActivityWithObject = Intent(this@MainActivity, MoveActivityWithObject::class.java)
                moveActivityWithObject.putExtra(MoveActivityWithObject.EXTRA_PERSON, person)

                startActivity(moveActivityWithObject)
            }
        }
    }
}