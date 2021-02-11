package br.senai.sp.jandira.testefragment.fragments

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.senai.sp.jandira.testefragment.R
import br.senai.sp.jandira.testefragment.adapter.GameAdapter
import br.senai.sp.jandira.testefragment.data.dao.GameDataSource
import br.senai.sp.jandira.testefragment.model.Game

class GamesFragment : Fragment() {

    private lateinit var recyclerGames: RecyclerView
    private val gameAdapter = GameAdapter()
    private var gameList = listOf<Game>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_games, container, false)

        //Instanciar a RecyclerView

        recyclerGames = view.findViewById(R.id.recycler_view_games)

        //Determinar a orientação a recyclerview

//        recyclerGames.layoutManager = LinearLayoutManager(view.context)
        recyclerGames.layoutManager = LinearLayoutManager(view.context, LinearLayoutManager.HORIZONTAL,false)

        // informar para recyclerview o adapter que ela irá utilizar

        recyclerGames.adapter = gameAdapter

        // Dizer ao adapter qual é a fonte de DADOS

        gameList = GameDataSource.getGames(view.context)

        // Atualizar a lista de josgos do adapter

        gameAdapter.updateGameList(gameList)

        // retornar o menu
        setHasOptionsMenu(true)
        return view
    }
    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)

        inflater.inflate(R.menu.menu_game, menu)
    }
}