package me.doapps.ligajohto.config

import me.doapps.ligajohto.R
import me.doapps.ligajohto.model.Evolution

class Setting {
    companion object {
        fun listHome(): MutableList<Pair<String, String>> {
            val listItem = mutableListOf<Pair<String, String>>()
            listItem.add(Pair("Pokedex", "green"))
            listItem.add(Pair("Moves", "red"))
            listItem.add(Pair("Abilities", "blue"))
            listItem.add(Pair("Items", "yellow"))
            listItem.add(Pair("Locations", "purple"))
            listItem.add(Pair("Type Charts", "brown"))
            return listItem
        }

        fun listStats(): MutableList<Pair<String, Int>> {
            val listItem = mutableListOf<Pair<String, Int>>()
            listItem.add(Pair("HP", 45))
            listItem.add(Pair("Attack", 60))
            listItem.add(Pair("Defense", 48))
            listItem.add(Pair("Sp. Atk", 50))
            listItem.add(Pair("Sp. Def", 65))
            listItem.add(Pair("Speed", 45))
            return listItem
        }


        fun listEvolution(): MutableList<Evolution> {
            val listItem = mutableListOf<Evolution>()
            listItem.add(
                Evolution(
                    first = "Bulbasaur",
                    second = "Ivysaur",
                    imageFirst = R.drawable.bulbasaur,
                    imageSecond = R.drawable.ivysaur,
                    level = 16
                )
            )
            listItem.add(
                Evolution(
                    first = "Ivysaur",
                    second = "Venusaur",
                    imageFirst = R.drawable.ivysaur,
                    imageSecond = R.drawable.venusaur,
                    level = 16
                )
            )
            return listItem
        }
    }
}