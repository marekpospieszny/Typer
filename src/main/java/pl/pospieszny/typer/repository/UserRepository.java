package pl.pospieszny.typer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.pospieszny.typer.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
