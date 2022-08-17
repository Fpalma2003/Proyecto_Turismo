package com.Pagina_Turismo.Pagina_Turismo.repository;

import com.Pagina_Turismo.Pagina_Turismo.entity.Actividades;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActividadesRepository extends CrudRepository<Actividades, Long> {

    Actividades findByNombre(String nombre);

}
