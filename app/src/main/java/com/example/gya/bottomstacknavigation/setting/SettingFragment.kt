package com.example.gya.bottomstacknavigation.setting

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.gya.bottomstacknavigation.R
import kotlinx.android.synthetic.main.fragment_setting.view.*

class SettingFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_setting, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.setting.setOnClickListener { }
    }

    companion object {

        fun newInstance(): SettingFragment = SettingFragment()
    }
}