package br.senai.sp.jandira.testefragment.data.dao

import android.content.Context
import br.senai.sp.jandira.testefragment.R
import br.senai.sp.jandira.testefragment.model.Console
import br.senai.sp.jandira.testefragment.model.Game

class GameDataSource {

    companion object {
        fun getGames(context: Context): ArrayList<Game> {
            var games = ArrayList<Game>()

            games.add(Game(1,
                "Mortal Kombat",
                context.getDrawable(R.drawable.mortal_kombat)!!,
                "Mortal Kombat é muito Legal",
                3.0f,
                listOf(
                    Console(1,"Playstation 1", "Sony", "1996-12-01"),
                    Console(2,"Xbox 360", "Microsoft", "1986-12-01"),
                    Console(3,"PC", "Microsoft", "1986-12-01")))
            )
            games.add(Game(2,
                "Resident evil 4",
                context.getDrawable(R.drawable.resident_evil_4)!!,
                "É o sexto jogo principal da franquia Resident Evil. ... A história de Resident Evil 4 segue o agente especial do governo dos Estados Unidos Leon S. Kennedy, que é enviado em uma missão para resgatar Ashley Graham, filha do presidente americano, que foi raptada por uma seita macabra.",
                5.0f,
                listOf(
                    Console(1,"Playstation 1", "Sony", "1996-12-01"),
                    Console(2,"Xbox 360", "Microsoft", "1986-12-01")))
            )
            games.add(Game(3,
                "Beyond Good&Evil",
                context.getDrawable(R.drawable.beyond)!!,
                "Beyond Good&Evil jogo de aventura",
                4.5f,
                listOf(
                    Console(1,"Playstation 2", "Sony", "1996-12-01"),
                    Console(2,"Xbox 360", "Microsoft", "1986-12-01")))
            )
                games.add(Game(4,
                "Counter Strike",
                context.getDrawable(R.drawable.csgo)!!,
                "Counter-Strike: Global Offensive é um jogo online desenvolvido pela Valve Corporation e pela Hidden Path Entertainment, sendo uma sequência de Counter-Strike: Source. É o quarto título principal da franquia.",
                5f,
                listOf(
                    Console(3,"PC", "Microsoft", "1986-12-01")))
            )

            return games
        }
    }
}