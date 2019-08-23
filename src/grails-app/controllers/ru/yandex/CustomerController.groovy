package ru.yandex

class CustomerController {

    static scaffold = true

    def lookup() {
        //def customerInstance = Customer.list(sort:"lastName", order:"desc", max: 10, offset:10)
        //def customerInstance = Customer.findAllByLastName("Foster")

        //def customerInstance = Customer.findAllByTotalPoints(5,[sort:"lastName",order:"desc" ])

        //def customerInstance = Customer.findAllByLastNameLike("B%")
        //def customerInstance = Customer.findAllByTotalPointsGreaterThan(3)
        //def customerInstance = Customer.findAllByTotalPointsGreaterThanEquals(3,[sort:"totalPoints",order:"desc"])


        //def customerInstance = Customer.findAllByTotalPointsBetween(2,4,[sort:"totalPoints",order:"desc"])

        //def customerInstance = Customer.findAllByFirstNameAndTotalPoints("Bo", 3)

        //def customerInstance = Customer.findAllByFirstNameAndTotalPoints("Bo", 3)

        def customerInstance = Customer.findAllByFirstNameLikeAndTotalPoints("B%", 3)

        //def customerInstance = Customer.findByPhone(params.id)
        [customerInstanceList: customerInstance]
    }

    def checkin() {

    }
}
