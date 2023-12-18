package entities.apirest;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "clientes")
public class Cliente extends Pessoa implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "historico")
    private String historico;

    @Column(name = "saldo_disponivel")
    private Double saldoDisponivel;

    public Cliente() {
    }

    public Cliente(String historico, Double saldoDisponivel) {
        this.historico = historico;
        this.saldoDisponivel = saldoDisponivel;
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

    public Double getSaldoDisponivel() {
        return saldoDisponivel;
    }

    public void setSaldoDisponivel(Double saldoDisponivel) {
        this.saldoDisponivel = saldoDisponivel;
    }
}
