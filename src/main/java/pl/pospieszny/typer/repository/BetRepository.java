package pl.pospieszny.typer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.pospieszny.typer.entity.Bet;

public interface BetRepository extends JpaRepository<Bet, Long> {
}
