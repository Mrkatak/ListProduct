package com.example.listproduct

data class Product(
    val id: Int,
    val image: Int,
    val title: String,
    val price: Int
)



object SampleData {
    val Products = listOf(
        Product(1, R.drawable.img_aloevera, "Aloe Vera", 20000 ),
        Product(2, R.drawable.img_bonsai, "Bonsai", 50000 ),
        Product(3, R.drawable.img_satin, "Satin", 25000 ),
        Product(4, R.drawable.img_kaktus_mini, "Kaktus", 30000 ),
        Product(5, R.drawable.img_aloevera, "Mini Aloe Vera", 20000 ),
        Product(6, R.drawable.img_bonsai, "Mini Bonsai", 50000 ),
        Product(7, R.drawable.img_satin, "Satin", 25000 ),
        Product(8, R.drawable.img_kaktus_mini, "Mini Kaktus", 30000 ),
    )
}


