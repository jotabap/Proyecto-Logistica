package com.jb.api.logistica.repositorio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.jb.api.logistica.entidad.Terrestre;

@Repository
public interface TerrestreRepository extends JpaRepository <Terrestre,Integer> {

}
