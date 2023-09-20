import kotlin.system.exitProcess

var listOfArhives: MutableList<Pair<Archive, () -> Unit>> = mutableListOf()
class ArchiveList() {

    fun createStartList(): MutableList<Pair<Archive, () -> Unit>> {
        println("Добро пожаловать в приложение 'Заметки'. Для выбора меню введите соответствующую цифру и нажмите Enter.")
        listOfArhives.add(Pair(Archive("Выход")) { stop(listOfArhives) })
        listOfArhives.add(Pair(Archive("Создать новый архив")) { addNewArchive() })
        return listOfArhives
    }
    fun addNewArchive() {
        println("Введите имя архива")
        val archiveName = inputCheck()
        val newArchive = Archive(archiveName)
        listOfArhives.add(Pair(newArchive) { newArchive.showNoteList() })

    }
    fun stop(list: MutableList<Pair<Archive, () -> Unit>>) {
        list.clear()
        exitProcess(0)
    }
}
