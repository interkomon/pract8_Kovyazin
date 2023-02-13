import java.lang.Exception

class cinema {
    var name:String = "Чебурашка"
    var perfomance:String = "Дневной"
    var ticketprice:Double = 210.0
    var hall:Int = 5
    var spectators:Int = 50



    fun initially()
    {
        println("Название кинофильма: $name")
        println("Сеанс: $perfomance")
        println("Стоимость билета: $ticketprice")
        println("Зал: $hall")
        println("Количество зрителей: $spectators")

    }
    fun input() {
        try {
            println("Введите название кинофильма:")
            var name = readLine()!!.toString()
            if (name >= "a" && name <= "z" || name >= "а" && name <= "я" || name >= "A" && name <= "Z" || name >= "A" && name <= "Я")
             else println("Ошибка,только буквы,попробуйте еще!")
                println("Введите сеанс :")
                var perfomance = readLine()!!.toString()
            if (perfomance >= "a" && perfomance <= "z" || perfomance >= "а" && perfomance<= "я" || perfomance >= "A" && perfomance <= "Z" || perfomance >= "A" && perfomance <= "Я")
            else println("Ошибка,только буквы,попробуйте еще!")
                println("Введите стоимость билета:")
                var ticketprice = readLine()!!.toDouble()
            if (ticketprice < 0 ) println("Ошибка, не может быть меньше нуля")
                println("Введите номер зала:")
                var hall = readLine()!!.toInt()
            if (hall < 0 ) println("Ошибка, не может быть меньше нуля")
                println("Введите количество зрителей:")
                var spectators = readLine()!!.toInt()
                if (spectators < 0) println("Ошибка, не может быть меньше нуля")
                println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~")
                println("Название кинофильма: $name")
                println("Сеанс: $perfomance")
                println("Стоимость билета: $ticketprice")
                println("Зал: $hall")
                println("Количество зрителей: $spectators")
                println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~")




            }
        catch(e:Exception)
        {
            println("Ошибка, попробуйте еще раз")
        }
        }
    fun conclusion() {
            try {
                println("Сколько вы хотите купить билетов ?")
                var count = readLine()!!.toInt()
                if (count < 0 ) println("Ошибка, не может быть меньше нуля")
                var tickets = count * ticketprice
                println("Стоимость билетов составит: ${tickets}")
            }
            catch(e:Exception)
            {
                println("Ошибка, попробуйте еще раз")
            }
        }

}