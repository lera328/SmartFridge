package com.example.smartfridge.shopping_list

import android.content.Context
import android.os.Build
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.RecyclerView
import com.example.smartfridge.R
import com.example.smartfridge.sampledata.Продукты_в_холодильнике
import com.example.smartfridge.sampledata.Списки_покупок
import java.time.Period

class ShoppingListCardView_adapter(private val context: Context, modelArrayList: ArrayList<Списки_покупок>) :
    RecyclerView.Adapter<ShoppingListCardView_adapter.Viewholder>() {
    private val ModelArrayList: ArrayList<Списки_покупок>
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShoppingListCardView_adapter.Viewholder {
        // to inflate the layout for each item of recycler view.
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.card_view_for_shopping_list, parent, false)
        return Viewholder(view)
    }

    override fun onBindViewHolder(holder: Viewholder, position: Int) {
        // to set data to textview and imageview of each card layout
        val model: Списки_покупок = ModelArrayList[position]
        holder.ProductName.setText(model.Наименование)
        holder.checkBox.isChecked=false
    }





    override fun getItemCount(): Int {
        // this method is used for showing number of card items in recycler view.
        return ModelArrayList.size
    }



    class Viewholder (itemView: View) : RecyclerView.ViewHolder(itemView) {
        val ProductName: TextView
        var checkBox: CheckBox
        init {
            ProductName = itemView.findViewById(R.id.tvProductName)
            checkBox = itemView.findViewById(R.id.checkBox)
        }
    }

    // Constructor
    init {
        this.ModelArrayList = modelArrayList
    }
}