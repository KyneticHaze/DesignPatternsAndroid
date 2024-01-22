package com.furkanharmanc.designpatterns.desenler

// İlgili veya bağımlı nesne ailelerini oluşturmak için kullanılır.

interface Button {
    fun paint(): String
}

interface TextBox {
    fun display(): String
}

// Soyut fabrika arayüzü
interface GUIFactory {
    fun createButton(): Button
    fun createTextBox(): TextBox
}

// Android için somut ürün ailesi
class AndroidButton : Button {

    override fun paint(): String {
        return "Android Button"
    }

}
class AndroidTextBox : TextBox {

    override fun display(): String {
        return "Android TextBox"
    }

}

// Android için somut fabrika
class AndroidFactory: GUIFactory {
    override fun createButton(): Button {
        return AndroidButton()
    }

    override fun createTextBox(): TextBox {
        return AndroidTextBox()
    }
}