package br.senai.sp.jandira.testefragment.data.dao

import android.content.Context
import br.senai.sp.jandira.testefragment.R
import br.senai.sp.jandira.testefragment.model.Console

class ConsoleDataSource {

    companion object {
        fun getConsoles(context: Context): ArrayList<Console> {
            var console = ArrayList<Console>()

            console.add(Console(1,
                context.getDrawable(R.drawable.ps5)!!,
                "Playstation 5",
                "Sony",
                "Data de Lançamento: 19 de Novembro de 2020 ",
                "Memória RAM: 16 GB GDDR6; Largura de banda da RAM: 448 GB/s, Armazenamento interno: SSD customizado de 825 GB"
            )
            )
            console.add(Console(2,
                context.getDrawable(R.drawable.xbox)!!,
                "XBOX 360",
                "Microsoft",
                "Data de Lançamento: 22 de novembro de 2005 ",
                "O Xbox 360 é um videogame da Microsoft lançado primeiramente em 22 de novembro de 2005. O console substitui o Xbox antigo para ser o grande concorrente do PlayStation 3 na batalha da sétima geração de videogames."
            )
            )
            console.add(Console(3,
                context.getDrawable(R.drawable.ps4)!!,
                "Playstation 4",
                "Sony",
                "Data de Lançamento: 15 de novembro de 2013 ",
                "O Playstation 4 é um video game da Sony lançado em 2013. ... Enquanto o do PS4 Slim fica entre R$ 1.500 e R$ 2.000. As edições Slim e Pro têm 8GB de memória RAM GDDR5"
            )
            )
            console.add(Console(4,
                context.getDrawable(R.drawable.ps3)!!,
                "Playstation 3",
                "Sony",
                "Data de Lançamento: 15 de novembro de 2013 ",
                "O PlayStation 3 é um console muito popular que foi desenvolvido pela Sony. O controle funciona sem fio com excelente autonomia da sua bateria. Além disso, o console tem um leitor de Blu-ray."
            )
            )
            return console
        }
    }

}