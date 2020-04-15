package mx.tec.lab.rest;

import mx.tec.lab.dto.Greeeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingRestController {

    private static final String template = "Hello, %s!";
    private static final String goodbyeTemplate = "Goodbye, %s!";
    private final AtomicLong counter = new AtomicLong();
    private final AtomicLong goodbyeCounter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeeting greeeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeeting(counter.incrementAndGet(), String.format(template, name));
    }

    @RequestMapping("/goodbye")
    public Greeeting goodbye(@RequestParam(value = "name", defaultValue = "see you later") String name) {
        return new Greeeting(goodbyeCounter.incrementAndGet(), String.format(goodbyeTemplate, name));
    }

}
