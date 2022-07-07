package pl.pospieszny.typer.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "games")
@Data
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Team firstTeam;

    @ManyToOne
    private Team secondTeam;

    @NotNull
    private Integer firstTeamGoals;

    @NotNull
    private Integer secondTeamGoals;

}
