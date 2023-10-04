package com.all4land.asd.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class intent_entity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long iid;

    private String intent_name;

}
