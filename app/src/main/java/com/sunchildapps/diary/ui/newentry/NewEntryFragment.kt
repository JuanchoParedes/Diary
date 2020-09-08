package com.sunchildapps.diary.ui.newentry

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.sunchildapps.diary.R

class NewEntryFragment : Fragment() {

    private lateinit var newEntryViewModel: NewEntryViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        newEntryViewModel =
                ViewModelProviders.of(this).get(NewEntryViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_new_entry, container, false)
//        val textView: TextView = root.findViewById(R.id.text_dashboard)
//        newEntryViewModel.text.observe(viewLifecycleOwner, Observer {
//            textView.text = it
//        })
        return root
    }
}