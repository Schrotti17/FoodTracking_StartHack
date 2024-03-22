package com.example.foodtracker.ui.lessons

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.foodtracker.databinding.FragmentLessonsBinding


class LessonsFragment : Fragment() {
    private var _binding: FragmentLessonsBinding? = null
    private val binding get() = _binding!!
    //private val viewModel by viewModels<AccountViewModel> { getViewModelFactory() }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentLessonsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}