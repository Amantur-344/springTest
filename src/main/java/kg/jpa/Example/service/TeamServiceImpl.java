package kg.jpa.Example.service;

import kg.jpa.Example.entity.Team;
        import kg.jpa.Example.repository.TeamRepository;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Service;

@Service
public class TeamServiceImpl implements TeamService {
    @Autowired
    private TeamRepository teamRepository;
    @Override
    public Team create(Team team) {
        return teamRepository.save(team);
    }
}



