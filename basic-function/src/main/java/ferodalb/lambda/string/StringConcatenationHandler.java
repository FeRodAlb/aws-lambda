package ferodalb.lambda.string;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import java.util.List;

public class StringConcatenationHandler implements RequestHandler<List<String>, String> {

    @Override
    public String handleRequest(List<String> strings, Context context) {
        LambdaLogger logger = context.getLogger();
        if (strings == null || strings.isEmpty()){
            throw new IllegalArgumentException("List of string must not be null or empty.");
        }
        logger.log("Concatenating list of size: " + strings.size() + "\n");
        return String.join(" ", strings);
    }
}
