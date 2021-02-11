package br.senai.sp.jandira.testefragment.holder

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.senai.sp.jandira.testefragment.R
import br.senai.sp.jandira.testefragment.model.Console

class ConsoleViewHolder(itemView: View): RecyclerView.ViewHolder (itemView){

    val textConsoleName = itemView.findViewById<TextView>(R.id.text_view_console_name)
    val consoleMaker= itemView.findViewById<TextView>(R.id.text_view_console_maker)
    val consoleImage = itemView.findViewById<ImageView>(R.id.console_image)
    val releaseDate = itemView.findViewById<TextView>(R.id.console_release_date)

    fun bind(console: Console){

        textConsoleName.text = console.consoleName
        consoleMaker.text = console.consoleMaker
        consoleImage.setImageDrawable(console.consoleImage)
        releaseDate.text = console.consoleReleaseDate
    }


}