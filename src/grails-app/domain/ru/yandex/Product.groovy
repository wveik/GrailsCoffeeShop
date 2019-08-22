package ru.yandex

class Product {

    String name
    String sku
    Float price

    static hasMany = [orderItems: OrderItem]

    static constraints = {
    }
}
