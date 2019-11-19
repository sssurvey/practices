package practices.di

import dagger.Component
import practices.questions.easy.FizzBuzz
import javax.inject.Singleton

@Singleton
@Component
interface AppComponent {

    fun provideFizzBuzz() : FizzBuzz

}