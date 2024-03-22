package com.example.foodtracker.ui.tracking

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.foodtracker.R
import com.example.foodtracker.data.trackedDayData
import com.example.foodtracker.databinding.FragmentTrackingBinding

class TrackingFragment : Fragment() {
    private var _binding: FragmentTrackingBinding? = null
    private val binding get() = _binding!!
    //private val viewModel by viewModels<AccountViewModel> { getViewModelFactory() }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentTrackingBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val trackingAdapter = TrackingAdapter(dataset = trackedDayData)
        binding.daysRecyclerView.adapter = trackingAdapter
        binding.graphView.setImageResource(R.drawable.graph)
        binding.fabPicture.setOnClickListener {
            // ID is defined in navigation/home_navigation
            findNavController().navigate(R.id.action_trackingFragment_to_pictureFragment)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}