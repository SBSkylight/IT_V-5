import kotlin.math.*

fun main()
{
    print("Добро пожаловать! Эта программа является решебником по задачнику Абрамяна на языке Kotlin\nВнутренний синтаксис(Begin1 - b1)\nСписок доступных задач:\nBegin12\n")
    print("Выберите задачу: "); var user_choise = readLine()
    when(user_choise)
    {
        "b12" -> Begin12()
        "b23" -> Begin23()
        else -> println("Такой задачи нет!")
    }
}

fun Begin12()//Михаил Розенталь
{
    print("\nBegin12\nДаны катеты прямоугольного треугольника a и b. Найти его гипотенузу и периметр P.\n")
    print("Введите катет а: ")
    var a = readLine()!!.toDouble()
    print("Введите катет b: ")
    var b = readLine()!!.toDouble()
    var c = sqrt(a.pow(2)+b.pow(2)) //sqrt(*выражение*) = (*выражение*).pow(0.5)
    var cpow = (a.pow(2)+b.pow(2)).pow(0.5)
    var P = a+b+c
    var Pcpow = a+b+cpow
    print("Гипотенуза с = $c \n Гипотенуза сpow = $cpow \n")
    print("Периметр = $P \n Периметр(pow) = $Pcpow \n")
}



fun Begin23()
{


}


//
//
//
//
//
//
//
//
//
//
//
//
//
///*
//fun main() {
//    var truePassword = "123456"
//
//    println("Введите пароль")
//    var userPass = readLine()
//
//    if (truePassword == userPass) {
//        println("Добро пожаловать!")
//    }
//    else {
//        println("Пароль неверный")
//    }
//}*/
//
//
//
//
////fun main()
////{
////    var Temperature_f = readLine()!!.toDouble()
////    var Tc = (Temperature_f-32)*5/9
////    print(Tc)
////
////}
////    print("Введите скорость первого автомобиля: ")
////    var V1 = readLine()!!.toDouble()
////    print("Введите скорость второго автомобиля: ")
////    var V2 = readLine()!!.toDouble()
////    print("Введите расстояние на момент начала рассчета: ")
////    var S_begin = readLine()!!.toDouble()
////    print("Время прошедшее со старта: ")
////    var T = readLine()!!.toDouble()
////    var S_final =  S_begin+V1*T+V2*T
////        print("Итоговый рассчет: $S_final")
//
//
////    var Week = readLine()!!.toInt()
////    var Year = readLine()!!.toInt()
//import kotlin.math.sqrt
////import kotlin.random.Random
////fun main()
////{
////    B1()
////    var a = Random.nextInt(1,8)
////
////
////
////}
//
//
//
////Что-то написал!!!
//// 123
////121233331212
////лол кек чебурек
////маинкрафт моя жизнь
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
////дима таранов     1
//
////00000000
////0  00  0
////00    00
////0 0000 0
////00000000
////маинкрафт
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
////ето мая точка, вы кто такие, я вас не звал, идите нахфиг) "ArtemKorol1999"
////fun Artem()
////{
////print("как дела")
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////}
//// здесь заканчиваются владения ArtemKorol1999 и вы вольны делать все что угодно
////как дела    а? "ЭТО МОИ СТРОЧКИ
//
//
////рита понасенко
//
//////integer 1
////  fun main() {
////    var a = readLine()!!.toInt()
////    var b:= Int
////    b = a / 100
////    print(b)
////}
//////fffff
////// integer 19
////    fun main(){
////        var N = readLine()!!.toInt()
////        var M: Int
////        M = N/60
////        print(M)
////
////    }
////// begin 2
////    fun main(){
////        var a = readLine()!!.toInt()
////        var S: Int
////        S = a*a
////        print(S)
////    }
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//fun B1()
//{
//    var a = 2
//    var P =4*a
//    print(P)
//
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
////import kotlin.math.abs
////
////Савелий Соломатов
////fun main() {
////    //Boolean 40
////    var yes = true;
////    var no = false;
////    print("Введите кординату где стоит конь по вертикали(от 1 до 8):")
////    var x1 = readLine()!!.toInt()
////    print("Введите кординату где стоит конь по горизонтали(от 1 до 8):")
////    var y1 = readLine()!!.toInt()
////    print("Введите кординату куда пойдёт конь по вертикали(от 1 до 8):")
////    var x2 = readLine()!!.toInt()
////    print("Введите кординату куда пойдёт конь по горизонтали(от 1 до 8):")
////    var y2 = readLine()!!.toInt()
////    var vertikal = abs (x1-x2)
////    var gorizontal = abs(y1-y2)
////    var hod = abs(x1-x2)+ abs(y1-y2)
////    print(yes.and((hod == 3 )&&((gorizontal==1)||(gorizontal==2))&&((vertikal==1)||(vertikal==2))))
////}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//////просто строчки (начало)
////fun begin1 () {
////    var a = readLine().toString().toDouble()
////    println(4*a)
////}
//
//
//
////fun begin2() {
////    var a = readLine().toString().toDouble()
////    println(a*a)
////}
//
//
//
////fun begin3() {
////    println("a: ")
////    var a = readLine().toString().toDouble()
////    println("b: ")
////    var b = readLine().toString().toDouble()
////    var S = a*b
////    var P = 2*(a+b)
////    println("S = $S")
////    println("P = $P")
////}
//
//
//
////fun begin4() {
////    println("d: ")
////    var d = readLine().toString().toDouble()
////    var pi = 3.14 //В качестве значения пи использовать 3.14
////    println(pi*d)
////}
//
//
//
////fun begin5() {
////    println("a: ")
////    var a = readLine().toString().toDouble()
////    var V = a.pow(3)
////    var S = 6*(a*a)
////    println("V = $V")
////    println("S = $S")
////}
//
//
//
////fun begin6() {
////    println("a: ")
////    var a = readLine().toString().toDouble()
////    println("b: ")
////    var b = readLine().toString().toDouble()
////    println("h: ")
////    var h = readLine().toString().toDouble()
////    var V = a*b*h
////    var S = 2*(a*b+h*b+a*h)
////    println("V = $V")
////    println("S = $S")
////}
//
//
//
////fun begin7() {
////    println("R: ")
////    var R = readLine().toString().toDouble()
////    var pi = 3.14 //В качестве значения пи использовать 3.14
////    var L = 2*pi*R
////    var S = pi*(R*R)
////    println("L = $L")
////    println("S = $S")
////}
//
//
//
////fun begin8() {
////    println("a: ")
////    var a = readLine().toString().toDouble()
////    println("b: ")
////    var b = readLine().toString().toDouble()
////    println((a+b)/2)
////}
//
//
////fun begin9() {
////    println("a: ")
////    var a = readLine().toString().toDouble()
////    println("b: ")
////    var b = readLine().toString().toDouble()
////    println(sqrt(a*b))
////}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//////просто строчки (конец)
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
