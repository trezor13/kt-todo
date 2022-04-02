package com.example.kt_todo

import android.view.View
import androidx.recyclerview.widget.RecyclerView

class TodoAdapter(
    private val todos: MutableList<Todo>
) : RecyclerView.Adapter {
    class TodoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}