package com.example.gya.bottomstacknavigation.common

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.recyclerview.widget.RecyclerView

abstract class AbstractViewHolder(
    parent: ViewGroup, @LayoutRes layout: Int
) : RecyclerView.ViewHolder(
    LayoutInflater.from(parent.context).inflate(layout, parent, false)
)
