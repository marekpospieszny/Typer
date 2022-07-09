package pl.pospieszny.typer.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "bets")
public class Bet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User user;

    @ManyToOne
    private Game game;

    @NotNull
    private Integer firstTeamGoals;

    @NotNull
    private Integer secondTeamGoals;

}
