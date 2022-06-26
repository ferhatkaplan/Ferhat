package com.ecodation.project.mvcdata;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

//lombok
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

//Entity
@Entity
@Table(name="customer")
public class _2_CustomerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id",updatable = false)
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="surname")
    private String surname;

    @Column(name="email")
    private String email;

    @Column(name="password")
    private String password;

    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    @Column(name="created_date")
    private Date createdDate;
}
