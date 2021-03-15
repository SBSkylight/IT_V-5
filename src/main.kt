import kotlin.math.*

// работа выполнена межгалактической командой it_v-5
fun main()
{
    val n =0
    while(n == 0){
        explorer()

        println("Хотите ли вы продолжить тестирование задач? [да/нет]")
        print("Ответ: "); var answer = readLine()!!.toString().toLowerCase()

        when(answer)
        {
            "lf","да","yes" -> continue
            "no", "ytn", "нет" -> break
            else -> {println("Программа не может распознать ваш ответ. Выполнятеся аварийный выход"); break}
        }
    }
}
fun explorer()
{
    println("Добро пожаловать! Эта программа является решебником по задачнику Абрамяна на языке Kotlin\nВнутренний синтаксис(Begin1 - b1)")
    print("Выберите задачу: "); var user_choise = readLine()
    when(user_choise)
    {
        "b1" ->Begin1()
        "b2" ->Begin2()
        "b3" ->Begin3()
        "b4" ->Begin4()
        "b5" ->Begin5()
        "b6" ->begin6()
        "b9" -> begin9()
        "b12" -> Begin12()
        "b13" -> Begin13()
        "b15" -> Begin15()
        "b25" -> begin25()
        "if4" -> If4()
        "if8" -> If8()
        "b33" -> Begin33()
        "i7"-> Interger7()
        "i9"-> Interger9()
        "i11"-> Integer11()
        "i28" -> Integer28()
        "f1" -> For1()
        "f2" -> For2()
        "f3" -> For3()
        "f4" -> For4()
        "f7" -> For7()
        "f8" -> For8()
        "f9" -> For9()
        "f10" -> For10()
        "fw10" -> For10_while()
        "f11" -> For11()
        "f15" -> For15()
        "f17" -> For17()
        "f19" -> For19()
        "f36" -> For36()
        "f37" -> For37()
        "f38" -> For38()
        "f39" -> For39()
        "f40" -> For40()
        "a1" -> Araray1()
        "if30" -> If30()
        "if29" -> If29()
        "if28" -> If28()
        "if1" -> If1()
        "if2" -> If2()
        "if3" -> If3()
        "if6" -> If6()
        "if12" -> If12()
        "if13" -> If13()
        "if14" -> If14()
        "if15" -> If15()
        "i1" -> integer1()
        "i19" -> Integer19()
        "i20" -> Integer20()
        "c1" -> Case1()
        "c2" -> Case2()
        "c3" -> Case3()
        "c4" -> Case4()
        "c5" -> Case5()
        "c6" -> Case6()
        "c7" -> Case7()
        else -> println("Такой задачи нет!")
    }
}

fun Begin1()
{
   var a = 5
   var P = 4*a
   println(P)
}

fun Begin2()
{
    var a = 100
    var S = a*a
    println(S)
}

fun Begin3()
{
    var a = 100
    var b = 400
    var S = a*b
    var P = 2*(a+b)
    println(S)
    println(P)
}

fun Begin4()
{
    var d = 100
    var p = 3.14
    var L = p * d
    println(L)
}

fun Begin5()
{
    var a = 100
    var V =a*a*a
    var S = 6*a*a
    println(V)
    println(S)
}

fun begin6()
{
    println("a: ")
    var a = readLine().toString().toDouble()
    println("b: ")
    var b = readLine().toString().toDouble()
    println("h: ")
    var h = readLine().toString().toDouble()
    var V = a*b*h
    var S = 2*(a*b+h*b+a*h)
    println("V = $V")
    println("S = $S")
}

fun Begin12()
{
    print("\nBegin12\nДаны катеты прямоугольного треугольника a и b. Найти его гипотенузу и периметр P.\n")
    print("Введите катет а: ")
    var a = readLine()!!.toDouble()
    print("Введите катет b: ")
    var b = readLine()!!.toDouble()
    var c = sqrt(a.pow(2)+b.pow(2))
    var cpow = (a.pow(2)+b.pow(2)).pow(0.5)
    var P = a+b+c
    var Pcpow = a+b+cpow
    print("Гипотенуза с = $c \n Гипотенуза сpow = $cpow \n")
    print("Периметр = $P \n Периметр(pow) = $Pcpow \n")
}

fun Integer11()
{
    print("Integer11.\nДано трехзначное число. Найти сумму и произведение его цифр.\n")
    print("Введите число от -999 до 999: ")
    var number = readLine()!!.toInt()
    println("Сотни: ${number/100}")
    println("Десятки: ${number%100/10}")
    println("Единицы: ${number%100%10}")
    println("Сумма: ${number/100+number%100/10+number%100%10}")
    println("Произведение: ${number/100*number%100/10*number%100%10}")
}

fun Interger7()
{
    print("Integer7.\n Дано дыухзначное число. Найтри сумму и произведение его цифр.\n")
    print("Введите число от -99 до 99: ")
    var number = readLine()!!.toInt()
    println("Десятки: ${number/10}")
    println("${number%10}")
    println("Сумма: ${number/10+number%10}")
    println("Произведение: ${number/10*number%10}")
}

fun Interger9()
{
    print("Integer9.\n Дано трёхзначное число. Используя одну операцию деления нацело, вывести первую цифру данного числа(сотни)\n")
    print("Введите число от -999 до 999: ")
    var number = readLine()!!.toInt()
    println("Сотни: ${number/100}")
}

