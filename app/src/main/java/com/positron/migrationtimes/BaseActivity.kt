package com.positron.migrationtimes

import android.content.Intent
import android.content.res.Configuration
import android.os.Build
import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.v4.app.ActivityOptionsCompat
import android.support.v4.view.GravityCompat
import android.support.v4.widget.DrawerLayout
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_base.*
import kotlinx.android.synthetic.main.toolbar.*

open class BaseActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    private lateinit var drawer: DrawerLayout
    private lateinit var toggle: ActionBarDrawerToggle
    private lateinit var toolbar: Toolbar
    private lateinit var navigationView: NavigationView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_base)

        navigationView = nav_view
        toolbar = _toolbar

        setSupportActionBar(toolbar)

        drawer = drawer_layout
        toggle = ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        drawer.addDrawerListener(toggle)
        toggle.syncState()
        navigationView.setNavigationItemSelectedListener(this)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeButtonEnabled(true)

        setNavigationViewCheckedItem()


    }

    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)
        toggle.syncState()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onConfigurationChanged(newConfig: Configuration?) {
        super.onConfigurationChanged(newConfig)
        toggle.onConfigurationChanged(newConfig)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.nav_item_home -> {
                if (this::class.java == MainActivity::class.java) {
                    drawer.closeDrawer(GravityCompat.START)
                    true
                }
                else {
                    drawer.closeDrawer(GravityCompat.START)
                    val intent = Intent(this, MainActivity::class.java)

                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                        val options = ActivityOptionsCompat.makeSceneTransitionAnimation(this)
                        startActivity(intent, options.toBundle())
                    }

                    else {
                        startActivity(intent)
                    }

                    true
                }

            }

            R.id.nav_item_find_jobs -> {
                if (this::class.java == JobsActivity::class.java) {
                    drawer.closeDrawer(GravityCompat.START)
                    true
                }

                else {
                    drawer.closeDrawer(GravityCompat.START)
                    val intent = Intent(this, JobsActivity::class.java)

                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                        val options = ActivityOptionsCompat.makeSceneTransitionAnimation(this)
                        startActivity(intent, options.toBundle())
                    }

                    else {
                        startActivity(intent)
                    }

                    true
                }

            }

            R.id.nav_item_immigration -> {
                if (this::class.java == ImmigrationsActivity::class.java) {
                    drawer.closeDrawer(GravityCompat.START)
                    true
                }

                else {
                    drawer.closeDrawer(GravityCompat.START)
                    val intent = Intent(this, ImmigrationsActivity::class.java)

                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                        val options = ActivityOptionsCompat.makeSceneTransitionAnimation(this)
                        startActivity(intent, options.toBundle())
                    }

                    else {
                        startActivity(intent)
                    }

                    true
                }

            }

            R.id.nav_item_visa -> {
                if (this::class.java == VisasActivity::class.java) {
                    drawer.closeDrawer(GravityCompat.START)
                    true
                }

                else {
                    drawer.closeDrawer(GravityCompat.START)
                    val intent = Intent(this, VisasActivity::class.java)

                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                        val options = ActivityOptionsCompat.makeSceneTransitionAnimation(this)
                        startActivity(intent, options.toBundle())
                    }

                    else {
                        startActivity(intent)
                    }

                    true
                }

            }

            R.id.nav_item_work -> {
                if (this::class.java == WorksActivity::class.java) {
                    drawer.closeDrawer(GravityCompat.START)
                    true
                }

                else {
                    drawer.closeDrawer(GravityCompat.START)
                    val intent = Intent(this, WorksActivity::class.java)

                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                        val options = ActivityOptionsCompat.makeSceneTransitionAnimation(this)
                        startActivity(intent, options.toBundle())
                    }

                    else {
                        startActivity(intent)
                    }

                    true
                }

            }

            R.id.nav_item_study -> {
                if (this::class.java == StudiesActivity::class.java) {
                    drawer.closeDrawer(GravityCompat.START)
                    true
                }

                else {
                    drawer.closeDrawer(GravityCompat.START)
                    val intent = Intent(this, StudiesActivity::class.java)

                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                        val options = ActivityOptionsCompat.makeSceneTransitionAnimation(this)
                        startActivity(intent, options.toBundle())
                    }

                    else {
                        startActivity(intent)
                    }

                    true
                }

            }

            R.id.nav_item_find_scholarship -> {
                if (this::class.java == ScholarshipsActivity::class.java) {
                    drawer.closeDrawer(GravityCompat.START)
                    true
                }

                else {
                    drawer.closeDrawer(GravityCompat.START)
                    val intent = Intent(this, ScholarshipsActivity::class.java)

                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                        val options = ActivityOptionsCompat.makeSceneTransitionAnimation(this)
                        startActivity(intent, options.toBundle())
                    }

                    else {
                        startActivity(intent)
                    }

                    true
                }

            }

            else -> super.onOptionsItemSelected(item)
        }

    }

    override fun onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    private fun setNavigationViewCheckedItem() {
        when {
            this::class.java == MainActivity::class.java -> {
                val menu = navigationView.menu
                val menuItem = menu.findItem(R.id.nav_item_home)
                menuItem.isChecked = true
            }
            this::class.java == JobsActivity::class.java -> {
                val menu = navigationView.menu
                val menuItem = menu.findItem(R.id.nav_item_find_jobs)
                menuItem.isChecked = true
            }
            this::class.java == VisasActivity::class.java -> {
                val menu = navigationView.menu
                val menuItem = menu.findItem(R.id.nav_item_visa)
                menuItem.isChecked = true
            }
            this::class.java == ImmigrationsActivity::class.java -> {
                val menu = navigationView.menu
                val menuItem = menu.findItem(R.id.nav_item_immigration)
                menuItem.isChecked = true
            }
            this::class.java == WorksActivity::class.java -> {
                val menu = navigationView.menu
                val menuItem = menu.findItem(R.id.nav_item_work)
                menuItem.isChecked = true
            }
            this::class.java == StudiesActivity::class.java -> {
                val menu = navigationView.menu
                val menuItem = menu.findItem(R.id.nav_item_study)
                menuItem.isChecked = true
            }
            this::class.java == ScholarshipsActivity::class.java -> {
                val menu = navigationView.menu
                val menuItem = menu.findItem(R.id.nav_item_find_scholarship)
                menuItem.isChecked = true
            }
        }

    }
}
