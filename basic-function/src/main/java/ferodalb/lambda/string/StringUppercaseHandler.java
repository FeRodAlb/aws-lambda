package ferodalb.lambda.string;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class StringUppercaseHandler implements RequestHandler<String, String> {

    @Override
    public String handleRequest(String event, Context context) {
        LambdaLogger logger = context.getLogger();
        logger.log("Handling UPPERCASE event for input: " + event);
        if (event == null || event.trim().isEmpty()) {
            throw new IllegalArgumentException("Input string must not be null or empty.");
        }
        return event.toUpperCase();
    }
}