fun Integer28()
{
    val days = mapOf(1 to "Понедельник", 2 to "Вторник", 3 to "Среда", 4 to "Четверг", 5 to "Пятница", 6 to "Суббота", 0 to "Воскресенье")

    print("Введите номер дня недели, которым было 1-е января: "); val N = readLine()!!.toInt()
    print("Введите номер дня года: "); val K = readLine()!!.toInt()
    var i = (1 + N - 1) % 7
    println("1-е января: 1\nДень недели: ${days[i]}\n")

    var n = (K + N - 1) % 7
    println("День года: $K\nДень недели: ${days[n]}")
}

fun For1()
{
    println("Введите целые числа K и N, большее нуля.")
    print("K: ");
    val K = readLine()!!.toInt()
    print("N: ");
    val N = readLine()!!.toInt()

    for (i in 0..N)
    {
        println(K)
    }
}

fun Araray1()
{
    print("Введите число N, большее нуля: "); val N = readLine()!!.toInt()
    val numbers: Array<Int> = Array(N) { 0 }
    for(i in 0..N)
    {
        numbers[i] = i * 2 + 1

    }
    println(numbers)
}

fun If30()
{
    val n = 0
    while(n == 0)
    {
        print("Введите число в диапазоне от 1 до 999: "); val number = readLine()!!.toInt()

        if (number >= 0 && number < 10)
        {
            if (number % 2 == 0)
                println("Число $number является чётным однозначным")
            else
                println("Число $number является нечётным однозначным")
        }
        else if (number >= 10 && number < 100)
        {
            if (number % 2 == 0)
                println("Число $number является чётным двузначным")
            else
                println("Число $number является нечётным двузначным")
        }
        else if (number >= 100 && number < 1000)
        {
            if (number % 2 == 0)
                println("Число $number является чётным трёхзначным")
            else
                println("Число $number является нечётным трёхзначным")
        }
        else if (number < 1 || number > 999)
        {
            println("Внимательнее читайте условие")
            break
        }

        println("Хотите продолжить? [да/нет]")
        print("Ответ: "); var answer = readLine()!!.toString().toLowerCase()

        when(answer)
        {
            "lf","да","yes" -> continue
            "no", "ytn", "нет" -> break
            else -> {println("Программа не может распознать ваш ответ. Выполнятеся аварийный выход"); break}
        }
    }
}

fun If29()
{
    val n = 0
    while(n == 0)
    {
        print("Введите целое число: "); val number = readLine()!!.toInt()
        if(number < 0)
        {
            if (number % 2 == 0)
                println("Число $number является чётным отрицательным")
            else
                println("Число $number является нечётным отрицательным")
        }
        else if(number > 0)
        {
            if (number % 2 == 0)
                println("Число $number является чётным положительным")
            else
                println("Число $number является нечётным положительным")
        }
        else if(number == 0)
            println("Число $number является нулевым")

        println("Хотите продолжить? [да/нет]")
        print("Ответ: "); var answer = readLine()!!.toString().toLowerCase()

        when(answer)
        {
            "lf","да","yes" -> continue
            "no", "ytn", "нет" -> break
            else -> {println("Программа не может распознать ваш ответ. Выполнятеся аварийный выход"); break}
        }
    }
}
fun If28()
{
    val n = 0
    while (n == 0)
    {
        print("Введите номер года: "); val number = readLine()!!.toInt()

        if(number % 4 == 0)
        {
            if(number % 100 == 0 && number % 400 != 0)
                println("$number год не является високосным. В нем 365 дней")
            else
                println("$number год является високосным. В нем 366 дней")
        }
        else
            println("$number год не является високосным. В нем 365 дней")

        println("Хотите продолжить? [да/нет]")
        print("Ответ: "); var answer = readLine()!!.toString().toLowerCase()

        when(answer)
        {
            "lf","да","yes" -> continue
            "no", "ytn", "нет" -> break
            else -> {println("Программа не может распознать ваш ответ. Выполнятеся аварийный выход"); break}
        }
    }
}
fun If1()
{
    val n = 0
    while(n == 0)
    {
        print("Введите целое число: "); var number = readLine()!!.toInt()

        if(number > 0)
            println("Число $number положительно.\nПрибавляем к нему 1\nРезультат: ${number + 1}")
        else if(number < 0)
            println("Число $number отрицательно.\nНикаких действий не выполняется\nРезультат: $number")
        else
            println("Число $number является нулём.")

        println("Хотите продолжить? [да/нет]")
        print("Ответ: "); var answer = readLine()!!.toString().toLowerCase()

        when(answer)
        {
            "lf","да","yes" -> continue
            "no", "ytn", "нет" -> break
            else -> {println("Программа не может распознать ваш ответ. Выполнятеся аварийный выход"); break}
        }
    }
}
fun If2()
{
    val n = 0
    while(n == 0)
    {
        print("Введите целое число: "); var number = readLine()!!.toInt()

        if(number > 0)
            println("Число $number положительно.\nПрибавляем к нему 1\nРезультат: ${number + 1}")
        else if(number < 0)
            println("Число $number отрицательно.\nВычитаем из него 2\nРезультат: ${number - 2}")
        else
            println("Число $number является нулём.")

        println("Хотите продолжить? [да/нет]")
        print("Ответ: "); var answer = readLine()!!.toString().toLowerCase()

        when(answer)
        {
            "lf","да","yes" -> continue
            "no", "ytn", "нет" -> break
            else -> {println("Программа не может распознать ваш ответ. Выполнятеся аварийный выход"); break}
        }
    }
}
fun If3()
{
    val n = 0
    while(n == 0)
    {
        print("Введите целое число: "); var number = readLine()!!.toInt()

        if(number > 0)
            println("Число $number положительно.\nПрибавляем к нему 1\nРезультат: ${number + 1}")
        else if(number < 0)
            println("Число $number отрицательно.\nВычитаем из него 2\nРезультат: ${number - 2}")
        else
            println("Число $number является нулём.\nЗаменяем его на 10\nРезультат: 10")

        println("Хотите продолжить? [да/нет]")
        print("Ответ: "); var answer = readLine()!!.toString().toLowerCase()

        when(answer)
        {
            "lf","да","yes" -> continue
            "no", "ytn", "нет" -> break
            else -> {println("Программа не может распознать ваш ответ. Выполнятеся аварийный выход"); break}
        }
    }
}

