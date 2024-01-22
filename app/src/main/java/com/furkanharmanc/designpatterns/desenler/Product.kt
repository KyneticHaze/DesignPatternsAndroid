package com.furkanharmanc.designpatterns.desenler

/**
 * Nesnelerin karmaşık oluşturma süreçlerini basitleştirmek için kullanılır.
 *
 * Nesne oluşturma işi çok adımlı ise kullanılır.
 *
 * @author Furkan Harmancı
 */
class Product private constructor(
    val property1 : String,
    val property2 : Int,
    val property3 : Boolean
) {
    class Builder {
        private var property1: String = ""
        private var property2: Int = 0
        private var property3: Boolean = false

        fun setProperty1(value: String) = apply { property1 = value }
        fun setProperty2(value: Int) = apply { property2 = value }
        fun setProperty3(value: Boolean) = apply { property3 = value }

        fun build() = Product(property1, property2, property3)
    }
}