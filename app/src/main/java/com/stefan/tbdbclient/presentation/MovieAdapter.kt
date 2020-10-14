package com.stefan.tbdbclient.presentation

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.stefan.tbdbclient.R
import com.stefan.tbdbclient.data.models.Movie
import com.stefan.tbdbclient.databinding.ListItemBinding

class MovieAdapter(
    private val clickListener: (Movie) -> Unit
) : RecyclerView.Adapter<MyViewHolder>() {

    private val movieList = ArrayList<Movie>()

    fun setList(movies: List<Movie>) {
        movieList.clear()
        movieList.addAll(movies)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val layoutInflater = LayoutInflater.from(parent.context)
        val binding: ListItemBinding = DataBindingUtil.inflate(
            layoutInflater,
            R.layout.list_item,
            parent,
            false
        )

        return MyViewHolder(binding)

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(movieList[position], clickListener)
    }

    override fun getItemCount(): Int {
        return movieList.size
    }

}

class MyViewHolder(private val binding: ListItemBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(movie: Movie, clickListener: (Movie) -> Unit) {
        binding.tvTitle.text = movie.title

        val posterPath = "https://image.tmdb.org/t/p/w500" + movie.posterPath
        Glide.with(binding.ivPhoto.context)
            .load(posterPath)
            .into(binding.ivPhoto)

        binding.card.setOnClickListener {
            clickListener(movie)
        }
    }

}