fun Case1()
{
    val n = 0
    while (n == 0)
    {
        print("Введите число от 1 до 7: "); val number = readLine()!!.toInt()

        when(number)
        {
            1 -> println("Понедельник")
            2 -> println("Вторник")
            3 -> println("Среда")
            4 -> println("Четверг")
            5 -> println("Пятница")
            6 -> println("Суббота")
            7 -> println("Воскресенье")
            else -> println("В неделе всего семь дней. Продлить выходные не получится")
        }

        println("Хотите продолжить? [да/нет]")
        print("Ответ: "); var answer = readLine()!!.toString().toLowerCase()

        when(answer)
        {
            "lf","да","yes" -> continue
            "no", "ytn", "нет" -> break
            else -> {println("Программа не может распознать ваш ответ. Выполнятеся аварийный выход"); break}
        }
    }
}

fun Case2()
{
    val n = 0
    while (n == 0)
    {
        print("Введите полученную отметку: "); val number = readLine()!!.toInt()

        when(number)
        {
            1 -> println("Плохо")
            2 -> println("Неудовлетворительно")
            3 -> println("Удовретворительно")
            4 -> println("Хорошо")
            5 -> println("Отлично")
            else -> println("ErRoR")
        }

        println("Хотите продолжить? [да/нет]")
        print("Ответ: "); var answer = readLine()!!.toString().toLowerCase()

        when(answer)
        {
            "lf","да","yes" -> continue
            "no", "ytn", "нет" -> break
            else -> {println("Программа не может распознать ваш ответ. Выполнятеся аварийный выход"); break}
        }
    }
}

fun Case3()
{
    val n = 0
    while (n == 0)
    {
        print("Введите номер месяца: "); val number = readLine()!!.toInt()

        when(number)
        {
            1,2,12 -> println("Зима")
            3,4,5 -> println("Весна")
            6,7,8 -> println("Лето")
            9,10,11 -> println("Осень")
            else -> println("Только раз в году...")
        }

        println("Хотите продолжить? [да/нет]")
        print("Ответ: "); var answer = readLine()!!.toString().toLowerCase()

        when(answer)
        {
            "lf","да","yes" -> continue
            "no", "ytn", "нет" -> break
            else -> {println("Программа не может распознать ваш ответ. Выполнятеся аварийный выход"); break}
        }
    }
}

fun Case4()
{
    val n = 0
    while (n == 0)
    {
        print("Введите номер месяца: "); val number = readLine()!!.toInt()

        when(number)
        {
            1 -> println("В этом месяце 31 день")
            2 -> println("В этом месяце 28 дней")
            3 -> println("В этом месяце 31 день")
            4 -> println("В этом месяце 30 дней")
            5 -> println("В этом месяце 31 день")
            6 -> println("В этом месяце 30 дней")
            7 -> println("В этом месяце 31 день")
            8 -> println("В этом месяце 31 день")
            9 -> println("В этом месяце 30 дней")
            10 -> println("В этом месяце 31 день")
            11 -> println("В этом месяце 30 дней")
            12 -> println("В этом месяце 31 день")
            else -> println("Только раз в году...")
        }

        println("Хотите продолжить? [да/нет]")
        print("Ответ: "); var answer = readLine()!!.toString().toLowerCase()

        when(answer)
        {
            "lf","да","yes" -> continue
            "no", "ytn", "нет" -> break
            else -> {println("Программа не может распознать ваш ответ. Выполнятеся аварийный выход"); break}
        }
    }
}

