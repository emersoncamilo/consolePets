package br.com.adopets;

import br.com.adopets.client.ClientHttpConfiguration;
import br.com.adopets.service.PetService;

import java.io.IOException;

public class ListarPetsDoAbrigoCommand implements Command{

    @Override
    public void execute() {
        try {
            ClientHttpConfiguration client = new ClientHttpConfiguration();
            PetService petService = new PetService(client);

            petService.listarPetsDoAbrigo();
        } catch (IOException | InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
