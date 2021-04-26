package com.example.demomvvm.ui.homemain

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import com.example.demomvvm.R
import com.example.demomvvm.databinding.ActivityHomeMainBinding
import kotlinx.android.synthetic.main.activity_home_main.*
import kotlinx.android.synthetic.main.navigation_footer.view.*
import kotlinx.android.synthetic.main.navigation_header.view.*

class HomeMainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeMainBinding
    private val navController by lazy {
        findNavController(R.id.nav_host_fragment)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupToolBar()
        setupDrawerLayout()
    }

    private fun setupToolBar() {
        setSupportActionBar(binding.toolBar)
        supportActionBar?.run {
            setDisplayHomeAsUpEnabled(true)
            setDisplayShowTitleEnabled(false)
        }
    }

    private fun setupDrawerLayout() {
        binding.navView.setupWithNavController(navController)
        NavigationUI.setupActionBarWithNavController(this, navController, binding.drawerLayout)
        binding.navView.getHeaderView(0).apply {
            this.imageCloseMenu.setOnClickListener {
                binding.drawerLayout.closeDrawers()
            }
            this.textEmail.text = "quachhongkhoa.it@gmail.com"
            this.textName.text = "Quách Hồng Khoa"
        }
        binding.footerNav.run {
            textMemberOut.setOnClickListener {
                Toast.makeText(this@HomeMainActivity, "Out member", Toast.LENGTH_SHORT)
                    .show()
            }
            textLogout.setOnClickListener {
                Toast.makeText(this@HomeMainActivity, "Logout", Toast.LENGTH_SHORT)
                    .show()
            }
        }
    }

    override fun onBackPressed() {
        if (binding.drawerLayout.isDrawerOpen(GravityCompat.START)) {
            binding.drawerLayout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        return NavigationUI.navigateUp(navController, binding.drawerLayout)
    }
}