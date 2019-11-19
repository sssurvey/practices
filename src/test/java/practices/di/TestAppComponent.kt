package practices.di

import dagger.Component
import practices.questions.easy.FizzBuzz
import javax.inject.Singleton

@Singleton
@Component
interface TestAppComponent {

    fun provideFizzBuzz() : FizzBuzz

}