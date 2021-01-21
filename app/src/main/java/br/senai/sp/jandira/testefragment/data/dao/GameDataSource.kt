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
                4.5,
                listOf(
                    Console(1,"Playstation 1", "Sony", "1996-12-01"),
                    Console(2,"Xbox 360", "Microsoft", "1986-12-01")))
            )
            games.add(Game(2,
                "Resident evil 4",
                context.getDrawable(R.drawable.resident_evil_4)!!,
                "Residente evil é muito Legal",
                5.0,
                listOf(
                    Console(1,"Playstation 1", "Sony", "1996-12-01"),
                    Console(2,"Xbox 360", "Microsoft", "1986-12-01"),
                    Console(3,"PC", "Microsoft", "1986-12-01")))
            )
            games.add(Game(3,
                "Beyond Good&Evil",
                context.getDrawable(R.drawable.beyond)!!,
                "Beyond Good&Evil jogo de aventura",
                4.7,
                listOf(
                    Console(1,"Playstation 2", "Sony", "1996-12-01"),
                    Console(2,"Xbox 360", "Microsoft", "1986-12-01")))
            )

            return games
        }
    }
}