fun Case5()
{
    val n = 0
    while (n == 0)
    {
        print("Введите число A: "); val A = readLine()!!.toInt()
        print("Введите число B, неравное нулю: "); val B = readLine()!!.toInt()

        if (B != 0)
        {
            print("Введите номер арифметического действия [1 — сложение, 2 — вычитание, 3 — умножение, 4 — деление]: "); val action = readLine()!!.toInt()
            when(action)
            {
                1 -> println("$A + $B = ${A + B}")
                2 -> println("$A - $B = ${A - B}")
                3 -> println("$A * $B = ${A * B}")
                4 -> println("$A / $B = ${A / B}")
                else -> println("ErRoR")
            }
        }
        else
        {
            println("Попробуйте в другой раз")
            break
        }

        println("Хотите продолжить? [да/нет]")
        print("Ответ: "); var answer = readLine()!!.toString().toLowerCase()

        when(answer)
        {
            "lf","да","yes" -> continue
            "no", "ytn", "нет" -> break
            else -> {println("Программа не может распознать ваш ответ. Выполнятеся аварийный выход"); break}
        }
    }
}

fun Case6()
{
    val n = 0
    while (n == 0)
    {
        print("Введите длину отрезка A: "); val A = readLine()!!.toDouble()

        if (A > 0)
        {
            print("Введите номер нужной вам единицы длины [1 — дециметр,\n" +
                    "2 — километр, 3 — метр, 4 — миллиметр, 5 — сантиметр]: "); val dlina = readLine()!!.toInt()
            when(dlina)
            {
                1 -> println("$A дм = ${A / 10} м")
                2 -> println("$A км = ${A * 1000} м")
                3 -> println("$A м = $A м")
                4 -> println("$A мм = ${A / 1000} м")
                5 -> println("$A см = ${A / 100} м")
                else -> println("ErRoR")
            }
        }
        else
        {
            println("Попробуйте в другой раз")
            break
        }

        println("Хотите продолжить? [да/нет]")
        print("Ответ: "); var answer = readLine()!!.toString().toLowerCase()

        when(answer)
        {
            "lf","да","yes" -> continue
            "no", "ytn", "нет" -> break
            else -> {println("Программа не может распознать ваш ответ. Выполнятеся аварийный выход"); break}
        }
    }
}

fun Case7()
{
    val n = 0
    while (n == 0)
    {
        print("Введите массу тела A: "); val A = readLine()!!.toDouble()

        if (A > 0)
        {
            print("Введите номер нужной вам единицы массы [1 — килограмм,\n" +
                    "2 — миллиграмм, 3 — грамм, 4 — тонна, 5 — центнер]: "); val massa = readLine()!!.toInt()
            when(massa)
            {
                1 -> println("$A кг = $A кг")
                2 -> println("$A мг = ${A / 1000000} кг")
                3 -> println("$A г = ${A / 1000} кг")
                4 -> println("$A т = ${A * 1000} кг")
                5 -> println("$A ц = ${A / 100} кг")
                else -> println("ErRoR")
            }
        }
        else
        {
            println("Попробуйте в другой раз")
            break
        }

        println("Хотите продолжить? [да/нет]")
        print("Ответ: "); var answer = readLine()!!.toString().toLowerCase()

        when(answer)
        {
            "lf","да","yes" -> continue
            "no", "ytn", "нет" -> break
            else -> {println("Программа не может распознать ваш ответ. Выполнятеся аварийный выход"); break}
        }
    }
}

fun If12()
{
    val n = 0
    while(n != 1)
    {
        println("Введите три целых числа A, B и C, не равных друг другу")

        print("A: "); var A = readLine()!!.toInt()
        print("B: "); var B = readLine()!!.toInt()
        print("C: "); var C = readLine()!!.toInt()

        if(A != B && B != C && A != C)
        {
            if (( A < C && C < B) || (A < B && B < C))
                println("Наименьшее число: $A")
            else if (( C < B && B < A) || (C < A && A < B))
                println("Наименьшее число: $C")
            else if (( B < C && C < A) || (B < A && A < C))
                println("Наименьшее число: $B")
        }
        else
        {
            println("Вниметельнее читайте задание >:(")
            break
        }

        println("Хотите продолжить? [да/нет]")
        print("Ответ: "); var answer = readLine()!!.toString().toLowerCase()

        when(answer)
        {
            "lf","да","yes" -> continue
            "no", "ytn", "нет" -> break
            else -> {println("Программа не может распознать ваш ответ. Выполнятеся аварийный выход"); break}
        }
    }
}

fun If13()
{
    val n = 0
    while(n != 1)
    {
        println("Введите три целых числа A, B и C, не равных друг другу")

        print("A: "); var A = readLine()!!.toInt()
        print("B: "); var B = readLine()!!.toInt()
        print("C: "); var C = readLine()!!.toInt()

        if(A != B && B != C && A != C)
        {
            if ((A < C && C < B) || (B < C && C < A))
                println("Среднее число: $C")
            else if ((C < B && B < A) || (A < B && B < C))
                println("Среднее число: $B")
            else if ((B < A && A < C) || (C < A && A < B))
                println("Среднее число: $A")
        }
        else
        {
            println("Вниметельнее читайте задание >:(")
            break
        }

        println("Хотите продолжить? [да/нет]")
        print("Ответ: "); var answer = readLine()!!.toString().toLowerCase()

        when(answer)
        {
            "lf","да","yes" -> continue
            "no", "ytn", "нет" -> break
            else -> {println("Программа не может распознать ваш ответ. Выполнятеся аварийный выход"); break}
        }
    }
}

