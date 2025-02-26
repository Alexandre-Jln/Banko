package com.banko.entities;

import com.banko.enums.AccountStatus;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

@Entity
@Data
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="type", discriminatorType = DiscriminatorType.INTEGER)
@JsonIgnoreProperties({"hibernateLazyInitializer"})

public abstract class CompteBancaire implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private double balance;
    @Column(nullable = false)
    private String numCompte;
    @Column(nullable = false)
    private String devis = "EURO";
    @Column(nullable = false)
    private AccountStatus status;
    private Date createdAt = new Date();
    @JoinColumn(nullable = false)
    @ManyToOne
    private Client client;
    @JsonBackReference
    @OneToMany(mappedBy = "compte")
    Collection<Operation> operations = new ArrayList<>();
}
