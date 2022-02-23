package es.fpdual.restLayerForCalculatorSoap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("calculator/")
public class Controller {

	@Autowired
	private Service service;

	@GetMapping("add/{a}/{b}")
	public ResponseEntity<?> add(@PathVariable int a, @PathVariable int b) {
		return new ResponseEntity<>(this.service.getClient().add(a, b), HttpStatus.OK);
	}

	@GetMapping("subtract/{a}/{b}")
	public ResponseEntity<?> subtract(@PathVariable int a, @PathVariable int b) {
		return new ResponseEntity<>(this.service.getClient().subtract(a, b), HttpStatus.OK);
	}

	@GetMapping("multiply/{a}/{b}")
	public ResponseEntity<?> multiply(@PathVariable int a, @PathVariable int b) {
		return new ResponseEntity<>(this.service.getClient().multiply(a, b), HttpStatus.OK);
	}

	@GetMapping("divide/{a}/{b}")
	public ResponseEntity<?> divide(@PathVariable int a, @PathVariable int b) {
		return new ResponseEntity<>(this.service.getClient().divide(a, b), HttpStatus.OK);
	}

}