fun If14()
{
    val n = 0
    while(n != 1)
    {
        println("Введите три целых числа A, B и C, не равных друг другу")

        print("A: "); var A = readLine()!!.toInt()
        print("B: "); var B = readLine()!!.toInt()
        print("C: "); var C = readLine()!!.toInt()

        if(A != B && B != C && A != C)
        {
            if (A < C && C < B)
            {
                println("Наименьшее число: $A\nНаибольшее число: $B")
            }
            else if (A < B && B < C)
            {
                println("Наименьшее число: $A\nНаибольшее число: $C")
            }
            else if (B < C && C < A)
            {
                println("Наименьшее число: $B\nНаибольшее число: $A")
            }
            else if (B < A && A < C)
            {
                println("Наименьшее число: $B\nНаибольшее число: $C")
            }
            else if (C < B && B < A)
            {
                println("Наименьшее число: $C\nНаибольшее число: $A")
            }
            else if (C < A && A < B)
            {
                println("Наименьшее число: $C\nНаибольшее число: $B")
            }
        }
        else
        {
            println("Вниметельнее читайте задание >:(")
            break
        }

        println("Хотите продолжить? [да/нет]")
        print("Ответ: "); var answer = readLine()!!.toString().toLowerCase()

        when(answer)
        {
            "lf","да","yes" -> continue
            "no", "ytn", "нет" -> break
            else -> {println("Программа не может распознать ваш ответ. Выполнятеся аварийный выход"); break}
        }
    }
}

fun If15()
{
    val n = 0
    while(n != 1)
    {
        println("Введите три целых числа A, B и C, не равных друг другу")

        print("A: "); var A = readLine()!!.toInt()
        print("B: "); var B = readLine()!!.toInt()
        print("C: "); var C = readLine()!!.toInt()

        if(A != B && B != C && A != C)
        {
            if ((A < C && C < B) || (A < B && B < C))
            {
                println("Сумма наибольших чисел равна ${B + C}")
            }
            else if ((B < A && A < C) || (B < C && C < A))
            {
                println("Сумма наибольших чисел равна ${C + A}")
            }
            else if ((C < B && B < A) || (C < A && A < B))
            {
                println("Сумма наибольших чисел равна ${B + A}")
            }
        }
        else
        {
            println("Вниметельнее читайте задание >:(")
            break
        }

        println("Хотите продолжить? [да/нет]")
        print("Ответ: "); var answer = readLine()!!.toString().toLowerCase()

        when(answer)
        {
            "lf","да","yes" -> continue
            "no", "ytn", "нет" -> break
            else -> {println("Программа не может распознать ваш ответ. Выполнятеся аварийный выход"); break}
        }
    }
}

fun If4()
{
    println("If6.\n Даны два числа. Вывести большее из них.")
    println("Первое число: ")
    var a = readLine().toString().toDouble()
    println("Второе число: ")
    var b = readLine().toString().toDouble()
    if (a > b) {
        println("Большее число: $a")
    } else if (b < a) {
        println("Большее число: $b")
    } else if (a == b) {
        println("Оба числа равны.")
    } else {
        println("Программа тебя не понимает.")
    }
}

fun Begin13 ()
{
    ("\nBegin13\nДаны два круга с общим центром и радиусами R1 и R2 Найти площади этих кругов S1 и S2, а также площадь S3 кольца\n")
    print("Ввидите внешний радиус кольца:")
    var p = 3.14
    var R1 = readLine()!!.toDouble()
    print("Ввидите внутренний радиус:")
    var R2 = readLine()!!.toDouble()
    print("площадь 1 круга\n")
    var S1 = R1.pow(2)*p
    print(S1)
    print("\nплощадь 2 круга\n")
    var S2 = R2.pow(2)*p
    print(S2)
    print("\nплощадь кольца\n")
    var S3 = S1-S2
    print(S3)
}

fun Begin33()
{
    print("\nBegin33\nИзвестно, что X кг конфет стоит A рублей. Определить, сколько стоит 1 кг и Y кг этих же конфет\n")
    print("Ввидите кол-во кг конфет:\n")
    var X = readLine()!!.toDouble()
    print("Ввидите цену конфет:\n")
    var A = readLine()!!.toDouble()
    print("Цена 1 кг:")
    var kg1 = X/A
    print(kg1)
    print("\nВвидите 2 кол-во кг конфет\n")
    var Y = readLine()!!.toDouble()
    print("Цена 2 партии конфет:\n")
    var Yrub = kg1*Y
    print(Yrub)
}

fun Begin15()
{
    print("\nBegin15\nДана площадь S круга. Найти его диаметр D и длину L окружности,ограничивающей этот круг\n")
    var p = 3.14
    print("Ввидите площадь круга:")
    var S = readLine()!!.toDouble()
    print("Диаметр круга:")
    var D = 2*sqrt(S/p)
    print(D)
    print("Длинна окружности:")
    var R = D/2
    var L = 2*p*R
    print(L)
}

fun Integer19()
{
    print("Integer19\nС начала суток прошло N секунд (N — целое). Найти количество полных минут, прошедших с начала суток\nВвидите кол-во сек.")
    var s = readLine()!!.toInt()
    print("Полное кол-во минут:${s/60}")
}

fun Integer20()
{
    print("Integer20\nС начала суток прошло N секунд (N — целое). Найти количество полных часов, прошедших с начала суток\nВвидите кол-во сек.")
    var s = readLine()!!.toInt()
    print("Полное кол-во часов:${s/360}")
}

