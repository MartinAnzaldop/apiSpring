package back.tienda.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import back.tienda.modelo.Bebida;
import back.tienda.repositorio.BebidaRepositorio;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin(origins = "*")
public class BebidaControlador {
      
	@Autowired
	private BebidaRepositorio repositorio;

	@GetMapping("/bebidas")
	public List<Bebida> listarTodasLasBebidas() {
		return repositorio.findAll();
	}
	
	
	@PostMapping("/bebidas")
	public Bebida guardarBebida(@RequestBody Bebida bebida) {
		return repositorio.save(bebida);
	}

}
