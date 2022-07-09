package pl.pospieszny.typer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.pospieszny.typer.entity.Team;

public interface TeamRepository extends JpaRepository<Team, Long> {
}
