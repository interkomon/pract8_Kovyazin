import java.lang.Exception

class product {
    var name:String = "Микроволновая печь"
    var price:Double = 1000.0
    var units:String = "шт"
    var type:String = "бытовая теххника"
    var quantity:Int = 5


    fun primarily()
    {
        println("Название товара: $name")
        println("Цена: $price")
        println("Единица измерения: $units")
        println("Вид товара: $type")
        println("Количество: $quantity")

    }
    fun inlet() {
        try {
            println("Введите название товара:")
            var name = readLine()!!.toString()
            if (name >= "a" && name <= "z" || name >= "а" && name <= "я" || name >= "A" && name <= "Z" || name >= "A" && name <= "Я")
            else println("Ошибка, не может быть меньше нуля")
                println("Введите цену :")
                var price = readLine()!!.toDouble()
                if (price < 0 ) println("Ошибка, не может быть меньше нуля")
                    println("Введите единицу измерения:")
                    var units = readLine()!!.toString()
                if (units >= "a" && units <= "z" || units >= "а" && units <= "я" || units >= "A" && units <= "Z" || units >= "A" && units <= "Я")
                else println("Ошибка, не может быть меньше нуля")
                    println("Введите вид товара:")
                    var type = readLine()!!.toString()
                if (type >= "a" && type <= "z" || type >= "а" && type <= "я" || type >= "A" && type <= "Z" || type >= "A" && type <= "Я")
                else println("Ошибка, не может быть меньше нуля")
                    println("Введите количество товара:")
                    var quantity = readLine()!!.toInt()
                    if (quantity < 0) println("Ошибка, не может быть меньше нуля")
                    println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~")
                    println("Название товара: $name")
                    println("Цена: $price")
                    println("Единица измерения: $units")
                    println("Вид товара $type")
                    println("Количество: $quantity")
                    println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~")



        }
        catch(e: Exception)
        {
            println("Ошибка, попробуйте еще раз")
        }
    }
    fun deduction() {
        try {
            println("Сколько вы хотите купить штук товара ?")
            var count = readLine()!!.toInt()
            if (count < 0 ) println("Ошибка, не может быть меньше нуля")
            var stoimost = count * price
            println("Стоимость составит ${stoimost}")
        }
        catch(e: Exception)
        {
            println("Ошибка, попробуйте еще раз")
        }
    }
}