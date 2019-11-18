/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package practices;

import practices.di.AppComponent;
import practices.di.DaggerAppComponent;

public class App {

    private AppComponent appComponent = DaggerAppComponent.builder().build();

    public String getGreeting() {
        return "Hello world.";
    }
    public AppComponent getAppComponent() {
        return appComponent;
    }

    public static void main(String[] args) {
        App app = new App();
        System.out.println(app.getGreeting());

        // Problems
        app.getAppComponent().provideFizzBuzz().solve(5);
    }
}