package br.senai.sp.jandira.testefragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.MenuItem
import android.view.View
import android.widget.Button
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.ActionBarContainer
import androidx.appcompat.widget.DecorToolbar
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import br.senai.sp.jandira.testefragment.fragments.ConsoleFragment
import br.senai.sp.jandira.testefragment.fragments.GamesFragment
import br.senai.sp.jandira.testefragment.fragments.HomeFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity(),
//    View.OnClickListener,
    BottomNavigationView.OnNavigationItemSelectedListener,
    NavigationView.OnNavigationItemSelectedListener{

//    private lateinit var buttonHome: Button
//    private lateinit var buttonConsoles: Button
//    private lateinit var buttonGames: Button

    private lateinit var homeFragment: HomeFragment
    private lateinit var consoleFragment: ConsoleFragment
    private lateinit var gamesFragment: GamesFragment
    private lateinit var bottomNavigation: BottomNavigationView
    private lateinit var navigationView: NavigationView

    private lateinit var toolbar: Toolbar

    private lateinit var drawer : DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.drawer_navigation_layout)

//        buttonHome = findViewById(R.id.button_home)
//        buttonHome.setOnClickListener(this)
//
//        buttonConsoles = findViewById(R.id.button_consoles)
//        buttonConsoles.setOnClickListener(this)
//
//        buttonGames = findViewById(R.id.button_games)
//        buttonGames.setOnClickListener(this)

        homeFragment = HomeFragment()
        consoleFragment = ConsoleFragment()
        gamesFragment = GamesFragment()

        bottomNavigation = findViewById(R.id.bottom_navigation)
        bottomNavigation.setOnNavigationItemSelectedListener(this)

        navigationView = findViewById(R.id.navigation_view)
        navigationView.setNavigationItemSelectedListener(this)

        toolbar = findViewById(R.id.toolbar)

        drawer = findViewById(R.id.drawer)
        toolbar.setTitle("Home")
        setSupportActionBar(toolbar)


//        ADICIONAR BOTÃO QUE ABRE O DRAWER MENU

        var toggle = ActionBarDrawerToggle(this, drawer, toolbar, R.string.open_drawer, R.string.close_drawer)

        drawer.addDrawerListener(toggle)
        toggle.syncState()


        setFragment(homeFragment)

    }

//    override fun onClick(v: View) {
//        when (v.id) {
//            R.id.button_home -> {
//                supportFragmentManager
//                    .beginTransaction()
//                    .replace(R.id.frame, homeFragment)
//                    .commit()
//            }
//            R.id.button_consoles -> {
//                supportFragmentManager
//                    .beginTransaction()
//                    .replace(R.id.frame, consoleFragment)
//                    .commit()
//            }
//            R.id.button_games -> {
//                supportFragmentManager
//                    .beginTransaction()
//                    .replace(R.id.frame, gamesFragment)
//                    .commit()
//            }
//        }
//    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {

        when (item.itemId) {
            R.id.menu_home -> {
                toolbar.title = "Home"
                setFragment(homeFragment)
            }
            R.id.menu_console -> {
                toolbar.title = "Consoles"
                setFragment(consoleFragment)
            }
            R.id.menu_games -> {
                toolbar.title = "Games"
                setFragment(gamesFragment)
            }
        }
        // selecionar o item de menu na BottomNavigation
        var selectedMenu = bottomNavigation.menu.findItem(item.itemId)
        selectedMenu.setChecked(true)

        //Fehcar o drawer se estiver aberto

        if(drawer.isDrawerOpen(GravityCompat.START))
        {

            drawer.closeDrawer(GravityCompat.START)
        }


        return true
    }

    fun setFragment(fragment: Fragment){
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.frame, fragment)
            .commit()
    }
}