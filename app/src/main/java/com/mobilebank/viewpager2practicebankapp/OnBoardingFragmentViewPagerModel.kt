package com.mobilebank.viewpager2practicebankapp

import java.io.Serializable

class OnBoardingFragmentViewPagerModel(
    val title: String?,
    val imageView: Int?,
    var checkButton: Boolean?
) : Serializable {

    companion object {
        val viewPagerList = mutableListOf(
            OnBoardingFragmentViewPagerModel(
                "Банк Офшор",
                (R.drawable.nakop_schet2),
                true
            ),
            OnBoardingFragmentViewPagerModel(
                "Банк Офшор",
                (R.drawable.credit),
                true
            ),
            OnBoardingFragmentViewPagerModel(
                "Храни деньги в Офшоре!",
                (R.drawable.bank),
                false
            )
        )
    }
}