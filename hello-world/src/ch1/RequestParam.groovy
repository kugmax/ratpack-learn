package ch1

@Grab('io.ratpack:ratpack-groovy:1.3.3')
import static ratpack.groovy.Groovy.ratpack
ratpack {
    handlers {
        get {
            def name = request.queryParams.name ?: "Guest"
            response.send "Hello, $name!"
        }
    }
}