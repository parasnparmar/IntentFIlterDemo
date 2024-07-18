package com.example.intentfilterdemo

import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.intentfilterdemo.databinding.MyimageActivityBinding

class MyImageActivity : AppCompatActivity() {

    private lateinit var myimageActivityBinding: MyimageActivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        myimageActivityBinding = MyimageActivityBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(myimageActivityBinding.root)
//        if(intent.hasExtra("path")){
//            myimageActivityBinding.image.setImageURI(Uri.parse(intent.getStringExtra("path")))
//        }

        myimageActivityBinding.image.setImageURI(intent.data)
    }
}