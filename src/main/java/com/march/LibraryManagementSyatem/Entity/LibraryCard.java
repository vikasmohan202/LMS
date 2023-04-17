package com.march.LibraryManagementSyatem.Entity;

import com.march.LibraryManagementSyatem.Enums.CardStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class LibraryCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private int cardNo;
    private String  Expirydate;
    @Enumerated(EnumType.STRING)
    CardStatus status;

    @OneToOne
    @JoinColumn
    Student student;

}
