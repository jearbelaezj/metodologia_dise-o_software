package api.hotel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import api.hotel.model.Huesped;
import api.hotel.repository.HuespedeRepository;

@Service

public class HuespedService {
    @Autowired
    private HuespedeRepository huespedRepository;

    //mostrar huesped
    public List<Huesped> getAllHuesped() {
        return huespedRepository.findAll();
    }
    //Crear huesped
    public Huesped createHuesped(Huesped huesped) {
        return huespedRepository.save(huesped);
    }
    //Editar huesped
      public Huesped updateHuesped(Huesped huesped) {
        return huespedRepository.save(huesped);
    }
    //Eliminar huesped
    public void deleteHuespedbyid(Long id) {
        huespedRepository.deleteById(id);
    }

}