fun integer1()
{
    print("Введите расстояние в сантиметрах")
    var a = readLine()!!.toDouble()
    var b = a/100
    print("Количество полных метров= $b")
}

fun begin25()
{
    print("Введите значение переменной х:")
    var x = readLine()!!.toDouble()
    var y = 3*x.pow(6)-6*x.pow(2)-7
    print("Значение выражения равно : $y")

}

fun begin9 ()
{
    print("Введите два неотрицательных числа:")
    var a = readLine()!!.toDouble()
    var b = readLine()!!.toDouble()
    var c = sqrt(a*b)
    print("Среднее геометрическое этих двух чисел равно: $c")
}

fun If8()
{
    println("If8.\nДаны два числа. Вывести вначале большее, а затем меньшее из них.")
    println("Первое число: ")
    var a = readLine().toString().toDouble()
    println("Второе число: ")
    var b = readLine().toString().toDouble()
    if (a > b)
    {
        println("Большее число: $a")
        println("Меньшее число: $b")
    }
    else if (b < a)
    {
        println("Большее число: $b")
        println("Меньшее число: $a")
    }
    else if (a == b)
    {
        println("Оба числа равны.")
    }
    else
    {
        println("Программа тебя не понимает.")
    }
}

fun If6()
{
    println("If6.\n Даны два числа. Вывести большее из них.")
    println("Первое число: ")
    var a = readLine().toString().toDouble()
    println("Второе число: ")
    var b = readLine().toString().toDouble()
    if (a > b)
    {
        println("Большее число: $a")
    }
    else if (b < a)
    {
        println("Большее число: $b")
    }
    else if (a == b)
    {
        println("Оба числа равны.")
    }
    else
    {
        println("Программа тебя не понимает.")
    }
}

fun For9()
{
    var n = 0
    while(n!=1)
    {
        println("Вводятся два целых числа A и B (A < B). Находит сумму квадратов всех целых\n" +
                "чисел от A до B включительно.")
        print("A: ");
        var a = readLine()!!.toInt()
        print("B: ");
        var b = readLine()!!.toInt()
        var summa = 0
        if (a < b)
        {
            for (i in a..b)
            {
                summa += i * i
                println(i * i)
            }
            println("Сумма чисел от $a до $b равняется")
            println(summa)
        }
        else
        {
            println("Внимательнее читайте условие")
            break
        }

        println("Хотите продолжить? [да/нет]")
        print("Ответ: "); var answer = readLine()!!.toString().toLowerCase()

        when(answer)
        {
            "lf","да","yes" -> continue
            "no", "ytn", "нет" -> break
            else -> {println("Программа не может распознать ваш ответ. Выполнятеся аварийный выход"); break}
        }
    }
}

fun For10_while()
{
    var n = 0
    while (n!=1)
    {
        print("Введите целое число: ");var number = readLine()!!.toInt()
        var summa = 0.0
        var i = 1
        var counter_double = 0.0
        while(i <= number)
        {
            counter_double=i.toDouble()
            summa = summa + 1/counter_double

            println(summa)
            i++
        }

        println("Хотите продолжить? [да/нет]")
        print("Ответ: "); var answer = readLine()!!.toString().toLowerCase()

        when(answer)
        {
            "lf","да","yes" -> continue
            "no", "ytn", "нет" -> break
            else -> {println("Программа не может распознать ваш ответ. Выполнятеся аварийный выход"); break}
        }
    }
}

fun For10()
{
    var n = 0
    while(n!= 1)
    {
        print("Введите целое число: ");var number = readLine()!!.toInt()
        var summa = 0.0
        var counter_double = 0.0
        for(i in 1..number)
        {
            counter_double=i.toDouble()
            summa = summa + 1/counter_double

            println(summa)
        }

        println("Хотите продолжить? [да/нет]")
        print("Ответ: "); var answer = readLine()!!.toString().toLowerCase()

        when(answer)
        {
            "lf","да","yes" -> continue
            "no", "ytn", "нет" -> break
            else -> {println("Программа не может распознать ваш ответ. Выполнятеся аварийный выход"); break}
        }
    }
}

fun For8()
{
    var n = 0
    while(n!= 1)
    {
        println("Вводятся два целых числа A и B (A < B). Находит произведение всех целых\n" +
                "чисел от A до B включительно.")
        print("A: "); var a = readLine()!!.toInt()
        print("B: "); var b = readLine()!!.toInt()
        var proizv = 1
        for(i in a..b)
        {
            proizv = proizv * i
            println(proizv)
        }

        println("Хотите продолжить? [да/нет]")
        print("Ответ: "); var answer = readLine()!!.toString().toLowerCase()

        when(answer)
        {
            "lf","да","yes" -> continue
            "no", "ytn", "нет" -> break
            else -> {println("Программа не может распознать ваш ответ. Выполнятеся аварийный выход"); break}
        }
    }
}

