package demoapplication.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/demo")
public class DemoApplicationController {
	
	@GetMapping("hi")
	public ResponseEntity<String> hi() {
		return new ResponseEntity<String>("hi msg CI CD successfully implemented",HttpStatus.OK);
	}		
}
