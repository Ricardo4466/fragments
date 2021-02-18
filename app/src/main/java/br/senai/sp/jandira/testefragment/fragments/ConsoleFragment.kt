package br.senai.sp.jandira.testefragment.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.senai.sp.jandira.testefragment.R
import br.senai.sp.jandira.testefragment.adapter.ConsoleAdapter
import br.senai.sp.jandira.testefragment.model.Console


import br.senai.sp.jandira.testefragment.data.dao.ConsoleDataSource

import br.senai.sp.jandira.testefragment.model.Game

class ConsoleFragment : Fragment() {

    private lateinit var recyclerConsole: RecyclerView
    private val consoleAdapter = ConsoleAdapter()
    private var consoleList = listOf<Console>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_console, container, false)

        //Instanciar a RecyclerView

        recyclerConsole = view.findViewById(R.id.recycler_view_console)

        // recyclerConsole.layoutManager = LinearLayoutManager(view.context)

        recyclerConsole.layoutManager = LinearLayoutManager(view.context, LinearLayoutManager.HORIZONTAL,false)

        // informar para recyclerview o adapter que ela irá utilizar

        recyclerConsole.adapter = consoleAdapter

        // Dizer ao adapter qual é a fonte de DADOS

        consoleList = ConsoleDataSource.getConsoles(view.context)

        // Atualizar a lista de josgos do adapter

        consoleAdapter.updateConsoleList(consoleList)

        // retornar o menu
        setHasOptionsMenu(true)

        return view
    }

}