data class Note(private val name : String, private val text : String){

    fun readNote() {
        println("\nТекст заметки:\n" + this.text + "\n")
    }

    override fun toString(): String{
        return name
    }
}
