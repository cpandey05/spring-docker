package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

    @RequestMapping("/")
    public String home() {
        return "Hello Chandan Docker World";
    }
    @RequestMapping("/test")
    public String hometest() throws InterruptedException {
        Thread.sleep(1000);
        return "slept for a sec";
    }
    @RequestMapping("/heavy")
    public String homecpu() throws InterruptedException {
        long start=System.currentTimeMillis();
        for (long i = 0; i < 2000000000; i++) {

        }
        for (long i = 0; i < 2000000000; i++) {

        }
        long end=System.currentTimeMillis();
        return "some CPU work ...done in "+(start-end)+" milli secs";
    }
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
