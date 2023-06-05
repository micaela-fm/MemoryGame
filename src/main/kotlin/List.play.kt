///**
// * Flips the two elements at positions [p1] and [p2].
// * If they do not form a pair, display them for 4 seconds and then hide.
// * @receiver Original places
// * @param p1 First position to flip.
// * @param p2 Second position to flip.
// * @param pairs The original pairs
// * @return The turned places if there was a pair or the original places if not.
// */
//fun List<Char>.play(p1: Int, p2: Int, pairs: List<Char>): List<Char> {
//    val turned = turnPlaces(p1, p2, pairs)
//    println("turned = $turned")
//    if (turned[p1] != turned[p2]) {
//        print(turned)
//        repeat(4) { print('.'); Thread.sleep(1000) }
//        print("\r                                                       \r")
//        return this
//    }
//    return turned
//}