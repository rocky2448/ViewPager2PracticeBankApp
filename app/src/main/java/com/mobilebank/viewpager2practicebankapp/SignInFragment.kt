package com.mobilebank.viewpager2practicebankapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


class SignInFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_sign_in, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val name = arguments?.getString("name")
        val password = arguments?.getString("password")

        val userNameSignInET = view.findViewById<EditText>(R.id.userNameSignInET)
        val passwordSignInET = view.findViewById<EditText>(R.id.passwordSignInET)
        val loginSignInBTN = view.findViewById<Button>(R.id.loginSignInBTN)

        loginSignInBTN.setOnClickListener {
            if (name != userNameSignInET.text.toString() ||
                password != passwordSignInET.text.toString()) {
                Toast.makeText(context, "Логин или пароль введены неверно!", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            } else {
                fragmentManager?.beginTransaction()?.replace(R.id.containerID, MainFragment())?.commit()
            }
        }


    }


}