package org.gabriel.academico.model;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.gabriel.academico.model.enums.TipoTelefone;

import javax.persistence.Embeddable;
import javax.persistence.Enumerated;

/**
 * @author daohn on 22/08/2020
 * @project EstudoDeCaso
 */
@Embeddable @NoArgsConstructor @Getter
@ToString @EqualsAndHashCode
public class Telefone implements ValueObject {
    @NonNull  @Setter
    private String numero;
    @NonNull @Setter @Enumerated
    private TipoTelefone tipo;

    @Builder
    public Telefone(String numero, TipoTelefone tipo) {
        this.numero = numero;
        this.tipo = tipo;
    }
}
