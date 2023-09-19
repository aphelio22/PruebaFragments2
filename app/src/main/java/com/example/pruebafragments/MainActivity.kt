package com.example.pruebafragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.ButtonBarLayout
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    lateinit var navigation : BottomNavigationView
    private val mOnNavMenu = BottomNavigationView.OnNavigationItemSelectedListener {
        item ->

        when (item.itemId){
            R.id.fragament1 -> {
                supportFragmentManager.commit {
                    replace<PrimerFragment>(R.id.frameLayout)
                    setReorderingAllowed(true)
                    addToBackStack("replacement")
                }
                return@OnNavigationItemSelectedListener true
            }
            R.id.fragament2 -> {
                supportFragmentManager.commit {
                    replace<SegundoFragmento>(R.id.frameLayout)
                    setReorderingAllowed(true)
                    addToBackStack("replacement")
                }
                return@OnNavigationItemSelectedListener true
            }
            R.id.fragament3 -> {
                supportFragmentManager.commit {
                    replace<TercerFragmento>(R.id.frameLayout)
                    setReorderingAllowed(true)
                    addToBackStack("replacement")
                }
                return@OnNavigationItemSelectedListener true
            }

        }

        false
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigation = findViewById(R.id.appMenu)
        navigation.setOnNavigationItemSelectedListener(mOnNavMenu)

        }
    }
