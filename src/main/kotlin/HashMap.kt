fun main() {
    var vegCart = HashMap<String, Double>()
    vegCart["Tomato"] = 20.0
    vegCart["Brinjal"] = 25.0
    vegCart["Capsicum"] = 30.0
    vegCart["Cauliflower"] = 40.0
    vegCart["Carrot"] = 35.0

    for (key in vegCart.keys) {
        println("Vegetable:$key, Price:${vegCart[key]}")
    }

}