package practices.easy

import javax.inject.Inject
import javax.inject.Singleton

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
@Singleton
class FizzBuzz @Inject constructor() {

    fun getName() = "FizzBuzz"

    fun solve(inputNumber: Int) {
        when {
            inputNumber % 3 == 0 && inputNumber % 5 == 0 -> print("FizzBuzz")
            inputNumber % 3 == 0 -> print("Fizz")
            inputNumber % 5 == 0 -> print("Buzz")
            inputNumber < 1 || inputNumber > 100 -> throw Exception("Number out of range")
            else -> print(inputNumber.toString())
        }
    }

}