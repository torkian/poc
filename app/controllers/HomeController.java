package controllers;

import play.mvc.*;
import play.Logger;

import views.html.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        return ok(index.render("Your new application is ready."));
    }

    public Result gatewayPost(String url) {
        boolean cloudEvent = false;
        // set to "/login?param=test" -- The full URI.
        String uriString = request().uri();
        // set to "example.com:9000" -- The host name from the request, with port (if specified by the client).
        String hostString = request().host();
        String fullurl = hostString + uriString;
        Logger.debug(fullurl);
        return ok("Got request " + request() + "!");
    }

    public Result gateway(String url) {
        boolean cloudEvent = false;
        // set to "/login?param=test" -- The full URI.
        String uriString = request().uri();
        // set to "example.com:9000" -- The host name from the request, with port (if specified by the client).
        String hostString = request().host();
        String fullurl = hostString + uriString;
        Logger.debug(fullurl);
        return ok("Got request " + request() + "!");

    }

}
