package entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "accounts")
@Entity
public class Account {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "account-holder-name")
    private String accountHolderName;
    private double balance;

}
