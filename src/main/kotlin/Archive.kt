class Archive(private val name : String) {
    var listOfNotes : MutableList<Pair<Note, () -> Unit>> = mutableListOf()
    private val menuLogic = MenuLogic()

    fun showNoteList() {
        println("Заметки. Здесь вы можете добавлять новые заметки и читать ранее созданые.")
        if (listOfNotes.isEmpty()){
            listOfNotes.add(Pair(Note("Назад","")) { back() })
            listOfNotes.add(Pair(Note("Добавить заметку", "")) { addNote() })
        }
        menuLogic.createMenu(listOfNotes)
    }
    fun addNote() {
        println("Введите название заметки. Поле не может быть пустым.")
        val name = inputCheck()
        println("Введите текст заметки. Поле не может быть пустым.")
        val text = inputCheck()
        val newNote = Note(name, text)
        listOfNotes.add(Pair(newNote) { newNote.readNote() })
    }
    fun back(){
        return menuLogic.createMenu(listOfArhives)

    }

    override fun toString(): String {
        return name
    }

}
