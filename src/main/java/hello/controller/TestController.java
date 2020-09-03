package hello.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("/")
    public ResponseEntity<String> homeNoHeader() {
        return new ResponseEntity<>("Hello Chandan Docker World",HttpStatus.OK);
    }
  
    @RequestMapping("/404")
    public ResponseEntity<String> notFound() {
        return new ResponseEntity<>("Not Found",HttpStatus.NOT_FOUND);
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

}
