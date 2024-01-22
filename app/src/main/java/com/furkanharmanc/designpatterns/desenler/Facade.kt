package com.furkanharmanc.designpatterns.desenler

class Subsystem1 {
    fun operation1(): String {
        return "Subsystem 1 operation"
    }
}

class Subsystem2 {
    fun operation2(): String {
        return "Subsystem 2 operation"
    }
}

/**
 * Bir alt sistemdeki karmaşıklığı gizleyerek istemcinin sadece basit bir arayüzle iletişim kurmasını sağlar.
 *
 * Karmaşık bir alt sistem varsa ve bu sistemle etkileşimi basitleştirmek isteniyorsa kullanılır.
 *
 * @author Furkan Harmancı
 */
class Facade(private val subsystem1: Subsystem1, private val subsystem2: Subsystem2) {
    fun performOperation() : String {
        val result1 = subsystem1.operation1()
        val result2 = subsystem2.operation2()
        return "$result1\n$result2"
    }
}