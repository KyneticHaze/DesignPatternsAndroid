package com.furkanharmanc.designpatterns

import com.furkanharmanc.designpatterns.desenler.Adapter
import com.furkanharmanc.designpatterns.desenler.AndroidFactory
import com.furkanharmanc.designpatterns.desenler.Button
import com.furkanharmanc.designpatterns.desenler.ConcreteUrun1Factory
import com.furkanharmanc.designpatterns.desenler.ConcreteUrun2Factory
import com.furkanharmanc.designpatterns.desenler.Facade
import com.furkanharmanc.designpatterns.desenler.GUIFactory
import com.furkanharmanc.designpatterns.desenler.Product
import com.furkanharmanc.designpatterns.desenler.Request
import com.furkanharmanc.designpatterns.desenler.SingletonExample
import com.furkanharmanc.designpatterns.desenler.Subsystem1
import com.furkanharmanc.designpatterns.desenler.Subsystem2
import com.furkanharmanc.designpatterns.desenler.TextBox
import com.furkanharmanc.designpatterns.desenler.Urun
import com.furkanharmanc.designpatterns.desenler.UrunFactory

fun main() {
    // Android geliştiricilerinin bilmesi gereken 6 tasarım deseni

    // Singleton
    val singleton = SingletonExample.doSomething()

    // Builder
    val product1 = Product.Builder()
        .setProperty1("Value 1")
        .setProperty2(42)
        .setProperty3(true)
        .build()

    // Adapter
    val request = Request()
    val adapter = Adapter(request)
    val result = adapter.request()

    // Facade
    val subsystem1 = Subsystem1()
    val subsystem2 = Subsystem2()
    val facade = Facade(subsystem1, subsystem2)
    val resultFacade = facade.performOperation()

    // Factory
    val factory1: UrunFactory = ConcreteUrun1Factory()
    val urun1: Urun = factory1.UrunYarat()
    val result1 = urun1.operation()

    val factory2: UrunFactory = ConcreteUrun2Factory()
    val urun2: Urun = factory2.UrunYarat()
    val result2 = urun2.operation()

    // Abstract Factory
    fun createAndroidUI(factory: GUIFactory): Pair<Button, TextBox> {
        val button = factory.createButton()
        val textBox = factory.createTextBox()
        return Pair(button, textBox)
    }

    val androidFactory = AndroidFactory()
    val androidUI = createAndroidUI(androidFactory)
}