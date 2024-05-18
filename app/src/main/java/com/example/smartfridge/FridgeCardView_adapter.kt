package com.example.smartfridge

import android.content.Context
import android.os.Build
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.RecyclerView
import com.example.smartfridge.sampledata.Продукты_в_холодильнике
import java.time.Period

class FridgeCardView_adapter(private val context: Context, courseModelArrayList: ArrayList<Продукты_в_холодильнике>) :
    RecyclerView.Adapter<FridgeCardView_adapter.Viewholder>() {
    private val courseModelArrayList: ArrayList<Продукты_в_холодильнике>
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FridgeCardView_adapter.Viewholder {
        // to inflate the layout for each item of recycler view.
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.card_view_for_product_in_fridge, parent, false)
        return Viewholder(view)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onBindViewHolder(holder: Viewholder, position: Int) {
        // to set data to textview and imageview of each card layout
        val model: Продукты_в_холодильнике = courseModelArrayList[position]
        holder.ProductName.setText(model.Наименование)
        var period=Period.of(0,0,model.СрокГодности)
        holder.ExpirationDate.setText(model.ДатаДобавления.plus(period).toString())
        holder.Residue.setText(model.Остаток.toString())
    }

    override fun getItemCount(): Int {
        // this method is used for showing number of card items in recycler view.
        return courseModelArrayList.size
    }



    class Viewholder (itemView: View) : RecyclerView.ViewHolder(itemView) {
        val ProductName: TextView
        val ExpirationDate: TextView
        val Residue: TextView
        init {
            ProductName = itemView.findViewById(R.id.tvProductName)
            ExpirationDate = itemView.findViewById(R.id.tvExpirationDate)
            Residue = itemView.findViewById(R.id.tvResidue)
        }
    }

    // Constructor
    init {
        this.courseModelArrayList = courseModelArrayList
    }
}