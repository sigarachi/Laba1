package com.example.laba1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var editTextNumber: EditText
    private lateinit var listView: TextView
    private var list: List<String> = emptyList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editTextNumber = findViewById(R.id.editTextNumber)
        listView = findViewById(R.id.listView)
    }

    fun addToList(view: View){
        var newItem = editTextNumber.text.toString()
        list.toMutableList().add(newItem)

        for(element in list){
           listView.append(element)
        }
    }

    fun sortList(view: View){
        val sort = Sort()
        var sortedList = sort.sortList(list)

        listView.append(sortedList.toString())

    }

}