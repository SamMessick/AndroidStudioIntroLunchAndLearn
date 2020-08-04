package com.example.lunchandlearn.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.lunchandlearn.R


class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // You may wish to look up View Binding, which enables you to
        // generate a set of static classes that reference objects. It
        // is much simpler and faster than this elementary implementation.
        // https://developer.android.com/topic/libraries/view-binding

        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_first, container, false)

        // Retrieve the view objects from the inflated layout, could be done with View Binding
        val button: Button = view.findViewById(R.id.button)
        val textView: TextView = view.findViewById(R.id.textView)

        /* This is an example of a lambda expression being passed as an argument
         * in Kotlin. It makes code shorter and simpler without losing meaning.
         * compared to Java. "it" stands for iterator as used in functional maps
         */

        // Set the button click response
        button.setOnClickListener {
            // Navigate to the second fragment
            it.findNavController().navigate(R.id.action_firstFragment_to_secondFragment2)
        }
        return view
    }
}