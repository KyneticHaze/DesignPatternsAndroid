package com.furkanharmanc.designpatterns.desenler

/*

Bir alt sınıflarının nesnelerini oluşturmasını sağlayan bir yöntem tanımlar

Bir sınıfın alt sınıflarının nesnelerini oluşturması gerektiğinde kullanılır.

 */

// Ürün arayüzü
interface Urun {
    fun operation() : String
}

// Ürünü oluşturan fabrika arayüzü
interface UrunFactory {
    fun UrunYarat(): Urun
}

class ConcreteUrun1: Urun {
    override fun operation(): String = "Product 1 operation"
}

class ConcreteUrun2: Urun {
    override fun operation(): String = "Product 2 operation"
}

class ConcreteUrun1Factory: UrunFactory {
    override fun UrunYarat(): Urun {
        return ConcreteUrun1()
    }
}

class ConcreteUrun2Factory: UrunFactory {
    override fun UrunYarat(): Urun {
        return ConcreteUrun2()
    }
}