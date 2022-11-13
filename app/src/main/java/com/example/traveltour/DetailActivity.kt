package com.example.traveltour

import android.content.Intent
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.result.contract.ActivityResultContracts
import java.security.AccessController.getContext


class DetailActivity : AppCompatActivity(), View.OnClickListener {

    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_LOCATION = "extra_location"
        const val EXTRA_PHOTO = "extra_photo"
        const val EXTRA_DESC = "extra_desc"
        const val EXTRA_PRICE = "extra_price"
        const val EXTRA_COUNTRY = "extra_country"
        const val EXTRA_CATEGORY = "extra_categories"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val btnShareActivity: Button = findViewById(R.id.action_share)
        val btnBackActivity : Button = findViewById(R.id.btn_back)

        btnBackActivity.setOnClickListener(this)

        btnShareActivity.setOnClickListener(this)

        val tvNameReceived: TextView = findViewById(R.id.name_received)
        val tvLocReceived: TextView = findViewById(R.id.location_received)
        val tvDescReceived: TextView = findViewById(R.id.desc_received)
        val tvPriceReceived: TextView = findViewById(R.id.price_received)
        val tvCountryReceived: TextView = findViewById(R.id.country_received)
        val tvCategoryReceived: TextView = findViewById(R.id.categories_received)
        val tvImageReceived : ImageView = findViewById(R.id.img_received)

        val name = intent.getStringExtra(EXTRA_NAME)
        val location = intent.getStringExtra(EXTRA_LOCATION)
        val desc = intent.getStringExtra(EXTRA_DESC)
        val price = intent.getIntExtra(EXTRA_PRICE,0)
        val country = intent.getStringExtra(EXTRA_COUNTRY)
        val categories = intent.getStringExtra(EXTRA_CATEGORY)
        val photo = intent.getIntExtra(EXTRA_PHOTO, 0)


        tvNameReceived.text = name
        tvLocReceived.text = location
        tvDescReceived.text = desc
        tvCountryReceived.text = country
        tvCategoryReceived.text = categories
        tvPriceReceived.text = price.toString()
        tvImageReceived.setImageResource(photo)
    }

    override fun onClick(p0: View?) {
        if (p0 != null) {
            when(p0.id) {
                R.id.btn_back -> {
                    val moveBackActivity = Intent(this@DetailActivity, MainActivity::class.java)
                    startActivity(moveBackActivity)
                }

                R.id.action_share -> {
                    val intent = Intent()
                    intent.action = Intent.ACTION_SEND
                    intent.type = "text/plain"
                    intent.putExtra(Intent.EXTRA_TEXT, "http://wa.me/6282329212758")
                    startActivity(Intent.createChooser(intent, "Share with:"))
                }
            }
        }
    }
}