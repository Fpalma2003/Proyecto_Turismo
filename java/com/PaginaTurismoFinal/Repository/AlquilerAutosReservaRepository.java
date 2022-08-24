package com.PaginaTurismoFinal.Repository;

import com.PaginaTurismoFinal.entity.AlquilerAutosReserva;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlquilerAutosReservaRepository extends CrudRepository<AlquilerAutosReserva, Long> {

    @Query("SELECT p FROM AlquilerAutosReserva p WHERE p.cliente_autos LIKE %?1%")
    public List<AlquilerAutosReserva> findAllCliente(String palabraClave);
    
}
