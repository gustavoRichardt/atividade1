package main;

import model.controller.SistemaController;
import model.repository.ReservaRepository;
import model.repository.SalaRepository;
import model.repository.UsuarioRepository;
import model.service.ReservaService;
import model.service.SalaService;
import model.service.UsuarioService;
import model.view.MenuView;

public class Main {

    public static void main(String[] args) {

        UsuarioRepository usuarioRepository = new UsuarioRepository();
        SalaRepository salaRepository = new SalaRepository();
        ReservaRepository reservaRepository = new ReservaRepository();

        UsuarioService usuarioService =
                new UsuarioService(usuarioRepository);

        SalaService salaService =
                new SalaService(salaRepository);

        ReservaService reservaService =
                new ReservaService(
                        reservaRepository,
                        usuarioRepository,
                        salaRepository
                );

        SistemaController controller =
                new SistemaController(
                        usuarioService,
                        salaService,
                        reservaService
                );

        MenuView menu = new MenuView(controller);

        menu.iniciar();

    }

}