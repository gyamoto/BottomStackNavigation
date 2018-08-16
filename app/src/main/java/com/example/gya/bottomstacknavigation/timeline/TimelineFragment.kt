package com.example.gya.bottomstacknavigation.timeline

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import com.example.gya.bottomstacknavigation.R
import com.example.gya.bottomstacknavigation.common.AbstractViewHolder
import kotlinx.android.synthetic.main.fragment_timeline.view.*
import kotlinx.android.synthetic.main.item_timeline.view.*

class TimelineFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_timeline, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val adapter = Adapter()
        view.timelines.adapter = adapter

        val items = (1..10).map {
            Timeline(it, "No.$it title", "note".repeat(it))
        }
        adapter.submitList(items)
    }

    inner class ViewHolder(parent: ViewGroup) : AbstractViewHolder(parent, R.layout.item_timeline) {

        fun bind(timeline: Timeline) {
            itemView.title.text = timeline.title
            itemView.note.text = timeline.note
            itemView.setOnClickListener { }
        }
    }

    inner class Adapter : ListAdapter<Timeline, ViewHolder>(
        object : DiffUtil.ItemCallback<Timeline>() {

            override fun areItemsTheSame(old: Timeline, new: Timeline): Boolean = old.id == new.id

            override fun areContentsTheSame(old: Timeline, new: Timeline): Boolean = old == new
        }) {

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            return ViewHolder(parent)
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            holder.bind(getItem(position))
        }
    }

    companion object {

        fun newInstance(): TimelineFragment = TimelineFragment()
    }
}
