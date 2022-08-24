package com.PaginaTurismoFinal.Repository;

import com.PaginaTurismoFinal.entity.Actividades;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActividadesRepository extends CrudRepository<Actividades, Long> {

}