fun For7()
{
    var n = 0
    while(n!= 1)
    {
        println("Вводятся два целых числа A и B (A < B). Находит сумму всех целых чисел\n" +
                "от A до B включительно.")
        print("A: "); var a = readLine()!!.toInt()
        print("B: "); var b = readLine()!!.toInt()
        var summa = 0
        for(i in a..b)
        {
            summa += i
            println(summa)
        }

        println("Хотите продолжить? [да/нет]")
        print("Ответ: "); var answer = readLine()!!.toString().toLowerCase()

        when(answer)
        {
            "lf","да","yes" -> continue
            "no", "ytn", "нет" -> break
            else -> {println("Программа не может распознать ваш ответ. Выполнятеся аварийный выход"); break}
        }
    }
}

fun For2()
{
    var n = 0
    while(n!= 1)
    {
        println("Вводятся два целых числа A и B (A < B). Выводится в порядке возрастания все\n" +
                "целые числа, расположенные между A и B (включая сами числа A и B), а\n" +
                "также количество N этих чисел.")
        print("A: "); var a = readLine()!!.toInt()
        print("B: "); var b = readLine()!!.toInt()
        var counter = 0
        for(i in a..b)
        {
            println(i)
            counter += 1
        }
        println("Количество чисел составляет $counter")

        println("Хотите продолжить? [да/нет]")
        print("Ответ: "); var answer = readLine()!!.toString().toLowerCase()

        when(answer)
        {
            "lf","да","yes" -> continue
            "no", "ytn", "нет" -> break
            else -> {println("Программа не может распознать ваш ответ. Выполнятеся аварийный выход"); break}
        }
    }
}

fun For3()
{
    var n = 0
    while(n!= 1)
    {
        println("Вводятся два целых числа A и B (A < B). Выводится в порядке убывания все\n" +
                "целые числа, расположенные между A и B (не включая числа A и B), а\n" +
                "также количество N этих чисел.")
        print("A: "); var a = readLine()!!.toInt()
        print("B: "); var b = readLine()!!.toInt()
        var counter = 0
        for(i in b downTo a step 1)
        {
            if(i != a && i != b)
            {
                println(i)
                counter += 1
            }
        }
        println("Количество чисел составляет $counter")

        println("Хотите продолжить? [да/нет]")
        print("Ответ: "); var answer = readLine()!!.toString().toLowerCase()

        when(answer)
        {
            "lf","да","yes" -> continue
            "no", "ytn", "нет" -> break
            else -> {println("Программа не может распознать ваш ответ. Выполнятеся аварийный выход"); break}
        }
    }
}

fun For4()
{
    var n = 0
    while(n!=1)
    {
        println("Вводится вещественное число — цена 1 кг конфет. Выводится стоимость 1,\n" +
                "2, . . . , 10 кг конфет.\n")
        print("Число: "); var number = readLine()!!.toInt()
        for(i in 1..10)
        {
            println("Цена $i кг конфет: ${number * i}")
        }

        println("Хотите продолжить? [да/нет]")
        print("Ответ: "); var answer = readLine()!!.toString().toLowerCase()

        when(answer)
        {
            "lf","да","yes" -> continue
            "no", "ytn", "нет" -> break
            else -> {println("Программа не может распознать ваш ответ. Выполнятеся аварийный выход"); break}
        }
    }
}

fun For11()
{
    val n = 0
    while (n != 1)
    {
        print("Введите целое положительное число N: "); var N = readLine()!!.toInt()

        if (N > 0)
        {
            var summa = 0

            for (i in 0..N)
            {
                summa += (N + i) * (N + i)
            }
            println("Сумма равняется $summa")
        }
        else
        {
            println("Внимательнее читайте условие")
            break
        }

        println("Хотите продолжить? [да/нет]")
        print("Ответ: "); var answer = readLine()!!.toString().toLowerCase()

        when(answer)
        {
            "lf","да","yes" -> continue
            "no", "ytn", "нет" -> break
            else -> {println("Программа не может распознать ваш ответ. Выполнятеся аварийный выход"); break}
        }
    }
}

fun For15()
{
    val n = 0
    while(n != 1)
    {
        print("Введите целое положительное число N: "); var N = readLine()!!.toInt()
        print("Введите целое положительное число A: "); var A = readLine()!!.toInt()

        if (N > 0)
        {
            var stepen = 1

            for (i in 1..N)
            {
                stepen *= A
            }
            println("$A в степени $N равняется $stepen")
        }
        else
        {
            println("Внимательнее читайте условие")
            break
        }


        println("Хотите продолжить? [да/нет]")
        print("Ответ: "); var answer = readLine()!!.toString().toLowerCase()

        when(answer)
        {
            "lf","да","yes" -> continue
            "no", "ytn", "нет" -> break
            else -> {println("Программа не может распознать ваш ответ. Выполнятеся аварийный выход"); break}
        }
    }
}

fun For17()
{
    val n = 0
    while(n != 1)
    {
        print("Введите целое положительное число N: "); var N = readLine()!!.toInt()
        print("Введите целое положительное число A: "); var A = readLine()!!.toInt()

        if (N > 0)
        {
            var summa = 1
            for (i in 1..N)
            {
                summa += A
                A = A * A
            }

            println("Сумма равняется $summa")
        }
        else
        {
            println("Внимательнее читайте условие")
            break
        }

        println("Хотите продолжить? [да/нет]")
        print("Ответ: "); var answer = readLine()!!.toString().toLowerCase()

        when(answer)
        {
            "lf","да","yes" -> continue
            "no", "ytn", "нет" -> break
            else -> {println("Программа не может распознать ваш ответ. Выполнятеся аварийный выход"); break}
        }
    }
}

