///**
// * Flips the elements into positions [p1] and [p2].
// * Showing them if they are hidden or hiding them if they are showing.
// * @receiver The current places
// * @param p1 A position to turn
// * @param p2 Another position to turn
// * @param pairs The original pairs
// * @return Places after turning
// */
//fun List<Char>.turnPlaces(p1: Int, p2: Int, pairs: List<Char>): List<Char> {
//    val newPlaces: List<Char> = this.map {
//        when (this.indexOf(it)) {
//            p1 -> pairs[p1]
//            p2 -> pairs[p2]
//            else -> this[indexOf(it)]
//        }
//    }
//    println("turnPlaces newPlaces = $newPlaces")
//    return newPlaces
//}