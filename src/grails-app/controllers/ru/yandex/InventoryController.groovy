package ru.yandex

class InventoryController {

    def index() {
        render "Hello world"
    }

    def edit() {
        def productName = "Breakfast Blend"
        def sku = "BB01"

        [product : productName, sku : sku]
    }

    def remove() {
        render "Remove"
    }
}
