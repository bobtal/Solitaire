class GameModel {
    val deck = Deck()
    val wastePile: MutableList<Card> = mutableListOf()
    val foundationPiles = arrayOf(
            FoundationPile("Clubs"),
            FoundationPile("Diamonds"),
            FoundationPile("Hearts"),
            FoundationPile("Spades")
    )
}