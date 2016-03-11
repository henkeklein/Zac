package Start;

import static spark.Spark.*;
/**
 * Created by Henke on 2016-03-11.
 */
public class Start {

        public static void main(String[] args) {
            port(2016);
            get("/hello", (req, res) -> "Hello World");
        }
}

