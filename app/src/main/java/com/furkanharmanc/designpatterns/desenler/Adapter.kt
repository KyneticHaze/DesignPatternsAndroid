package com.furkanharmanc.designpatterns.desenler


class Request {
    fun specificRequest(): String {
        return "Specific request"
    }
}

/**
 * Bir arayüzü başka bir arayüze dönüştürmek için kullanılır.
 *
 * İki farklı arayüzün birbirine uyumlu hale getirilmesi gereken durumlarda kullanılır.
 *
 * @author Furkan Harmancı
 */
class Adapter(private val request: Request) {
    fun request(): String {
        return request.specificRequest()
    }
}