package com.example.gya.bottomstacknavigation.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.gya.bottomstacknavigation.R
import kotlinx.android.synthetic.main.fragment_profile.view.*

class ProfileFragment : Fragment() {

    private val postId: Int by lazy { ProfileFragmentArgs.fromBundle(arguments).postId }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_profile, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.post_id.text = postId.toString()

        view.favorite.setOnClickListener {
            Navigation.createNavigateOnClickListener(R.id.action_profile_to_detail).onClick(it)
        }
    }
}
