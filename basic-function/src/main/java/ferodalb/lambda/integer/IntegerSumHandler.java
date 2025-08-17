package ferodalb.lambda.integer;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import java.util.List;

public class IntegerSumHandler implements RequestHandler<List<Integer>, Integer> {

    @Override
    public Integer handleRequest(List<Integer> integers, Context context) {
        LambdaLogger logger = context.getLogger();
        if (integers == null || integers.isEmpty()){
            throw new IllegalArgumentException("List of integers must not be null or empty.");
        }
        logger.log("Summing list of size: " + integers.size() + "\n");
        return integers.stream().mapToInt(Integer::intValue).sum();
    }
}
