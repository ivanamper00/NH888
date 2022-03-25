package com.hunew.nh888.presentation.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.navigation.fragment.navArgs
import com.dakuinternational.common.domain.model.DataContent
import com.dakuinternational.common.ui.base.BaseFragment
import com.dakuinternational.common.ui.binding.viewBinding
import com.google.gson.Gson
import com.hunew.nh888.R
import com.hunew.nh888.databinding.FragmentDetailsBinding
import com.hunew.nh888.presentation.getColor

class DetailsFragment : BaseFragment(R.layout.fragment_details) {

    private val binding by viewBinding(FragmentDetailsBinding::bind)

    private val args : DetailsFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.item = Gson().fromJson(args.dataContent, DataContent::class.java)

        binding.mainBackground.backgroundTintList = ContextCompat.getColorStateList(
            requireContext(), getColor(args.position)
        )

        binding.backButton.setOnClickListener {
            onBackPressed()
        }
    }

}