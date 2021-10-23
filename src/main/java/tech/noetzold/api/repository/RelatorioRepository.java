package tech.noetzold.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tech.noetzold.api.models.Relatorio;

public interface RelatorioRepository extends JpaRepository<Relatorio, Long>{
	Relatorio findById(long id);

}
