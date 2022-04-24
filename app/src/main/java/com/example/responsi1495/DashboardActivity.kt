package com.example.responsi1495

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        supportActionBar?.hide()

        val Todolist = listOf<Todo>(
            Todo(
                "13.45",
                "gift to my boyfriend"
            ),
            Todo(

                "06.54",
                "cook some bakso yummy"
            ),
            Todo(
                "17.00",
                "read atonomic habits"
            ),
            Todo(
                "21.00",
                "call my dad"
            ),
            Todo(
                "09.00",
                "laundry"
            ),
            Todo(
                "09.00",
                "laundry"
            ),
            Todo(
                "09.50",
                "breakfast"
            ),
            Todo(
                "10.45",
                "call my boyfriend"
            ),
            Todo(
                "11.00",
                "shower"
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.list)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = TodoAdapter(this, Todolist) {
        }
    }
}