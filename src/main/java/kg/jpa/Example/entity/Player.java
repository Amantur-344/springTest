package kg.jpa.Example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "player")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "full_name",nullable = false)
    private FullName fullName;
    @Column(name = "age",nullable = false)
    private Integer age;
    @Column(name = "activ",nullable = false)
    private String activ;
    @OneToOne
    @JoinColumn(name = "team_id",nullable = false)
    private Team team;
}
