package com.ismailmesutmujde.kotlinpicassolibrary

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ismailmesutmujde.kotlinpicassolibrary.databinding.ActivityMainBinding
import com.squareup.picasso.Picasso


class MainActivity : AppCompatActivity() {

    private lateinit var bindingMain : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingMain = ActivityMainBinding.inflate(layoutInflater)
        val view = bindingMain.root
        setContentView(view)

        // Url = http://kasimadalan.pe.hu/filmler/resimler/django.png

        bindingMain.buttonShowImage.setOnClickListener {

            val url = "http://kasimadalan.pe.hu/filmler/resimler/django.png"
            Picasso.get()
                .load(url)
                .resize(400,600)
                .rotate(90f)
                .placeholder(R.drawable.placeholder_image)
                .error(R.drawable.error_image)
                .into(bindingMain.imageView)
        }

    }
}