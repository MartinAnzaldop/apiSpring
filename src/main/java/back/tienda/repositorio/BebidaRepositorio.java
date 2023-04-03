package back.tienda.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import back.tienda.modelo.Bebida;

@Repository
public interface BebidaRepositorio extends JpaRepository<Bebida, Long> {
       
}
