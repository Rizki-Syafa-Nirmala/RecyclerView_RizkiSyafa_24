package com.example.recyclerview_rizkisyafa_24

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        const val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val studentsList = listOf<Students>(
            Students(
                R.drawable.rizky,
                "Muhammad Rizky Sendiko",
                "Kelas XI RPL 2, Absen 17"
            ),
            Students(
                R.drawable.nabila,
                "Nabila Syahwa Kabisa",
                "Kelas XI RPL 2, Absen 19"
            ),
            Students(
                R.drawable.syafa,
                "Rizki Syafa Nirmala",
                "Kelas XI RPL 2, Absen 24"
            ),
            Students(
                R.drawable.sigit,
                "Sigit Bimantoro",
                "Kelas XI RPL 2, Absen 26"
            ),
            )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_students)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = StudentsAdapter(this, studentsList){
            val intent = Intent(this, DetailStudentsActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }
    }
}