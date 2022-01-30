package com.example.movingbooks

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class BookAdapter : RecyclerView.Adapter<BookViewHolder>() {

    private var bookList: MutableList<BookModel> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_book, parent, false)
        return BookViewHolder(
            layoutInflater
        )
    }

    override fun getItemCount(): Int {
        return bookList.size
    }

    override fun onBindViewHolder(holder: BookViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    private fun getItem(position: Int): BookModel {
        return bookList[position]
    }

    fun addAll(genreList: List<BookModel>) {
        this.bookList.clear()
        this.bookList.addAll(genreList)
        notifyDataSetChanged()
    }
}