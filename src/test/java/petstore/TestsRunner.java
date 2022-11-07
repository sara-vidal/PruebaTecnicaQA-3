package petstore;

import com.intuit.karate.junit5.Karate;

class TestsRunner {

    @Karate.Test
    Karate testAll() {
        return Karate.run().relativeTo(getClass());
    }
    
}
