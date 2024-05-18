package com.example.smartfridge.FoodDiary

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.smartfridge.R
import com.example.smartfridge.sampledata.Употребленные_продукты

class FoodDiaryCardView_adapter (private val context: Context, modelArrayList: ArrayList<Употребленные_продукты>) :
    RecyclerView.Adapter<FoodDiaryCardView_adapter.Viewholder>() {
        private val ModelArrayList: ArrayList<Употребленные_продукты>
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodDiaryCardView_adapter.Viewholder {
            // to inflate the layout for each item of recycler view.
            val view: View = LayoutInflater.from(parent.context).inflate(R.layout.fragment_food_diary, parent, false)
            return Viewholder(view)
        }

        override fun onBindViewHolder(holder: Viewholder, position: Int) {
            // to set data to textview and imageview of each card layout
            //val model: Употребленные_продукты = ModelArrayList[position]
            //holder.ProductName.setText(model.Наименование)
            //holder.checkBox.isChecked=false
        }





        override fun getItemCount(): Int {
            // this method is used for showing number of card items in recycler view.
            return ModelArrayList.size
        }



        class Viewholder (itemView: View) : RecyclerView.ViewHolder(itemView) {
            val ProductName: TextView
            val BZU: TextView
            init {
                ProductName = itemView.findViewById(R.id.tvProductName)
                BZU = itemView.findViewById(R.id.textViewBZU)
            }
        }

        // Constructor
        init {
            this.ModelArrayList = modelArrayList
        }
    }