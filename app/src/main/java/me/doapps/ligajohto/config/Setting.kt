package me.doapps.ligajohto.config

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
    }
}