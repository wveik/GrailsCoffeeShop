package ru.yandex

class OrderItem {

    Integer qty
    Float total

    static belongsTo = [order: OnlineOrder, product: Product]

    static constraints = {
    }
}
