package jammazwan.xad;

import org.apache.camel.builder.RouteBuilder;


public class XadRoutes extends RouteBuilder {


    @Override
    public void configure() throws Exception {
        from("file:../jammazwan.shared/src/main/resources/data/csv/?noop=true&fileName=name.csv").log("${body}");
    }
}
