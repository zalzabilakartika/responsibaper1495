package com.example.responsi1495

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TodoAdapter (private val context: Context, private val Todo: List<Todo>, val listener: (Todo) -> Unit)
    : RecyclerView.Adapter<TodoAdapter.TodoViewHolder>(){

    class TodoViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val waktu = view.findViewById<TextView>(R.id.waktu)
        val space = view.findViewById<TextView>(R.id.space)

        fun bindView(Todo: Todo, listener: (Todo) -> Unit) {
            waktu.text = Todo.waktu
            space.text = Todo.space
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {
        return TodoViewHolder(
            LayoutInflater.from(context).inflate(R.layout.todotemplate, parent, false)
        )
    }

    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {
        holder.bindView(Todo[position], listener)
    }

    override fun getItemCount(): Int = Todo.size

}