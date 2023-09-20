class MenuLogic() {
    internal fun <T> createMenu(list: MutableList<Pair<T, () -> Unit>>) {
        do {
            list.forEachIndexed { index, pair ->
                val name = pair.first.toString()
                println("[$index]  - $name")
            }
            println("Выберете пункт меню")
            val input = readLine()?.toIntOrNull()
            if (input != null && input in 0 until list.size) {
                list[input].second.invoke()
            } else {
                println("Ошибка ввода, попробуйте еще раз")
            }
        } while (true)

    }
}