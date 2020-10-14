package com.stefan.tbdbclient.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.bumptech.glide.Glide
import com.stefan.tbdbclient.R
import com.stefan.tbdbclient.data.models.Movie
import com.stefan.tbdbclient.databinding.ActivityDetailBinding
import java.io.Serializable

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_detail)

        val movie =  intent.getSerializableExtra("movie") as? Movie

        Glide.with(binding.ivDetailPhoto.context)
            .load("https://image.tmdb.org/t/p/w500" + movie?.posterPath)
            .into(binding.ivDetailPhoto)

        binding.apply {
            tvDescription.text = movie?.overview.toString()
            tvDetailTitle.text = movie?.title.toString()
            ratingBar.rating = movie?.voteAverage!!.toFloat()
            tvRating.text = movie.voteAverage.toString()
            tvReleaseDate.text = movie.releaseDate
            ibBack.setOnClickListener {
                finish()
            }
        }


    }

}