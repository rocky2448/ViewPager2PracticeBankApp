package com.mobilebank.viewpager2practicebankapp

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView


class ViewPagerFragment : Fragment() {

    private var check = true

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_view_pager, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val viewPagerTV: TextView = view.findViewById(R.id.viewPagerTV)
        val viewPagerIV: ImageView = view.findViewById(R.id.viewPagerIV)
        val startBTN: Button = view.findViewById(R.id.startBTN)

        val viewPagerItem = arguments?.getSerializable("vp") as OnBoardingFragmentViewPagerModel

        check = viewPagerItem.checkButton!!
        viewPagerTV.text = viewPagerItem.title
        viewPagerIV.setImageResource(viewPagerItem.imageView!!)

        if (!check) {
            startBTN.visibility = View.VISIBLE
            startBTN.setOnClickListener {
                startActivity(Intent(activity, StartActivity::class.java))
            }
        }
    }
}