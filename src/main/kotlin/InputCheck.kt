    internal fun inputCheck() : String{
        var input : String
        do {
            input = readLine()!!
            if (input.isEmpty()) println("Ошибка: введена пустая строка. Повторите ввод.")
        }
        while (input.isEmpty())
        return input
    }