fun For19()
{
    val n = 0
    while(n != 1)
    {
        print("Введите целое положительное число N: "); var N = readLine()!!.toLong()
        var fact :Long = 1
        var i_1 :Long = 1

        if (N > 0)
        {
            for (i in 1..N)
            {
                i_1 = i.toLong()
                fact *= i_1
            }

            println("$N! равняется $fact")
        }
        else
        {
            println("Внимательнее читайте условие")
            break
        }

        println("Хотите продолжить? [да/нет]")
        print("Ответ: "); var answer = readLine()!!.toString().toLowerCase()

        when(answer)
        {
            "lf","да","yes" -> continue
            "no", "ytn", "нет" -> break
            else -> {println("Программа не может распознать ваш ответ. Выполнятеся аварийный выход"); break}
        }
    }
}

fun For37()
{
    val n = 0
    while( n!= 1)
    {
        print("Введите целое положительное число N: "); var N = readLine()!!.toLong()

        if (N > 0)
        {
            var summa :Long = 0
            var i_1 :Long = 1

            for (i in 1..N)
            {
                i_1 = i.toLong()
                summa = summa + i_1 * i_1
            }

            println("Сумма равняется $summa")
        }
        else
        {
            println("Внимательнее читайте условие")
            break
        }

        println("Хотите продолжить? [да/нет]")
        print("Ответ: "); var answer = readLine()!!.toString().toLowerCase()

        when(answer)
        {
            "lf","да","yes" -> continue
            "no", "ytn", "нет" -> break
            else -> {println("Программа не может распознать ваш ответ. Выполнятеся аварийный выход"); break}
        }
    }
}

fun For38()
{
    val n = 0
    while( n!= 1)
    {
        print("Введите целое положительное число N: "); var N = readLine()!!.toLong()

        if (N > 0)
        {
            var summa :Long = 0
            var i_1 :Long = 1
            var N_1  = N + 1

            for (i in 1..N)
            {
                i_1 = i.toLong()
                summa = summa + i_1 * (N_1 - i)
            }

            println("Сумма равняется $summa")
        }
        else
        {
            println("Внимательнее читайте условие")
            break
        }

        println("Хотите продолжить? [да/нет]")
        print("Ответ: "); var answer = readLine()!!.toString().toLowerCase()

        when(answer)
        {
            "lf","да","yes" -> continue
            "no", "ytn", "нет" -> break
            else -> {println("Программа не может распознать ваш ответ. Выполнятеся аварийный выход"); break}
        }
    }
}

fun For39()
{
    val n = 0
    while( n!= 1)
    {
        print("Введите целое положительное число A: "); var A = readLine()!!.toInt()
        print("Введите целое положительное число B, большее чем число A: "); var B = readLine()!!.toInt()
        if (A < B)
        {
            for(i in A..B+1)
            {
                for(j in 1..i)
                {
                    println(i)
                }
            }
        }
        else
        {
            println("Внимательнее читайте условие")
            break
        }

        println("Хотите продолжить? [да/нет]")
        print("Ответ: "); var answer = readLine()!!.toString().toLowerCase()

        when(answer)
        {
            "lf","да","yes" -> continue
            "no", "ytn", "нет" -> break
            else -> {println("Программа не может распознать ваш ответ. Выполнятеся аварийный выход"); break}
        }
    }
}

fun For40()
{
    val n = 0
    while( n!= 1)
    {
        print("Введите целое положительное число A: "); var A = readLine()!!.toInt()
        print("Введите целое положительное число B, большее чем число A: "); var B = readLine()!!.toInt()

        if (A < B)
        {
            for(i in A..B+1)
            {
                for(j in 0..i)
                {
                    println(i)
                }
            }
        }
        else
        {
            println("Внимательнее читайте условие")
            break
        }

        println("Хотите продолжить? [да/нет]")
        print("Ответ: "); var answer = readLine()!!.toString().toLowerCase()

        when(answer)
        {
            "lf","да","yes" -> continue
            "no", "ytn", "нет" -> break
            else -> {println("Программа не может распознать ваш ответ. Выполнятеся аварийный выход"); break}
        }
    }
}

fun For36()
{
    val n = 0
    while( n!= 1)
    {
        print("Введите целое положительное число N: "); var N = readLine()!!.toLong()
        print("Введите целое положительное число K: "); var K = readLine()!!.toLong()
        var summa :Long = 0
        var n :Long = 0


        if (N > 0 && K > 0)
        {
            for(i in 1..N)
            {
                for(j in 1..K)
                {
                    n = i * i
                }

                summa += n
            }
            println("Сумма равняется $summa")
        }
        else
        {
            println("Внимательнее читайте условие")
            break
        }

        println("Хотите продолжить? [да/нет]")
        print("Ответ: "); var answer = readLine()!!.toString().toLowerCase()

        when(answer)
        {
            "lf","да","yes" -> continue
            "no", "ytn", "нет" -> break
            else -> {println("Программа не может распознать ваш ответ. Выполнятеся аварийный выход"); break}
        }
    }
}