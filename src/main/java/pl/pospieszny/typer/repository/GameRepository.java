package pl.pospieszny.typer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.pospieszny.typer.entity.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
}
