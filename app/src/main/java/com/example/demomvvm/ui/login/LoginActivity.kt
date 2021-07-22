package com.example.demomvvm.ui.login

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.demomvvm.R
import com.example.demomvvm.databinding.ActivityLoginBinding
import com.example.demomvvm.ui.homemain.HomeMainActivity
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.gms.common.api.ApiException


class LoginActivity : AppCompatActivity() {

    private val RC_SIGN_IN: Int = 100
    lateinit var loginBinding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        loginBinding = DataBindingUtil.setContentView(this, R.layout.activity_login)
        setContentView(loginBinding.root)
        val gso = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
            .requestEmail()
            .build()
        val mGoogleSignInClient = GoogleSignIn.getClient(this, gso)
        loginBinding.signInButton.setOnClickListener {
            startActivity(Intent(this, HomeMainActivity::class.java))
//            val signInIntent = mGoogleSignInClient.signInIntent
//            startActivityForResult(signInIntent, RC_SIGN_IN)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == RC_SIGN_IN) {
            val task = GoogleSignIn.getSignedInAccountFromIntent(data)
            try {
                val account = task.getResult(ApiException::class.java).apply {

                }
                Log.w("nnn", "getSignedInAccountFromIntent=" + account?.id)
                Log.w("nnn", "getSignedInAccountFromIntent=" + account?.account)
                Log.w("nnn", "getSignedInAccountFromIntent=" + account?.displayName)
            } catch (e: ApiException) {
                Log.w("nnn", "signInResult:failed code=" + e.statusCode)
            }
        }
    }
}
