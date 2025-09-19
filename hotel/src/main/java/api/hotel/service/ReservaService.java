package api.hotel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import api.hotel.model.Reserva;
import api.hotel.repository.ReservaRepository;

@Service
public class ReservaService{
    @Autowired
    private ReservaRepository reservaRepository;

    //mostrar reserva
    public List<Reserva> getAllHuesped() {
        return reservaRepository.findAll();
    }
    //Crear reserva
    public Reserva createHuesped(Reserva reserva) {
        return reservaRepository.save(reserva);
    }
    //Editar reserva
      public Reserva updateHuesped(Reserva reserva) {
        return reservaRepository.save(reserva);
    }
    //Eliminar reserva
    public void deleteHuespedbyid(Long id) {
        reservaRepository.deleteById(id);
    }

}