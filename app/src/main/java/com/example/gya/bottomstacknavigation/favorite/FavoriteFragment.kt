package com.example.gya.bottomstacknavigation.favorite

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.gya.bottomstacknavigation.R
import kotlinx.android.synthetic.main.fragment_favorite.view.*

class FavoriteFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_favorite, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.profile.setOnClickListener {
            Navigation.createNavigateOnClickListener(R.id.action_favorite_to_detail).onClick(it)
        }
    }

    companion object {

        fun newInstance(): FavoriteFragment = FavoriteFragment()
    }
}
