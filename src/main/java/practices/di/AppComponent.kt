package practices.di

import dagger.Component
import practices.easy.FizzBuzz

@Component
interface AppComponent {

    fun provideFizzBuzz() : FizzBuzz

}