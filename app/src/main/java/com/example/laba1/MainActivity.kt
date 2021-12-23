package com.example.laba1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var editTextNumber: EditText
    private lateinit var listView: TextView
    private var list: MutableList<Int> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editTextNumber = findViewById(R.id.editTextNumber)
        listView = findViewById(R.id.listView)
    }

    fun addToList(view: View){
        var newItem = editTextNumber.text.toString().toInt()
        list.add(newItem)
        editTextNumber.setText(null)
        listView.append(newItem.toString() + "\n")
    }

    fun sortList(view: View){
        val sort = Sort()
        val sortedList : MutableList<Int> = sort.sortList(list)

        listView.setText(null)

        listView.append(sortedList.joinToString())

    }

}