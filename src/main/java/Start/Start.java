package Start;

import Googlemap.FinalBean;

import static spark.Spark.get;
import static spark.Spark.port;

/**
 * Created by Henke on 2016-03-11.
 */
public class Start {
private static FinalBean finalBean;
        public static void main(String[] args) {
            JavaToJson json = new JavaToJson();
            port(2016);

            get("/hello", (req, res) -> "Hello World");

            get("/google", (req, res) -> {
                res.header("Access-Control-Allow-Origin", "*");
                res.type("text/json");
                return json.getJson("Malmö");
            });

            get("/city", (req, res) -> {
               return json.getJson("Malmö");
            });

    }
}

