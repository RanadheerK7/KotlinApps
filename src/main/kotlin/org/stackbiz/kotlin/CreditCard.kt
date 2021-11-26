package org.stackbiz.kotlin

interface CreditCard {
    val cardNumber:Int
    fun eligibleForLoan(age:Int)
}

class MasterCard(override val cardNumber: Int) :CreditCard {
    override fun eligibleForLoan(age: Int) {
        if (age < 60) {
            println("Eligible for loan")
        } else {
            println("Not eligible for loan")
        }
    }
}

class VisaCard(override val cardNumber: Int) :CreditCard {
    override fun eligibleForLoan(age: Int) {
        if (age < 65) {
            println("Eligible for loan")
        } else {
            println("Not eligible for loan")
        }
    }
}

class Paypal(client:CreditCard): CreditCard by client {
    //It has own functions also there
}

fun main() {
    val masterCard = MasterCard(76437)
    println("MasterCard number: ${masterCard.cardNumber}")
    println("${masterCard.eligibleForLoan(50)}")

    val paypal = Paypal(masterCard)
    println("Card number: ${paypal.cardNumber}")

    val visaCard = VisaCard(88787)
    println("MasterCard number: ${visaCard.cardNumber}")
    println("${visaCard.eligibleForLoan(70)}")

    val payPal = Paypal(visaCard)
    println("Card number: ${payPal.cardNumber}")
}