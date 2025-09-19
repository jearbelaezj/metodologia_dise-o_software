package api.hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import api.hotel.model.Reserva;

public interface ReservaRepository extends JpaRepository<Reserva, Long> {

}
