package com.example.emojiview.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.example.emojiview.R
import com.example.emojiview.adapter.BookMarkAdapter
import com.example.emojiview.databinding.FragmentBookmarksBinding

class BookmarksFragment : Fragment() {

    private lateinit var binding: FragmentBookmarksBinding

    companion object {
        fun newInstance() = BookmarksFragment()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBookmarksBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment

        binding.bookmarkRecyclerView.apply {
            layoutManager = GridLayoutManager(requireContext(), 2)
            adapter = BookMarkAdapter(requireContext())

        }
        return binding.root
    }

}