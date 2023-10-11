package com.example.ecommerce.entities.domain


data class Product(
    var  id: Long? = null,
    var title: String? = null,
    var price: Double? = null,
    var category:String? = null,
    var description:String? = null,
    var image:String? = null,
    var rating: Rating?= null
)
data class Rating(
    var rate: Double?= null,
    var count: Int?= null
)
