package com.live.emmazone.activities.provider

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import com.live.emmazone.R
import com.live.emmazone.databinding.ActivityMainBinding
import com.live.emmazone.databinding.ActivityWithdrawalBinding

class WithdrawalActivity : AppCompatActivity() {
    lateinit var binding: ActivityWithdrawalBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWithdrawalBinding.inflate(layoutInflater)
        setContentView(binding.root)

        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)

      binding.back.setOnClickListener {
          onBackPressed()
      }

        binding.btnAddBank.setOnClickListener {
           val intent = Intent(this, AddBankAccountActivity::class.java)
            startActivity(intent)
          //  binding.edtWithdrawAmt.setText("$10.00")
           // binding.btnAddBank.visibility = View.INVISIBLE

        }

    }
}