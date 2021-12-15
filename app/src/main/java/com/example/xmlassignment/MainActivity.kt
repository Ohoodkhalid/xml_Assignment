package com.example.xmlassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.io.IOException

class MainActivity : AppCompatActivity() {
    lateinit var rvMain: RecyclerView
    private lateinit var students_Details: List<Student>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvMain=findViewById(R.id.rvMain)

        try{
            val parser = MyXmlPullParserHandler()
            val iStream = assets.open("student_details.xml")
            students_Details = parser.parse(iStream)
            rvMain.adapter = RecyclerViewAdapter(students_Details)
            rvMain.layoutManager = LinearLayoutManager(this)


        }catch (e: IOException) {
            println("ISSUE: $e")
        }
    }
    }
