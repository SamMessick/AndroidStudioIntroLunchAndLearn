package com.example.lunchandlearn.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.findNavController
import com.example.lunchandlearn.R

class SecondFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_second, container, false)

        // Retrieve the view objects from the inflated layout, could be done with View Binding
        val button2 : Button = view.findViewById(R.id.button2)
        val textView2 : TextView = view.findViewById(R.id.textView2)

        /* This is an example of a lambda expression being passed as an argument
         * in Kotlin. It makes code shorter and simpler without losing meaning.
         * compared to Java. "it" stands for iterator as used in functional maps
         */

        // Set the button click response
        button2.setOnClickListener {
            // Navigate to the second fragment
            it.findNavController().popBackStack() }
        return view
    }
}