package com.example.traveltour

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.drawable.BitmapDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.core.graphics.drawable.toDrawable
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.io.ByteArrayOutputStream

class MainActivity : AppCompatActivity() {
    private lateinit var rvTravels: RecyclerView
    private var list: ArrayList<Travel> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvTravels = findViewById(R.id.rv_travels)
        rvTravels.setHasFixedSize(true)

        list.addAll(TravelsData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvTravels.layoutManager = LinearLayoutManager(this)
        val listTravelAdapter = ListTravelAdapter(list)
        rvTravels.adapter = listTravelAdapter

        listTravelAdapter.setOnItemClickCallback(object : ListTravelAdapter.OnItemClickCallback{
            override fun onItemClicked(data: Travel) {
                showSelectorHero(data)
            }
        })
    }

    override fun onCreateOptionsMenu(menu : Menu) : Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean{
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when(selectedMode) {
            R.id.about_page -> {
                val moveAbout = Intent(this@MainActivity, AboutActivity::class.java)
                startActivity(moveAbout)
            }
            R.id.main_page -> {
                showRecyclerList()
            }
        }
    }

    private fun showSelectorHero(trv: Travel) {
        Toast.makeText(this, "You choose "+trv.name, Toast.LENGTH_SHORT).show()
        var moveDetail = Intent(this@MainActivity, DetailActivity::class.java)

        moveDetail.putExtra(DetailActivity.EXTRA_NAME, trv.name )
        moveDetail.putExtra(DetailActivity.EXTRA_LOCATION, trv.location)
        moveDetail.putExtra(DetailActivity.EXTRA_CATEGORY, trv.categories)
        moveDetail.putExtra(DetailActivity.EXTRA_DESC, trv.description)
        moveDetail.putExtra(DetailActivity.EXTRA_COUNTRY, trv.country)
        moveDetail.putExtra(DetailActivity.EXTRA_PRICE, trv.price)
        moveDetail.putExtra(DetailActivity.EXTRA_PHOTO, trv.photo)
        startActivity(moveDetail)
    }
}