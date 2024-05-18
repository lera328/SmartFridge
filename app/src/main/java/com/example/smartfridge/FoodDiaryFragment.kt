package com.example.smartfridge

import android.annotation.SuppressLint
import android.opengl.Visibility
import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.annotation.DrawableRes
import androidx.annotation.RequiresApi
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import java.time.LocalDate

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [FoodDiaryFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class FoodDiaryFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }


    lateinit var tvDate: TextView
    lateinit var recyclerView_breakfast: RecyclerView
    lateinit var recyclerView_obed: RecyclerView
    lateinit var recyclerView_u: RecyclerView
    lateinit var btBreakfast: ImageButton
    lateinit var btobed: ImageButton
    lateinit var btU: ImageButton

    @SuppressLint("MissingInflatedId")
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_food_diary, container, false)
        tvDate = view.findViewById(R.id.textViewDate)
        tvDate.setText(LocalDate.now().toString())

        recyclerView_breakfast = view.findViewById(R.id.recyclerView_breakfast)
        recyclerView_obed = view.findViewById(R.id.recyclerView_obed)
        recyclerView_u = view.findViewById(R.id.recyclerView_u)
        btBreakfast = view.findViewById(R.id.btBreakfast)
        btobed = view.findViewById(R.id.btObed)
        btU = view.findViewById(R.id.bt_u)
        btBreakfast.setOnClickListener(View.OnClickListener {
            if (recyclerView_breakfast.visibility == View.GONE) {
                recyclerView_breakfast.visibility = View.VISIBLE
                btBreakfast.setImageResource(R.drawable.baseline_expand_less_24)
            } else {
                recyclerView_breakfast.visibility = View.GONE
                btBreakfast.setImageResource(R.drawable.baseline_expand_more_24)
            }
        })
        btobed.setOnClickListener(View.OnClickListener {
            if (recyclerView_obed.visibility == View.GONE) {
                recyclerView_obed.visibility = View.VISIBLE
                btobed.setImageResource(R.drawable.baseline_expand_less_24)
            } else {
                recyclerView_obed.visibility = View.GONE
                btobed.setImageResource(R.drawable.baseline_expand_more_24)
            }
        })
        btU.setOnClickListener(View.OnClickListener {
            if (recyclerView_u.visibility == View.GONE) {
                recyclerView_u.visibility = View.VISIBLE
                btU.setImageResource(R.drawable.baseline_expand_less_24)
            } else {
                recyclerView_u.visibility = View.GONE
                btU.setImageResource(R.drawable.baseline_expand_more_24)
            }
        })

        return view
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment FoodDiaryFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            FoodDiaryFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }

    fun btReceiptBookOnClick(view: View) {

    }

    fun btObed_onClick(view: View) {

    }

    fun bt_u_onClick(view: View) {

    }

    fun ImageButton.btBreakfast_onClick(view: View) {
        if (recyclerView_breakfast.visibility == View.GONE)
            recyclerView_breakfast.visibility = View.VISIBLE
        else recyclerView_breakfast.visibility = View.GONE
    }


}
