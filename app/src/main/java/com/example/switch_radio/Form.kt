package com.example.switch_radio

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import androidx.fragment.app.Fragment

class Form : Fragment() {
    private var rootView: View? = null
    private lateinit var country : AutoCompleteTextView
    private var countryAdapter: ArrayAdapter<String>? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        rootView = inflater.inflate(R.layout.form, container, false)
        initUI()
        return rootView
    }
    private fun initUI(){
        country =rootView?.findViewById(R.id.autocomplete_country) as AutoCompleteTextView
        val countries: Array<out String> = resources.getStringArray(R.array.country)
        countryAdapter = ArrayAdapter(requireContext(), android.R.layout.simple_list_item_1, countries)
        country.setAdapter(countryAdapter)
    }
}