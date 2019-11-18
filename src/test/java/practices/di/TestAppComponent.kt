package practices.di

import dagger.Component
import practices.easy.FizzBuzz

@Component
interface TestAppComponent {

    fun provideFizzBuzz() : FizzBuzz

}