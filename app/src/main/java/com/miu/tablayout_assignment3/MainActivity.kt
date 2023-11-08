package com.miu.tablayout_assignment3

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.TableRow
import android.widget.TextView
import androidx.core.view.marginTop
import com.miu.tablayout_assignment3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

    fun add(view: View) {

        val androidVersion: String = binding.av.text.toString()
        val codeName: String = binding.cn.text.toString()

        // Create a new table row.
        val tableRow = TableRow(applicationContext) // this
        // Set new table row layout parameters.
        val layoutParams = TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT)
        tableRow.layoutParams = layoutParams

        val tv1: TextView = TextView(this)
        tv1.text = androidVersion
        tv1.gravity = Gravity.CENTER_HORIZONTAL

        val tv2: TextView = TextView(this)
        tv2.text = codeName
        tv2.gravity = Gravity.CENTER_HORIZONTAL
        // add values into row by calling addView()
        tableRow.addView(tv1, 0)
        tableRow.addView(tv2, 1)
        tableRow.setBackgroundColor(Color.parseColor("#8A3954"))

        // Finally add the created row row into layout
        binding.table.addView(tableRow) // id from Layout_file
    }
}