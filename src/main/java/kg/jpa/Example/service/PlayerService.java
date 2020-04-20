package kg.jpa.Example.service;

import kg.jpa.Example.entity.Player;
import kg.jpa.Example.entity.Team;

import java.awt.*;
import java.util.List;

public interface PlayerService {
    Player create(Player player);
    Player getByName(String name);
    List<Player> getAllName(String name);
    List<Player> getAllTeam (Team team);
    void getAllActivAndAge (String activ, Integer age);
}
