package practices.easy

import javax.inject.Inject
/*
* 000-FizzBuzz
*
* Question:
* For the numbers from 1 to 100,
*
* - If the number is a multiple of 3, print "Fizz" instead of the number.
* - If the number is a multiple of 5, print "Buzz" instead of the number.
* - If the number is a multiple of 15, print "FizzBuzz" instead of the number.
* - Otherwise, print the number itself.
*
* Each output should be followed by a new line.
*
* */
class FizzBuzz @Inject constructor() {

    fun solve(inputNumber: Int) {
        when {
            inputNumber % 3 == 0 && inputNumber % 5 == 0 -> println("FizzBuzz")
            inputNumber % 3 == 0 -> println("Fizz")
            inputNumber % 5 == 0 -> println("Buzz")
            else -> println(inputNumber.toString())
        }
    }

}