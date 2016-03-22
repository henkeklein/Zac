package Start;

import static spark.Spark.get;
import static spark.Spark.port;

/**
 * Created by Henke on 2016-03-11.
 */
public class Start {

        public static void main(String[] args) {
            JavaToJson json = new JavaToJson();
            port(2016);

            get("/hello", (req, res) -> "Hello World");

            get("/map", (req, res) -> {
                res.header("Access-Control-Allow-Origin", "*");
                res.type("text/json");
                return json.getJson("Malmö");
            });

    }
}

