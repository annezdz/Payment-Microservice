package listener;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;
import streaming.CheckoutProcessor;

@Component
public class CheckoutCreatedListener {

    @StreamListener(CheckoutProcessor.INPUT)
    public void handler(){

    }
}
