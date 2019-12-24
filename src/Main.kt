fun main() {
    genPrimeNo2()
}

fun genPrimeNo2(){
    val primeNumbers = mutableListOf<Int>()

    var no = 2

    while (primeNumbers.size < 10005) {
        var flag = false
        for (i in 2..no / 2) { // condition for nonprime number
            if (no % i == 0) {
                flag = true
                break
            }
        }
        if (!flag) primeNumbers.add(no)

        no++
    }

    println("Size: ${primeNumbers.size}")
    println(primeNumbers)

    while (true) {
        print("Enter any number between 0 -10000 (default 0): ")
        val input = readLine()!!
        val outputList = mutableListOf<Int>()

        var myInput = input.toIntOrNull() ?: 0

        if (myInput > 10000) continue

        while (outputList.size < 5) {
            outputList.add(primeNumbers[myInput])
            myInput++
        }

        println("Output: ${outputList.joinToString().replace(" ", "").replace(",", "").take(5)}")
    }
}
