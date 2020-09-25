package hello.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("/")
    public ResponseEntity<String> homeNoHeader() {
    	String configKey1=System.getenv().getOrDefault("CONFIG_KEY1", "CONFIG_KEY1 -- value not set");
    	String configKey2=System.getenv().getOrDefault("CONFIG_KEY2", "CONFIG_KEY2 -- value not set");
    	String secretKey1=System.getenv().getOrDefault("SECRET_KEY1", "SECRET_KEY1 -- value not set");
    	String secretKey2=System.getenv().getOrDefault("SECRET_KEY2", "SECRET_KEY2 -- value not set");
        return new ResponseEntity<>("Hello Chandan Docker World :: config key 1 :"+configKey1+" config key 2 :"+ configKey2+" secret key 1 :"+ secretKey1+" secret key 2 :"+ secretKey2,HttpStatus.OK);
    }
    @RequestMapping("/try")
    public String test() {
        return "Hello Chandan Docker World ::";
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
