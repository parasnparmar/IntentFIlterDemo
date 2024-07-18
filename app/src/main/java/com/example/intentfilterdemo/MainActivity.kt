package com.example.intentfilterdemo

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.os.StrictMode
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.intentfilterdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var activityMainBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.root)

        StrictMode.setVmPolicy(StrictMode.VmPolicy.Builder().build())

        activityMainBinding.btnViewImage.setOnClickListener {
               //way 2 for intent -> (changes in Agrument)
//            val intent = Intent(this,MyImageActivity::class.java)
//            intent.setAction("com.example.action.media.VIEW")
            val intent = Intent("com.example.action.media.VIEW")
            intent.setAction("com.example.action.media.VIEW")
            intent.addCategory("com.example.category.TECHNICAL")

            intent.setDataAndType(Uri.parse("file://${activityMainBinding.edtPath.text.toString()}"),"image/png")

//            intent.putExtra("path",activityMainBinding.edtPath.text.toString())
           startActivity(intent)
        }

    }
}