package com.example.movingbooks

data class BookModel(
    val title: String,
    val description: String,
    val calories: String,
    val rate: String,
    val imgId: Int
)

val BookDummyData: ArrayList<BookModel> = arrayListOf(
    BookModel(
        "Lore",
        "Every seven years, the Agon begins. As punishment for a past rebellion, nine Greek gods are forced to walk the earth as mortals, hunted by the descendants of ancient bloodlines, all eager to kill a god and seize their divine power and immortality.",
        "Fantasy",
        "3.84",
        R.drawable.lore
    ),
    BookModel(
        "House of Hollow",
        "Seventeen-year-old Iris Hollow has always been strange. Something happened to her and her two older sisters when they were children, something they can’t quite remember but that left each of them with an identical half-moon scar at the base of their throats.",
        "Fantasy",
        "4.09",
        R.drawable.house_of_hallow
    ),
    BookModel(
        "Once There Were Wolves",
        "Inti Flynn arrives in Scotland with her twin sister, Aggie, to lead a team of biologists tasked with reintroducing fourteen gray wolves into the remote Highlands. She hopes to heal not only the dying landscape, but Aggie, too, unmade by the terrible secrets that drove the sisters out of Alaska.",
        "Fiction",
        "4.23",
        R.drawable.one_there_where_wolves
    ),
    BookModel(
        "Neuromancer",
        "Hotwired to the leading edges of art and technology, Neuromancer is a cyberpunk, science fiction masterpiece—a classic that ranks with 1984 and Brave New World as one of the twentieth century’s most potent visions of the future.",
        "SyFy",
        "3.90",
        R.drawable.neuromancer
    ),
    BookModel(
        "The Book of Dust",
        "Malcolm's father runs an inn called the Trout, on the banks of the river Thames, and all of Oxford passes through its doors. Malcolm and his dæmon, Asta, routinely overhear news and gossip, and the occasional scandal, but during a winter of unceasing rain, Malcolm catches wind of something new: intrigue.",
        "Fantasy",
        "4.14",
        R.drawable.the_book_of_dust
    ),
    BookModel(
        "The Whisper Man",
        "Still devastated after the loss of his wife, Tom Kennedy and his young son Jake move to the sleepy village of Featherbank, looking for a fresh start.",
        "Thriller",
        "4.05",
        R.drawable.the_wisper_man
    ),
    BookModel(
        "The Mime Order",
        "As Scion turns its all-seeing eye on the dreamwalker, the mime-lords and mime-queens of the city's gangs are invited to a rare meeting of the Unnatural Assembly. Jaxon Hall and his Seven Seals prepare to take centre stage, but there are bitter fault lines running through the clairvoyant community and dark secrets around every corner.",
        "Fantasy",
        "4.20",
        R.drawable.the_mind_order
    )
)