package com.ecommerce.games.entity;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Builder
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
public class CheckoutEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String code;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private String email;

    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.MERGE})
    private List<GamesEntity> games;

    @Column
    private String value;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        CheckoutEntity that = (CheckoutEntity) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
