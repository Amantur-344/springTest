package kg.jpa.Example.service;

import kg.jpa.Example.entity.Player;
import kg.jpa.Example.entity.Team;
import kg.jpa.Example.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerServiceImpl implements PlayerService {
    @Autowired
    private PlayerRepository playerRepository;
    @Override
    public Player create(Player player) {
        return playerRepository.save(player);
    }

    @Override
    public Player getByName(String name) {
        return playerRepository.;
    }

    @Override
    public List<Player> getAllName(String name) {
        return null;
    }

    @Override
    public List<Player> getAllTeam(Team team) {
        return null;
    }

    @Override
    public void getAllActivAndAge(String activ, Integer age) {

    }
}
