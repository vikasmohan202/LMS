package com.march.LibraryManagementSyatem.Entity;

import com.march.LibraryManagementSyatem.Enums.Department;
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
public class Student {

    @Id
    private int RollNo;
    @Enumerated(EnumType.STRING)
    private Department department;
    private String email;
  @OneToOne(mappedBy = "student",cascade = CascadeType.ALL)
    LibraryCard card;



















}
