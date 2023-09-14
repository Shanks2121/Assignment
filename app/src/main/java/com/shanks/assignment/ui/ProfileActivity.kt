package com.shanks.assignment.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.gson.Gson
import com.shanks.assignment.R
import com.shanks.assignment.databinding.ActivityProfileBinding
import com.shanks.assignment.firebaseClient.FirebaseClient
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class ProfileActivity : AppCompatActivity() {
    lateinit var binding : ActivityProfileBinding
    @Inject
    lateinit var firebaseClient: FirebaseClient


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.tvProfileUsername.text = firebaseClient.currentUsername
    }
}