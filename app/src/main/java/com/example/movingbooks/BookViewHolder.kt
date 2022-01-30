package com.example.movingbooks

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_book.view.*

class BookViewHolder (private val root: View) : RecyclerView.ViewHolder(root) {
    fun bind(Book: BookModel) {
        root.tvTitle.text = Book.title
        root.tvDescription.text = Book.description
        root.tvCalories.text = Book.calories
        root.tvRate.text = Book.rate
        root.ivBook.setImageResource(Book.imgId)
    }
}