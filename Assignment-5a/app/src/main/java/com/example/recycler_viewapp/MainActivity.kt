package com.example.recycler_viewapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val exampleList = generateFakeData(100)
        val rv: RecyclerView = findViewById(R.id.rv)
        rv.layoutManager = LinearLayoutManager(this)
        rv.setHasFixedSize(true)
        rv.adapter = MyAdapter(exampleList)
    }

    private fun generateFakeData(size: Int): List<data> {
        val list = ArrayList<data>()
        var image: Int = 0
        var name: String = ""
        var species: String = ""
        var location: String = ""
        for(i in 0 until size){
            when(i%4){
                0-> {
                    image = R.drawable.aster_flower
                    name = "Aster"
                    species = "Symphyotrichum novae-angliae"
                    location = "Eastern U.S (New England/New York)"
                } 1-> {
                    image =  R.drawable.hyacinth_flower
                    name = "Hyacinth"
                    species="Asparagaceae Scilloideae"
                    location = "South America (Amazon Basin"
                } 2 -> {
                    image = R.drawable.face_flower
                    name = "Monkey Face Orchid"
                    species = "Dracula simia"
                    location = "South America (Peru, C"
                } else -> {
                image = R.drawable.lip_flower
                name = "Hooker's Lips"
                species = "Psychotria elata"
                location = "South America (Columbia, Costa Rica, Panama)"
                }
            }
            list += data(image, name, "Species: $species", "Native to: $location")
        }
        return list
    }
}