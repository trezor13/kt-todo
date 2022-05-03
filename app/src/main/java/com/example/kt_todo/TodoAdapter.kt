package com.example.kt_todo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_todo.view.*

class TodoAdapter(
    private val todos: MutableList<Todo>
) : RecyclerView.Adapter<TodoAdapter.TodoViewHolder>() {
    class TodoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {
      return TodoViewHolder(
          LayoutInflater.from(parent.context).inflate(
              R.layout.item_todo,
              parent,
              false
          )
      )
    }

    private fun toggleStrikeThrough(tvTodoTitle: textView, isChecked: Boolean){
        if(isChecked){
            tvTodoTitle.paintflags = tvTodoTitle.paintflags
        }
    }

    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {
        val curTodo = todos[position]
        holder.itemView.apply {
            tvTodoTitle.tex = curTodo.title
            cbDone.isChecked = curTodo.isChecked
        }

    }

    override fun getItemCount(): Int {
        return todos.size

    }
}