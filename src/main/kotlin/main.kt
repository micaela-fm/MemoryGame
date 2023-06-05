//
//val SYMBOLS: String = "#%XO&"
//
//fun main() {
//    val pairs: List<Char> = (SYMBOLS+SYMBOLS).toList().shuffled()
//    println("pairs = $pairs")
//    println("Foram gerados ${SYMBOLS.length} pares aleatórios de símbolos.")
//    println("Vamos jogar!")
//    var places: List<Char> = allHiddenPairs(pairs)
//    println("places = $places")
//    var trys: Int = 0
//    do {
//        println("$trys: $places")
//        val first: Int = readPosition("primeira")
//        val second: Int = readPosition("segunda")
//        if ( isValidPositions(first, second, places) ) {
//            places = places.play(first, second, pairs)
//            trys++
//        } else println("Posições inválidas")
//    } while( ! isAllPairsShowed(places) )
////    println("$trys: $places")
////    println("Terminou o jogo usando $trys tentativas")
//}
//
