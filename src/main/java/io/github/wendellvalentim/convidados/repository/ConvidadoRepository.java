package io.github.wendellvalentim.convidados.repository;

import io.github.wendellvalentim.convidados.model.Convidado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConvidadoRepository extends JpaRepository<Convidado, String> {
}
