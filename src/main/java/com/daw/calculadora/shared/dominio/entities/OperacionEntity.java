package com.daw.calculadora.shared.dominio.entities;
import com.daw.calculadora.shared.dominio.enums.TipoOperacion;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Builder // Genera un constructor más flexible (patrón Builder)
@NoArgsConstructor
@AllArgsConstructor
@Data
public class OperacionEntity {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;

        private Integer operando1;
        private Integer operando2;
        private String tipoOperacion;
        private Integer resultado;




    }
